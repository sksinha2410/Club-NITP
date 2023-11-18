package com.sksinha2410.clubsnitp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class Think_India : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_think_india)


        val thinkindia = findViewById<CardView>(R.id.button)
        thinkindia.setOnClickListener {
            val Intent = Intent(this,ThinkIndiaPayment::class.java)
            startActivity(Intent)
        }

        val thinkindiaE = findViewById<CardView>(R.id.button2)
        thinkindiaE.setOnClickListener {
            val Intent = Intent(this,ThinkIndiaExtraPayment::class.java)
            startActivity(Intent)
        }
    }
}