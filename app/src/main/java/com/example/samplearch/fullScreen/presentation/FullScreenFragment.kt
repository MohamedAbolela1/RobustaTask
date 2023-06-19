package com.example.samplearch.fullScreen.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.samplearch.R
import com.example.samplearch.base.BaseFragment
import com.example.samplearch.databinding.FragmentFullScreenBinding
import com.example.samplearch.utils.ui.LoadImage


class FullScreenFragment : BaseFragment<FragmentFullScreenBinding>() {
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentFullScreenBinding
        get() = FragmentFullScreenBinding ::inflate

    private val args : FullScreenFragmentArgs by navArgs()

    override fun setup() {
        setToolbar(
            mToolbar = binding.toolbarDetails.toolbar,
            navigationIconDrawable = R.drawable.ic_back
        )

        LoadImage.loadFestivalImage(requireContext(),args.imageItem,binding.imgProduct)
    }

}