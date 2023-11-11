package com.sksinha2410.clubsnitp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val desco = findViewById<Button>(R.id.button)
        desco.setOnClickListener {
            val Intent = Intent(this,DESCO::class.java)
            startActivity(Intent)
        }

        val ieee = findViewById<Button>(R.id.button2)
        desco.setOnClickListener {
            val Intent = Intent(this,IEEE::class.java)
            startActivity(Intent)
        }

        val tesla = findViewById<Button>(R.id.button3)
        desco.setOnClickListener {
            val Intent = Intent(this,TESLA::class.java)
            startActivity(Intent)
        }

        val hackslash = findViewById<Button>(R.id.button4)
        desco.setOnClickListener {
            val Intent = Intent(this,HAckSlash::class.java)
            startActivity(Intent)
        }


        val asme = findViewById<Button>(R.id.button5)
        desco.setOnClickListener {
            val Intent = Intent(this,ASME::class.java)
            startActivity(Intent)
        }

        val gdsc = findViewById<Button>(R.id.button6)
        desco.setOnClickListener {
            val Intent = Intent(this,GDSC::class.java)
            startActivity(Intent)
        }

        val saptak = findViewById<Button>(R.id.button7)
        desco.setOnClickListener {
            val Intent = Intent(this,SAPTAK::class.java)
            startActivity(Intent)
        }

        val expresso = findViewById<Button>(R.id.button8)
        desco.setOnClickListener {
            val Intent = Intent(this,EXPRESSO::class.java)
            startActivity(Intent)
        }
    }
}