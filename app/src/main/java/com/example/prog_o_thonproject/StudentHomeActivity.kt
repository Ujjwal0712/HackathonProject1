package com.example.prog_o_thonproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.prog_o_thonproject.adapter.FeedAdapter
import com.example.prog_o_thonproject.databinding.ActivityStudentHomeBinding
import com.example.prog_o_thonproject.fragments.ChatRoom
import com.example.prog_o_thonproject.fragments.HomeStudent
import com.example.prog_o_thonproject.fragments.PostFragment
import com.example.prog_o_thonproject.fragments.ProfileFragment
import com.example.prog_o_thonproject.fragments.ProfileStudent
import com.example.prog_o_thonproject.fragments.SearchFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class StudentHomeActivity : AppCompatActivity() {


    private lateinit var bottomNavigationView: BottomNavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_home)



        bottomNavigationView = findViewById(R.id.nav_view2)

        supportFragmentManager.beginTransaction().replace(R.id.container2, HomeStudent()).commit()

        bottomNavigationView.setOnItemSelectedListener {
            var fragment: Fragment? = null

            when (it.itemId) {
                R.id.nav_home_student -> {
                    fragment = HomeStudent()
                }


                R.id.nav_message_student -> {
                    fragment = ChatRoom()
                }

                R.id.nav_profile_student -> {
                    fragment = ProfileStudent()
                }
            }

            supportFragmentManager.beginTransaction().replace(R.id.container2,fragment!!).commit()
            return@setOnItemSelectedListener true

        }


    }



}