package com.sijc.examenkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)


        val valo = intent.getStringExtra("datos")
        te.text = "La serie  es: $valo"

        button.setOnClickListener {
            val intents= Intent(this@MainActivity3, MainActivity2::class.java)
            startActivity(intents)

        }

    }
}
