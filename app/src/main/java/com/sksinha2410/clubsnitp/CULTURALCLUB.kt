package com.sksinha2410.clubsnitp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class CULTURALCLUB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saptak)

        val natvanshclub = findViewById<CardView>(R.id.button)
        natvanshclub.setOnClickListener {
            val Intent = Intent(this,culturalclubPaymentPage::class.java)
            startActivity(Intent)
        }

        val natvanshclubE = findViewById<CardView>(R.id.button2)
        natvanshclubE.setOnClickListener {
            val Intent = Intent(this,culturalclubExtraPaymentPage::class.java)
            startActivity(Intent)
        }
    }
}