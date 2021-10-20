package com.example.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val texViewCounter = findViewById<TextView>(R.id.textViewCounter)
        texViewCounter.text = count.toString()

    }

    fun increase(view: android.view.View) {
        val buttonIncrease = findViewById<Button>(R.id.buttonIncrease)

        buttonIncrease.setOnClickListener {
            count++
            val texViewCounter = findViewById<TextView>(R.id.textViewCounter)
            texViewCounter.text = count.toString()
        }
    }
    fun decrease(view: android.view.View) {
        count--
        val texViewCounter = findViewById<TextView>(R.id.textViewCounter)
        texViewCounter.text = count.toString()
    }

}