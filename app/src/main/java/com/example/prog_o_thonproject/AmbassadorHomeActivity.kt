@file:Suppress("SameParameterValue")

package com.example.prog_o_thonproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.prog_o_thonproject.databinding.ActivityAmbassadorHomeBinding

class AmbassadorHomeActivity : AppCompatActivity() {
    private lateinit var feedAdapter: FeedAdapter
    private lateinit var binding: ActivityAmbassadorHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityAmbassadorHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)



        val exampleList = generateList(100)

        feedAdapter = FeedAdapter(this, exampleList)
        binding.recyclerView.adapter = feedAdapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.setHasFixedSize(true)
    }

    private fun generateList(size: Int) : MutableList<FeedData>
    {
        val list = mutableListOf<FeedData>()

        for ( i in 0 until size ) {
            list.add(FeedData("Item ${i+1}",caption="hi"))
        }


        return list
    }
}