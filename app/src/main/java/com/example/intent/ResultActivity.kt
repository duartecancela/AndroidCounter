package com.example.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val name = intent.getStringExtra("name")
        val counter = intent.getIntExtra("counter", 0)

        val nameView = findViewById<TextView>(R.id.textViewText)
        val counterView = findViewById<TextView>(R.id.textViewNumber)

        nameView.text = name.toString()
        counterView.text = "$counter"

    }
}