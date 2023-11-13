package com.sksinha2410.clubsnitp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class EXPRESSO : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expresso)


        val expresso = findViewById<CardView>(R.id.button)
        expresso.setOnClickListener {
            val Intent = Intent(this,expressoPayment::class.java)
            startActivity(Intent)
        }

        val expressoE = findViewById<CardView>(R.id.button2)
        expressoE.setOnClickListener {
            val Intent = Intent(this,expressoExtraPayment::class.java)
            startActivity(Intent)
        }
    }
}