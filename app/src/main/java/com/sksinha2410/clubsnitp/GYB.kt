package com.sksinha2410.clubsnitp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class GYB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gyb)

        val gyb = findViewById<CardView>(R.id.button)
        gyb.setOnClickListener {
            val Intent = Intent(this,gybPaymentPage::class.java)
            startActivity(Intent)
        }

        val gybE = findViewById<CardView>(R.id.button2)
        gybE.setOnClickListener {
            val Intent = Intent(this,gybExtraPaymentPage::class.java)
            startActivity(Intent)
        }
    }
}