package com.example.testing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        callMethod()
    }

// commit by pocharam
    private fun callMethod() {
        println("Vikas Suthar")
    }
}
