package com.example.colorpredictio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.shashank.sony.fancytoastlib.FancyToast

class Recharge : AppCompatActivity() {
    private var mahi=Int
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recharge)

        var rec=findViewById<ImageView>(R.id.imageView7)
        rec.setOnClickListener{
            var intent= Intent(this@Recharge,Homepage::class.java)
            startActivity(intent)
        }
        var img=findViewById<TextView>(R.id.textView8)
        img.setOnClickListener{
            var intent= Intent(this@Recharge,Homepage::class.java)
            startActivity(intent)
        }
        var my=findViewById<ImageView>(R.id.imageView10)
        my.setOnClickListener{
            var intent= Intent(this@Recharge,Profileview::class.java)
            startActivity(intent)
        }
        var myimg=findViewById<TextView>(R.id.tect56)
        myimg.setOnClickListener{
            var intent= Intent(this@Recharge,Profileview::class.java)
            startActivity(intent)
        }
    }

}
