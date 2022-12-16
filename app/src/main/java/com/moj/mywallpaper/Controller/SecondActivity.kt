package com.moj.mywallpaper.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.moj.mywallpaper.R
import com.moj.mywallpaper.Utilities.EXTRA_CATEGORY

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val title = findViewById<TextView>(R.id.wallsTitle)
        val getExtra = intent.getStringExtra(EXTRA_CATEGORY)

        title.text = getExtra

    }
}