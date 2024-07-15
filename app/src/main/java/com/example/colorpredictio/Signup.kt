package com.example.colorpredictio

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.shashank.sony.fancytoastlib.FancyToast

class Signup : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        val btn = findViewById<Button>(R.id.createaccount)
        btn.setOnClickListener {
//            FancyToast.makeText(this, "Sign Up Successful Login Now", FancyToast.LENGTH_LONG, FancyToast.SUCCESS, true
//            ).show()
            var intent= Intent(this@Signup,Login::class.java)
            startActivity(intent)


        }
    }
}