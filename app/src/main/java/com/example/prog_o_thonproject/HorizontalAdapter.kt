package com.example.prog_o_thonproject

import android.content.Context

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class HorizontalAdapter(val context: Context, private val element:MutableList<HorizontalData>): RecyclerView.Adapter<HorizontalAdapter.HorizontalViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HorizontalAdapter.HorizontalViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.horizontal_recycler_view,parent,false)
        return HorizontalViewHolder(view)
    }

    override fun getItemCount(): Int {
        return element.size
    }

    override fun onBindViewHolder(holder: HorizontalViewHolder, position: Int) {
        val currentItem=element[position]
        holder.institutename.text=currentItem.institutename
    }
    inner class HorizontalViewHolder(view: View) : RecyclerView.ViewHolder(view){

        val institutename = view.findViewById<TextView>(R.id.institutename)!!



    }



}