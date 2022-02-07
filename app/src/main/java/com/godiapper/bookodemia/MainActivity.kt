package com.godiapper.bookodemia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.GridLayoutManager
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var parent_view: View? = null

    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            parent_view = findViewById(android.R.id.content)

            val buttonActivity: Button = findViewById(R.id.button_login)
            buttonActivity.setOnClickListener {
                startActivity(Intent(this, Home_Activity::class.java))
            }

            val tv_registrarse: TextView = findViewById(R.id.tv_registrarse)
            buttonActivity.setOnClickListener {
                startActivity(Intent(this, Registro_Activity::class.java))
            }

            val textEmail: String = til_correo_lo.editText?.text?.trim().toString()
            val textEmail2: String = tiet_correo_login.text?.trim().toString()

            tiet_correo_login.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

                override fun afterTextChanged(editText: Editable?) {
                    if (editText.toString().trim().isEmpty()) {
                        til_correo_lo.setError("El campo es requerido")
                    } else {
                        til_correo_lo.setErrorEnabled(false)
                        til_correo_lo.setError("")
                    }
                }

            })

            button_login.setOnClickListener {
                startActivity(Intent(this, Home_Activity::class.java))
            }
            tv_registrarse.setOnClickListener {
                startActivity(Intent(this, Registro_Activity::class.java))
            }
    }
}