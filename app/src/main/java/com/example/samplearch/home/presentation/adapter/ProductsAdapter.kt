package com.example.samplearch.home.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.samplearch.base.BaseAdapter
import com.example.samplearch.base.BaseViewHolder
import com.example.samplearch.databinding.ItemProductBinding
import com.example.samplearch.home.domain.model.PhotoItem
import com.example.samplearch.utils.ui.LoadImage


class ProductsAdapter(
    private val onProductItemClicked: (item: String?) -> Unit
) : BaseAdapter<PhotoItem>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseViewHolder<PhotoItem> {
        val binding =
            ItemProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FestivalViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BaseViewHolder<PhotoItem>, position: Int) {
        holder.onBind(data[position])
    }

    override fun getItemCount(): Int = data.size

    inner class FestivalViewHolder(private val binding: ItemProductBinding) :
        BaseViewHolder<PhotoItem>(binding.root) {
        override fun onBind(item: PhotoItem) {
            binding.root.setOnClickListener { onProductItemClicked(item.image) }
            val context = binding.root.context
            binding.tvTitle.text = item.place
            LoadImage.loadFestivalImage(context, item.image, binding.imgProduct)
            binding.tvDate.text = item.temp
        }
    }
}