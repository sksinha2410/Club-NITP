package com.sksinha2410.clubsnitp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class NATVANSH : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_natvansh)

        val natvanshclub = findViewById<CardView>(R.id.button)
        natvanshclub.setOnClickListener {
            val Intent = Intent(this,natvanshPaymentPage::class.java)
            startActivity(Intent)
        }

        val natvanshclubE = findViewById<CardView>(R.id.button2)
        natvanshclubE.setOnClickListener {
            val Intent = Intent(this,natvanshExtraPaymentPage::class.java)
            startActivity(Intent)
        }
    }
}