package com.example.morningapplicationchallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var mbtnCalculator:Button
    lateinit var mbtnContacts: Button
    lateinit var mbtnWebsite:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mbtnCalculator=findViewById(R.id.mCalculator)
        mbtnContacts=findViewById(R.id.mContacts)
        mbtnWebsite=findViewById(R.id.mWebsite)


        mbtnCalculator.setOnClickListener {

        }
        mbtnContacts.setOnClickListener {

        }
        mbtnWebsite.setOnClickListener {

        }
    }
}