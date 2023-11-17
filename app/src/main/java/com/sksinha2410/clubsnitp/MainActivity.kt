package com.sksinha2410.clubsnitp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

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
        ieee.setOnClickListener {
            val Intent = Intent(this,IEEE::class.java)
            startActivity(Intent)
        }

        val tesla = findViewById<Button>(R.id.button3)
        tesla.setOnClickListener {
            val Intent = Intent(this,TESLA::class.java)
            startActivity(Intent)
        }

        val hackslash = findViewById<Button>(R.id.button4)
        hackslash.setOnClickListener {
            val Intent = Intent(this,HAckSlash::class.java)
            startActivity(Intent)
        }


        val asmeclub = findViewById<Button>(R.id.button5)
        asmeclub.setOnClickListener {
            val Intent = Intent(this,ASMEclub::class.java)
            startActivity(Intent)
        }

        val gdsc = findViewById<Button>(R.id.button6)
        gdsc.setOnClickListener {
            val Intent = Intent(this,GDSC::class.java)
            startActivity(Intent)
        }

        val saptak = findViewById<Button>(R.id.button7)
        saptak.setOnClickListener {
            val Intent = Intent(this,SAPTAK::class.java)
            startActivity(Intent)
        }

        val expresso = findViewById<Button>(R.id.button8)
        expresso.setOnClickListener {
            val Intent = Intent(this,EXPRESSO::class.java)
            startActivity(Intent)
        }

        val asceclub = findViewById<Button>(R.id.button9)
        asceclub.setOnClickListener {
            val Intent = Intent(this,ASCEclub::class.java)
            startActivity(Intent)
        }

        val GYB = findViewById<Button>(R.id.button10)
        GYB.setOnClickListener {
            val Intent = Intent(this,GYBclub::class.java)
            startActivity(Intent)
        }

        val robotics = findViewById<Button>(R.id.button11)
        robotics.setOnClickListener {
            val Intent = Intent(this,ROBOTICS::class.java)
            startActivity(Intent)
        }

        val natvansh = findViewById<Button>(R.id.button12)
        natvansh.setOnClickListener {
            val Intent = Intent(this,NATVANSH::class.java)
            startActivity(Intent)
        }
    }
}