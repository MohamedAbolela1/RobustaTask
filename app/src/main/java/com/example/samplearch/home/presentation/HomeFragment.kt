package com.example.samplearch.home.presentation


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.samplearch.base.BaseFragment
import com.example.samplearch.databinding.FragmentHomeBinding
import com.example.samplearch.home.domain.model.PhotoItem
import com.example.samplearch.home.presentation.adapter.ProductsAdapter
import com.example.samplearch.model.ViewState
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

class HomeFragment : BaseFragment<FragmentHomeBinding>() {
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentHomeBinding
        get() = FragmentHomeBinding ::inflate


    private val mainViewModel by activityViewModels<MainViewModel>()
    private lateinit var productsAdapter: ProductsAdapter

    override fun setup() {
        setupRecyclerView()
        initViewModel()
        setListeners()
    }

    private fun setListeners() {
        binding.btnAddTask.setOnClickListener {
            navigateTo(HomeFragmentDirections.actionFragmentHomeToFragmentAddNewPhoto())
        }
    }

    private fun setupRecyclerView() {
        productsAdapter = ProductsAdapter(::onITemClicked)
        with(binding.rvProducts) {
            adapter = productsAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }
    }

    private fun onITemClicked(image : String?){
        navigateTo(HomeFragmentDirections.actionFragmentHomeToFragmentFullScreen(image))
    }

    private fun initViewModel() {
        mainViewModel.getTasksList()
            .onEach(::onTasksListStateRetrieved)
            .launchIn(lifecycleScope)
    }

    private fun onTasksListStateRetrieved(status: ViewState<MutableList<PhotoItem>>) {
        when (status) {
            is ViewState.Success -> onTaskListSuccess(status.data)
            is ViewState.Error -> status.errorTypes.errorMessage?.let { onTasksListError(it.getMessage(requireContext())) }
        }
    }

    private fun onTaskListSuccess(tasksList: MutableList<PhotoItem>) {
        productsAdapter.insertAll(tasksList)
    }

    private fun onTasksListError(errorMessage: String) {
        binding.tvError.visibility = View.VISIBLE
        binding.tvError.text = errorMessage
    }
}