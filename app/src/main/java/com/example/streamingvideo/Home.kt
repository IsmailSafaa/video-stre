package com.example.streamingvideo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        button1.setOnClickListener {
            var i = Intent(this,MainActivity::class.java)
            i.putExtra("url","https://cdn.videvo.net/videvo_files/video/free/2019-01/small_watermarked/181015_12b_Venice%20Beach_014_preview.webm")
            startActivity(i)
        }

        button2.setOnClickListener {
            var i = Intent(this,MainActivity::class.java)
            i.putExtra("url","https://cdn.videvo.net/videvo_files/video/free/2019-03/small_watermarked/181015_15a_Venice%20CanalsDrone_02_preview.webm")
            startActivity(i)
        }

        button3.setOnClickListener {
            var i = Intent(this,MainActivity::class.java)
            i.putExtra("url","https://cdn.videvo.net/videvo_files/video/free/2019-04/small_watermarked/181015_10_Santa%20Monica%20Pier_04_preview.webm")
            startActivity(i)
        }

        button4.setOnClickListener {
            var i = Intent(this,MainActivity::class.java)
            i.putExtra("url","https://cdn.videvo.net/videvo_files/video/premium/video0017/small_watermarked/327-1_327-4079_preview.webm")
            startActivity(i)
        }
    }
}