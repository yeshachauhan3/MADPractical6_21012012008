package com.example.madpractical6_21012012008

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class YoutubeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yotube)

        val myWebView = findViewById<WebView>(R.id.wv)
        val myactionbutton = findViewById<FloatingActionButton>(R.id.fb2)

        myactionbutton.setOnClickListener() {
            Intent(this,MainActivity:: class.java).apply { startActivity(this) }
        }

    }

}