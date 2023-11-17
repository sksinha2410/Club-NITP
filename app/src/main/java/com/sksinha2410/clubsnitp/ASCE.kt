package com.sksinha2410.clubsnitp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class ASCE : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_asce)

        val asce = findViewById<CardView>(R.id.button)
        asce.setOnClickListener {
            val Intent = Intent(this,ascePaymentPage::class.java)
            startActivity(Intent)
        }

        val asceE = findViewById<CardView>(R.id.button2)
        asceE.setOnClickListener {
            val Intent = Intent(this,asceExtraPaymentPage::class.java)
            startActivity(Intent)
        }
    }
}