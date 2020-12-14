package com.example.recyclerviewtest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    companion object {
        fun create(inflater: LayoutInflater, parent: ViewGroup?): ListViewHolder {
            return ListViewHolder(inflater.inflate(R.layout.list_item, parent, false))
        }
    }

    val textView = view.findViewById<TextView>(R.id.textView)
    val textView2 = view.findViewById<TextView>(R.id.textView2)
}
