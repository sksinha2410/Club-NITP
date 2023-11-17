package com.sksinha2410.clubsnitp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class NATVANSH : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_natvansh)

        val natvansh = findViewById<CardView>(R.id.button)
        natvansh.setOnClickListener {
            val Intent = Intent(this,natvanshPaymentPage::class.java)
            startActivity(Intent)
        }

        val natvanshE = findViewById<CardView>(R.id.button2)
        natvanshE.setOnClickListener {
            val Intent = Intent(this,natvanshExtraPaymentPage::class.java)
            startActivity(Intent)
        }
    }
}