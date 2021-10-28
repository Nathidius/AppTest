package com.test.apptest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.facebook.appevents.AppEventsLogger

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val logger = AppEventsLogger.newLogger(this)
        logger.logEvent("Test event 1")
    }
}