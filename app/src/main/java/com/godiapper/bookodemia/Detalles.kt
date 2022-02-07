package com.godiapper.bookodemia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Detalles : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalles)

        val tv_regresardetalles: TextView = findViewById(R.id.textView_regresar_detalles)
        tv_regresardetalles.setOnClickListener {
            startActivity(Intent(this, Home_Activity::class.java))
        }
    }
}