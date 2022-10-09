package com.example.madpractical6_21012012008

import android.content.Intent
import android.media.session.MediaController
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.VideoView
import com.google.android.material.floatingactionbutton.FloatingActionButton


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myVideoView = findViewById<VideoView>(R.id.vv)
        val myactionbutton = findViewById<FloatingActionButton>(R.id.fb)

        myactionbutton.setOnClickListener() {
            Intent(this, YoutubeActivity::class.java).apply { startActivity(this) }
        }
        val mediaController = MediaController(this)
        val uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.thestoryoflight)
        myVideoView.setMediaController(mediaController)
        mediaController.setAnchorView(myVideoView)
        myVideoView.setVideoURI(uri)
        myVideoView.requestFocus()
        myVideoView.start()


    }
}