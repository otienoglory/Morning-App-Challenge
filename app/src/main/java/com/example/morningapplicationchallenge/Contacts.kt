package com.example.morningapplicationchallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class Contacts : AppCompatActivity() {
    lateinit var Mcontacts: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts2)

    }
}