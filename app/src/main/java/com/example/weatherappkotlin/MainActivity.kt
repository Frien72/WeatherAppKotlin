package com.example.weatherappkotlin

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Click listener test

        val textView : TextView = findViewById(R.id.textView)

        val button : Button = findViewById(R.id.button)
        button.setOnClickListener {
            textView.text = "Зачем ты нажал на кнопку ?"

        }

        // Data class test

        val dataClassInfo = findViewById<TextView>(R.id.textView2)
        dataClassInfo.text = DataClassTest("Jesus", 33).toString()

        // Cycle test

        val i = 0
        for (i in 1..10) {
            Log.v(TAG, "indexI = $i")
        }

        var j = 10
        while (j > 0) {
            Log.v(TAG, "indexJ = $j")
            j--;
        }

        }


    }
