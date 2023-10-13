package com.sport

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.PasswordTransformationMethod
import android.widget.CheckBox
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val CreateAkun = findViewById<TextView>(R.id.CrateAccount)
        val show = findViewById<CheckBox>(R.id.showHideCheckBox)
        val passET = findViewById<TextView>(R.id.ETPASS)
        show.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                // If the ToggleButton is checked, show the password
                passET.transformationMethod = null
            } else {
                // If the ToggleButton is not checked, hide the password
                passET.transformationMethod = PasswordTransformationMethod()
            }
        }
        CreateAkun.setOnClickListener{
            startActivity(Intent(this, RegisterActivity::class.java))
            finish()
        }
    }
}