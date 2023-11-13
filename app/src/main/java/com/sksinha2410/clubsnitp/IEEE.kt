package com.sksinha2410.clubsnitp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class IEEE : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ieee)

        val ieee = findViewById<CardView>(R.id.button)
        ieee.setOnClickListener {
            val Intent = Intent(this,ieeePayment::class.java)
            startActivity(Intent)
        }


        val ieeeE = findViewById<CardView>(R.id.button2)
        ieeeE.setOnClickListener {
            val Intent = Intent(this,ieeeExtraPayment::class.java)
            startActivity(Intent)
        }

    }
}