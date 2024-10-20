package com.example.wear

import android.content.Intent
import android.os.Bundle
import android.support.wearable.activity.WearableActivity
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class SignActivity : WearableActivity() {
    private lateinit var login: EditText
    private lateinit var password: EditText
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign)

        login = findViewById(R.id.login)
        password = findViewById(R.id.password)
        button = findViewById(R.id.signIn)

        button.setOnClickListener{
            if (login.text.isNotEmpty() && password.text.isNotEmpty()) {
                var intent = Intent(this, ResActivity::class.java)
                startActivity(intent)
            }
            else {
                Snackbar.make(it, "пустые поля", Snackbar.LENGTH_LONG)
                    .show()
            }
        }
    }
}