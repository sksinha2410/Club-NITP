package com.sksinha2410.clubsnitp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class ROBOTICS : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_robotics)

        val robotics = findViewById<CardView>(R.id.button)
        robotics.setOnClickListener {
            val Intent = Intent(this,roboticsPaymentPage::class.java)
            startActivity(Intent)
        }

        val roboticsE = findViewById<CardView>(R.id.button2)
        roboticsE.setOnClickListener {
            val Intent = Intent(this,roboticsExtraPaymentPage::class.java)
            startActivity(Intent)
        }
    }
}