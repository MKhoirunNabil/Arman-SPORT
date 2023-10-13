package com.sport

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.PasswordTransformationMethod
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val login = findViewById<TextView>(R.id.TXTLOGIN)
        val BaCk = findViewById<ImageView>(R.id.backtologin)
        val cek = findViewById<CheckBox>(R.id.showHideCheckBoxSingup)
        val kofpass = findViewById<TextView>(R.id.ETKofPASSUP)
        val pass = findViewById<TextView>(R.id.ETPASSUP)
        login.setOnClickListener{
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }
        BaCk.setOnClickListener{
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }
        cek.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                // If the ToggleButton is checked, show the password
                kofpass.transformationMethod = null
                pass.transformationMethod = null
            } else {
                // If the ToggleButton is not checked, hide the password
                kofpass.transformationMethod = PasswordTransformationMethod()
                pass.transformationMethod = PasswordTransformationMethod()
            }
        }
    }
}