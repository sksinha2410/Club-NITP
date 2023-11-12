package com.sksinha2410.clubsnitp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class DESCO : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desco)

        val desco = findViewById<CardView>(R.id.button)
        desco.setOnClickListener {
            val Intent = Intent(this,descoPayment::class.java)
            startActivity(Intent)
        }
    }
}