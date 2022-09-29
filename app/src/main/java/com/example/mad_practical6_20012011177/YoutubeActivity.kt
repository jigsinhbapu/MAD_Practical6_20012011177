package com.example.mad_practical6_20012011177

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class YoutubeActivity : AppCompatActivity() {
    private val youtubeId ="WjAPDofGg28"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)
        val mywebview = findViewById<WebView>(R.id.webview)
        val myplaybtn = findViewById<FloatingActionButton>(R.id.playbtn)
        myplaybtn.setOnClickListener{
            Intent(this,MainActivity::class.java).apply { startActivity(this) }
        }
        val webSettings:WebSettings = mywebview.settings
        webSettings.javaScriptEnabled=true
        webSettings.loadWithOverviewMode=true
        webSettings.useWideViewPort=true
        mywebview.loadUrl("https://www.youtube.com/watch?v=L3BGGVJiPS0"+youtubeId)
    }

}
