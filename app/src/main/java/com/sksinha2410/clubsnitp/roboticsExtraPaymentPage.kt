package com.sksinha2410.clubsnitp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class roboticsExtraPaymentPage : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_robotics_extra_payment_page)

        val webView = findViewById<WebView>(R.id.webview)
        webView.loadUrl("https://pages.razorpay.com/vimantriki/")
    }
}