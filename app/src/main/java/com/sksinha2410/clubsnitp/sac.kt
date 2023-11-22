package com.sksinha2410.clubsnitp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class sac : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_natvansh)


        val saptak = findViewById<CardView>(R.id.button)
        saptak.setOnClickListener {
            val Intent = Intent(this,sacPayment::class.java)
            startActivity(Intent)
        }

        val saptakE = findViewById<CardView>(R.id.button2)
        saptakE.setOnClickListener {
            val Intent = Intent(this,sacExtraPayment::class.java)
            startActivity(Intent)
        }
    }
}