package com.example.wear

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.support.wearable.activity.WearableActivity
import android.widget.Button

class welcom : WearableActivity() {
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcom)

        button = findViewById(R.id.button2)
        button.setOnClickListener{
            var intent = Intent(this, SignActivity::class.java)
            startActivity(intent)
        }
    }
}