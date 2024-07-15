package com.example.colorpredictio

import android.content.Intent
import android.os.AsyncTask
import android.os.Build.VERSION_CODES.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class splashscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.colorpredictio.R.layout.activity_splash_screen)
//        Handler().postDelayed({
//            startActivity(Intent(this, MainActivity::class.java))
//        }, 2000)

        startHeavyTask()
    }

    private fun startHeavyTask() {
        LongOperation().execute()
    }
    private open inner class LongOperation: AsyncTask<String?, Void, String?>() {
        @Deprecated("Deprecated in Java")
        override fun doInBackground(vararg params: String?): String? {
            for (i in 1..2) {
                try {
                    Thread.sleep(1000)
                }
                catch (ex:Exception)
                {
                    Thread.interrupted()
                }
            }
            return "result"
        }

        @Deprecated("Deprecated in Java")
        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)
            var intent= Intent(this@splashscreen,Signup::class.java)
            startActivity(intent)
        }
    }
}