package com.example.prog_o_thonproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.prog_o_thonproject.utils2.Constants

class SecondActivity : AppCompatActivity() {
    private lateinit var titlebox: TextView
    private lateinit var descriptionbox: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        titlebox = findViewById(R.id.textView)
        descriptionbox = findViewById(R.id.textView2)



        val data = intent.extras

        data?. let {
            titlebox.text = it.getString(Constants.KEY_TITLE)
            descriptionbox.text = it.getString(Constants.KEY_DESCRIPTION)
        }

    }
}