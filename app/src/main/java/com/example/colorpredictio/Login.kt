package com.example.colorpredictio

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.shashank.sony.fancytoastlib.FancyToast

class Login : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val btn=findViewById<Button>(R.id.loginbtn)
        btn.setOnClickListener{
            var intent= Intent(this@Login,Homepage::class.java)
            startActivity(intent)
        }
    }
}