package com.sijc.examenkotlin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        button3.setOnClickListener{
            var resule = " "
            val valor1 = num.text.toString().toInt()
            if (fibo.isChecked()) {
                val num2 = valor1
                var A = 0
                var B = 0
                var C = 1
                for (i in 0..num2) {
                    resule = "$resule $A, "
                    A = C + B
                    C = B
                    B = A
                }
            } else if (repli.isChecked()) {
                val num2 = valor1
                var a = 1
                var b = 1
                for (i in 1..num2) {
                    //System.out.print(a+", ");
                    resule = "$resule $a, "
                    if (b < a) {
                        b = b + 1
                    } else {
                        b = 1
                        a++
                    }
                }
            }
            else if (binario.isChecked()){
                val num2 = valor1
                var a = 1
                var b = 1
                var Le = 1
                for (i in 1..num2) {
                    // System.out.print(Le+", ");
                    resule = "$resule $Le, "
                    if (b < a) {
                        b = b + 1
                    } else {
                        b = 1
                        a++
                        Le = if (Le == 0) {
                            1
                        } else {
                            0
                        }
                    }
                }
            }
            val intent= Intent(this@MainActivity2, MainActivity3::class.java)
            val b : Bundle = Bundle()
            b.putString( "datos", resule)
            intent.putExtras(b)
            startActivity(intent)
        }
    }
}










