package com.example.myecommerceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var SignUp = findViewById<TextView>(R.id.login_signup_text_view)
        SignUp.setOnClickListener{
            val intent = Intent(this, SignUp::class.java)
            this.startActivity(intent);
            finish()
        }
    }
}