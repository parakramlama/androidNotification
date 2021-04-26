package com.example.notificationwear

import android.os.Bundle
import android.support.wearable.activity.WearableActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : WearableActivity() {

    private lateinit var etFirst : EditText
    private lateinit var etSecond : EditText
    private lateinit var btnAdd : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etFirst = findViewById(R.id.etFirst)
        etSecond = findViewById(R.id.etSecond)
        btnAdd = findViewById(R.id.btnAdd)

        btnAdd.setOnClickListener {
            Toast.makeText(this, "2" ,Toast.LENGTH_SHORT)
        }

        // Enables Always-on
        setAmbientEnabled()
    }
}