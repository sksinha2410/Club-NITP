package com.sksinha2410.clubsnitp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class SAPTAK : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saptak)


        val saptak = findViewById<CardView>(R.id.button)
        saptak.setOnClickListener {
            val Intent = Intent(this,saptakPatment::class.java)
            startActivity(Intent)
        }
    }
}