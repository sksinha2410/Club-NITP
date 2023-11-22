package com.sksinha2410.clubsnitp

//noinspection SuspiciousImport
import android.os.Bundle
import android.view.View
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class teslaExtraPayment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tesla_extra_payment)

        var mywebView = findViewById<View>(R.id.wb_webView) as WebView
        mywebView.setWebViewClient(WebViewClient())
        mywebView.loadUrl("https://pages.razorpay.com/vimantriki/")
        val webSettings: WebSettings = mywebView.getSettings()
        webSettings.javaScriptEnabled = true
    }
}