package com.sksinha2410.clubsnitp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class teslaExtraPayment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tesla_extra_payment)

            val webView = findViewById<WebView>(R.id.webview)
        webView.loadUrl("https://pages.razorpay.com/vimantriki/")
    }
}