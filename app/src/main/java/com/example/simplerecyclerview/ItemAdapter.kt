package com.example.simplerecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(private val itemList: List<Item>):RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    //to hold one single view only
    inner class ItemViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val img:ImageView = itemView.findViewById(R.id.img)
        val txt:TextView = itemView.findViewById(R.id.item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.content,parent,false)
        return ItemViewHolder(itemView)
    }

    override fun getItemCount() = itemList.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val currentItem = itemList[position]

        holder.img.setImageResource(currentItem.imageResource)
        holder.txt.text = currentItem.text1
    }

}