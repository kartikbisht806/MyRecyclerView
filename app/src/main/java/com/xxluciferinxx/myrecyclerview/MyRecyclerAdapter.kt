package com.xxluciferinxx.myrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_layout.view.*

class MyRecyclerAdapter(private val arr: Array<CustomArr>) :
    RecyclerView.Adapter<MyRecyclerAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView = itemView.tv_text!!
        val imageView = itemView.iv_image!!
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyRecyclerAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyRecyclerAdapter.ViewHolder, position: Int) {
        holder.textView.text = arr[position].t
        holder.imageView.setImageResource(arr[position].i)
    }

    override fun getItemCount(): Int = arr.size
}