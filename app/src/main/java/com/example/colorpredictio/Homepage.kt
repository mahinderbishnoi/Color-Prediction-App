package com.example.colorpredictio

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import com.example.colorpredictio.databinding.ActivityHomepageBinding
import com.shashank.sony.fancytoastlib.FancyToast

class Homepage : AppCompatActivity() {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)
        var cricket=findViewById<ImageView>(R.id.cricket)
        cricket.setOnClickListener{
            var intent=Intent(this@Homepage,MainActivity2::class.java)
            startActivity(intent)
        }
        var rec=findViewById<ImageView>(R.id.imageView9)
        rec.setOnClickListener{
            var intent= Intent(this@Homepage,Recharge::class.java)
            startActivity(intent)
        }
        var img=findViewById<TextView>(R.id.textView10)
        img.setOnClickListener{
            var intent= Intent(this@Homepage,Recharge::class.java)
            startActivity(intent)
        }

        var my=findViewById<ImageView>(R.id.imageView10)
        my.setOnClickListener{
            var intent= Intent(this@Homepage,Profileview::class.java)
            startActivity(intent)
        }
        var myimg=findViewById<TextView>(R.id.tect56)
        myimg.setOnClickListener{
            var intent= Intent(this@Homepage,Profileview::class.java)
            startActivity(intent)
        }
        var rech=findViewById<AppCompatButton>(R.id.appCompatButton)
        rech.setOnClickListener{
            var intent= Intent(this@Homepage,Recharge::class.java)
            startActivity(intent)
        }
    }

}