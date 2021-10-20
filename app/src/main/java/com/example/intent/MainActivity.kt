package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var count = 0

        val texViewCounter = findViewById<TextView>(R.id.textViewCounter)
        val editTextName = findViewById<EditText>(R.id.editTextName)
        texViewCounter.text = count.toString()

        val buttonIncrease = findViewById<Button>(R.id.buttonIncrease)
        val buttonDecrease = findViewById<Button>(R.id.buttonDecrease)
        val buttonNext = findViewById<Button>(R.id.buttonNext)

        buttonIncrease.setOnClickListener(){
            count++
            val texViewCounter = findViewById<TextView>(R.id.textViewCounter)
            texViewCounter.text = count.toString()
        }

        buttonDecrease.setOnClickListener(){
            count--
            val texViewCounter = findViewById<TextView>(R.id.textViewCounter)
            texViewCounter.text = count.toString()
        }

        buttonNext.setOnClickListener(){
            val intent = Intent(this, ResultActivity::class.java).apply {
                putExtra("counter", count)
                putExtra("name", editTextName.text.toString())
            }

            startActivity(intent)
        }

    }

}