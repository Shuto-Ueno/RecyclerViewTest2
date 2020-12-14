package com.example.recyclerviewtest

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(_data: ArrayList<String>) : RecyclerView.Adapter<ListViewHolder>() {
    private var data: ArrayList<String> = _data

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ListViewHolder.create(inflater, parent)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.textView.text = data[position]
        holder.textView2.text = data[position]
    }

    override fun getItemCount(): Int {
        return data.size
    }
}
