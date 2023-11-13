package com.sksinha2410.clubsnitp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class HAckSlash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hack_slash)


        val hackslash = findViewById<CardView>(R.id.button)
        hackslash.setOnClickListener {
            val Intent = Intent(this,hackslashPayment::class.java)
            startActivity(Intent)
        }


        val hackslashE = findViewById<CardView>(R.id.button2)
        hackslashE.setOnClickListener {
            val Intent = Intent(this,hackslashExtraPayment::class.java)
            startActivity(Intent)
        }
    }
}