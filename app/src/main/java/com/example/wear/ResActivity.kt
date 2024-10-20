package com.example.wear

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.support.wearable.activity.WearableActivity
import android.widget.Button
import com.google.android.material.snackbar.Snackbar

class ResActivity : WearableActivity() {
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_res)

        button = findViewById(R.id.button3)
        button.setOnClickListener{
            Snackbar.make(it, "Succes", Snackbar.LENGTH_LONG)
        }
    }
}