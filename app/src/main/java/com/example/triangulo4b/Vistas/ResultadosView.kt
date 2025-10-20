package com.example.triangulo4b.Vistas

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.triangulo4b.R

class ResultadosView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_resultados_view)

        val txvRes=findViewById<TextView>(R.id.txvRes)
        val bundle = intent
        val l1=bundle.getFloatExtra("lado1",0F)
        val l2=bundle.getFloatExtra("lado2",0F)
        val l3=bundle.getFloatExtra("lado3",0F)
        txvRes.text="Los valores obtenidos son ${l1} , ${l2} , ${l3} \n " +
                "El permitro seria : ${l1+l2+l3}"

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}