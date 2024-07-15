package com.example.colorpredictio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.shashank.sony.fancytoastlib.FancyToast

class Profileview : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profileview)
        var rec=findViewById<ImageView>(R.id.imageView7)
        rec.setOnClickListener{

            var intent= Intent(this@Profileview,Homepage::class.java)
            startActivity(intent)
        }
        var img=findViewById<TextView>(R.id.textView8)
        img.setOnClickListener{
            var intent= Intent(this@Profileview,Homepage::class.java)
            startActivity(intent)
        }
        var my=findViewById<ImageView>(R.id.imageView9)
        my.setOnClickListener{
            var intent= Intent(this@Profileview,Recharge::class.java)
            startActivity(intent)
        }
        var myimg=findViewById<TextView>(R.id.textView10)
        myimg.setOnClickListener{
            var intent= Intent(this@Profileview,Recharge::class.java)
            startActivity(intent)
        }
    }

}
