package com.example.madlibmp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main3.*
import java.util.*
import kotlin.collections.ArrayList
import kotlin.random.Random

class Main3Activity : AppCompatActivity() {
    val generate: String = "madlib1_tarzan2"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val inputs = intent.getStringArrayListExtra("dato")

        storyfin(inputs, resources.getIdentifier(generate, "raw", packageName))

        val gou= findViewById<Button>(R.id.boton3)

        gou.setOnClickListener {

            val intent = Intent( this@Main3Activity, MainActivity::class.java)

            startActivity(intent)    }

    }

    fun storyfin(inputs: ArrayList<String>, idir: Int){
        val builder = StringBuilder()
        val scan = Scanner(resources.openRawResource(idir))
        val L = scan.nextLine()
        builder.append(L)

        while(scan.hasNextLine()){
            val line = scan.nextLine()
            builder.append(" ")
            builder.append(line)
        }

        var `val` = builder.toString()
        val reg = Regex("<.*?>")
        val blanco = reg.findAll(`val`).map { it.value }
        var i: Int = 0
        for(blanco in blanco){
            `val` = `val`.replaceFirst(blanco, inputs.get(i))
            i++
        }
        texto5.text = "$`val`"
    }

}

