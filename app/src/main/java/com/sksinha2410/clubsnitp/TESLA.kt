package com.sksinha2410.clubsnitp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class TESLA : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tesla)

        val tesla = findViewById<CardView>(R.id.button)
        tesla.setOnClickListener {
            val Intent = Intent(this,teslaPayment::class.java)
            startActivity(Intent)
        }


        val teslaE = findViewById<CardView>(R.id.button2)
        teslaE.setOnClickListener {
            val Intent = Intent(this,teslaExtraPayment::class.java)
            startActivity(Intent)
        }
    }
}