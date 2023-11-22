package com.sksinha2410.clubsnitp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient

class gybPaymentPage : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gyb_payment_page)


        var mywebView = findViewById<View>(R.id.webview) as WebView
        mywebView.setWebViewClient(WebViewClient())
        mywebView.loadUrl("https://pages.razorpay.com/vimantriki/")
        val webSettings: WebSettings = mywebView.getSettings()
        webSettings.javaScriptEnabled = true
    }
}