package com.example.prog_o_thonproject.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.prog_o_thonproject.HorizontalData
import com.example.prog_o_thonproject.LoginActivity
import com.example.prog_o_thonproject.R
import com.example.prog_o_thonproject.StudentHomeActivity
import com.example.prog_o_thonproject.adapter.HorizontalAdapter
import com.example.prog_o_thonproject.databinding.ActivityProfileBinding
import com.example.prog_o_thonproject.databinding.FragmentProfileStudentBinding
import com.google.firebase.auth.FirebaseAuth


class ProfileStudent: Fragment() {

    private lateinit var horizontalAdapter: HorizontalAdapter
    private lateinit var binding: FragmentProfileStudentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View {
        binding = FragmentProfileStudentBinding.inflate(layoutInflater,container,false)
        return (binding.root)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.signout.setOnClickListener {
            FirebaseAuth.getInstance().signOut()
            startActivity(Intent(requireContext(), LoginActivity::class.java))

        }

        val exampleList = generateList(10)

        horizontalAdapter = HorizontalAdapter(requireContext(), exampleList)
        binding.recyclerView.adapter = horizontalAdapter
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext(),
            LinearLayoutManager.HORIZONTAL,true)
        binding.recyclerView.setHasFixedSize(true)


    }

    private fun generateList(size: Int) : MutableList<HorizontalData>
    {
        val list = mutableListOf<HorizontalData>()

        for ( i in 0 until size ) {
            list.add(HorizontalData("Item ${i+1}"))
        }


        return list
    }

}