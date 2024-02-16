package com.example.mytestproject.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mytestproject.databinding.LayooutItemRowBinding
import com.example.mytestproject.modelclasses.LstMtfDates
import java.util.zip.Inflater


class AdapterSample(private var item: MutableList<LstMtfDates>) :
    RecyclerView.Adapter<AdapterSample.ViewHolder>() {

    private lateinit var binding: LayooutItemRowBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding = LayooutItemRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount() = item.size
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindingAll(item[position]);
    }

    @SuppressLint("NotifyDataSetChanged")
    fun updateList(newList: List<LstMtfDates>) {
        item.clear()
        item.addAll(newList)
        notifyDataSetChanged()
    }

    inner class ViewHolder(itemRowBinding: LayooutItemRowBinding) :
        RecyclerView.ViewHolder(itemRowBinding.root) {

        fun bindingAll(lstMtfDates: LstMtfDates) {

            binding.apply {
                title.text = lstMtfDates.MtfDate
                year.text = lstMtfDates.MtfStatus
                genre.text = lstMtfDates.MtfReason
            }
        }
    }
}