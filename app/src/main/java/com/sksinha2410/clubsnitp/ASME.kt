package com.sksinha2410.clubsnitp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ASME : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_asme)


        val asme = findViewById<Button>(R.id.button)
        asme.setOnClickListener {
            val Intent = Intent(this,asmePayment::class.java)
            startActivity(Intent)
        }
    }
}