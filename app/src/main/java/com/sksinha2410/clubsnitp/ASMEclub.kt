package com.sksinha2410.clubsnitp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class ASMEclub : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_asme)

        val asme = findViewById<CardView>(R.id.button)
        asme.setOnClickListener {
            val Intent = Intent(this,asmePayment::class.java)
            startActivity(Intent)
        }

        val asmeE = findViewById<CardView>(R.id.button2)
        asmeE.setOnClickListener {
            val Intent = Intent(this,asmeExtraPayment::class.java)
            startActivity(Intent)
        }
    }
}