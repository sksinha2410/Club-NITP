package com.sksinha2410.clubsnitp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient

class sacExtraPayment : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_natvansh_extra_payment_page)


        var mywebView = findViewById<View>(R.id.webview) as WebView
        mywebView.setWebViewClient(WebViewClient())
        mywebView.loadUrl("https://rzp.io/l/mtHiQQ4WH/")
        val webSettings: WebSettings = mywebView.getSettings()
        webSettings.javaScriptEnabled = true
    }
}