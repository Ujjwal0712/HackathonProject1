package com.example.prog_o_thonproject

import android.content.Context

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class FeedAdapter(val context: Context, private val element:MutableList<FeedData>): RecyclerView.Adapter<FeedAdapter.FeedViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeedAdapter.FeedViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.feed_recycler_view,parent,false)
        return FeedViewHolder(view)
    }

    override fun getItemCount(): Int {
        return element.size
    }

    override fun onBindViewHolder(holder: FeedViewHolder, position: Int) {
        val currentItem=element[position]
        holder.institutename.text=currentItem.institutename
        holder.caption.text=currentItem.caption
    }
    inner class FeedViewHolder(view: View) : RecyclerView.ViewHolder(view){

        val institutename: TextView = view.findViewById<TextView>(R.id.title_view)
        val caption: TextView = view.findViewById(R.id.description_view)


    }



}