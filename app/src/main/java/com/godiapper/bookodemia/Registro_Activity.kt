package com.godiapper.bookodemia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.dialog_add_libro.*

class Registro_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

       /* val buttonActivityRegistro: Button = findViewById(R.id.button_registrarse)
        buttonActivity.setOnClickListener {
            startActivity(Intent(this, Registro_Activity::class.java))
        }*/

        textView_callback_login.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}