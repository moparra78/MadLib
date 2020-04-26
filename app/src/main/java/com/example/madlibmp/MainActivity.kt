package com.example.madlibmp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gou= findViewById<Button>(R.id.boton1)

        gou.setOnClickListener {

            val intent = Intent( this@MainActivity, Main2Activity::class.java)

            startActivity(intent)    }

    }

}

