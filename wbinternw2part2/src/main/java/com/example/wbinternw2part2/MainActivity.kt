package com.example.wbinternw2part2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "MainActivity - onCreate")

        val btnStart: Button = findViewById(R.id.btnStart)

        btnStart.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .addToBackStack(null)
                .add(R.id.container, FirstFragment())
                .commit()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "MainActivity - onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "MainActivity - onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "MainActivity - onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "MainActivity - onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "MainActivity - onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "MainActivity - onDestroy")
    }
}