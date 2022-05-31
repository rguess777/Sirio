package com.example.myecommerceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class FirstPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_page)

        var BLogin = findViewById<Button>(R.id.btnLogin)
        BLogin.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            this.startActivity(intent);
            finish()
        }

        var BSignUp = findViewById<Button>(R.id.btnSignup)
        BSignUp.setOnClickListener {
            val intent = Intent(this, SignUp::class.java)
            this.startActivity(intent);
            finish()
        }
    }
}