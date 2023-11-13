package com.sksinha2410.clubsnitp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class GDSC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gdsc)


        val gdsc = findViewById<CardView>(R.id.button)
        gdsc.setOnClickListener {
            val Intent = Intent(this,gdscPaymenmt::class.java)
            startActivity(Intent)
        }

        val gdscE= findViewById<CardView>(R.id.button2)
        gdscE.setOnClickListener {
            val Intent = Intent(this,gdscExtraPayment::class.java)
            startActivity(Intent)
        }
    }
}