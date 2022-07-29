package com.example.quiz

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.browser.customtabs.CustomTabsIntent
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.setOnClickListener() {
            val url = "https://codecombat.com/"
            val builder = CustomTabsIntent.Builder()
            val customTabsIntent = builder.build()
            customTabsIntent.launchUrl(this, Uri.parse(url))
//            builder.setToolbarColor(getColor(R.color.purple_200))
            builder.setToolbarColor(ContextCompat.getColor(this, android.R.color.black))

// add share action to menu list
// add share action to menu list


        }


    }
}