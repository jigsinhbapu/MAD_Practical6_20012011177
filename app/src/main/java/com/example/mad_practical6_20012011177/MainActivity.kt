package com.example.mad_practical6_20012011177

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myvideoview = findViewById<VideoView>(R.id.videoview)
        val myplaybtn = findViewById<FloatingActionButton>(R.id.playbtn)
        val mediaController = MediaController(this)
        val uri: Uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.thestoryoflight)
        myvideoview.setMediaController(mediaController)
        myvideoview.setVideoURI(uri)
        myvideoview.requestFocus()
        myvideoview.start()
        myplaybtn.setOnClickListener {
            Intent(this, YoutubeActivity::class.java).apply { startActivity(this) }
        }
    }
}