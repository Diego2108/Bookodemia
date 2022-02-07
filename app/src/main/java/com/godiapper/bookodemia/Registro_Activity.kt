package com.godiapper.bookodemia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_registro.*
import kotlinx.android.synthetic.main.dialog_add_libro.*
import kotlinx.android.synthetic.main.dialog_add_libro.textView_callback_login

class Registro_Activity : AppCompatActivity() {
    companion object{
        lateinit var preference: Preference
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

       /** preference = Preference(applicationContext)
        iniUI()
        checkUserValue()*/

        /*val buttonActivityRegistro: Button = findViewById(R.id.button_crear_cue)*/
        button_crear_cue.setOnClickListener {
            startActivity(Intent(this, Home_Activity::class.java))
        }

        textView_callback_login.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

    }

    /**fun checkUserValue(){
        if(preference.getCorreo().isNotEmpty()){
            goToHome()
        }else
    }

    fun iniUI(){
        button_crear_cue.setOnClickListener{accesToHome()}
    }

    fun accesToHome(){
        if(tiet_correo_registro.text.toString().isNotEmpty()){
            preference.saveCorreo(tiet_correo_registro.text.toString())
            preference.savePasword(tiet_pasword_registro.text.toString())
            goToHome()
        }else{
            Toast.makeText(this,"Registrate bien",Toast.LENGTH_SHORT).show()
        }
    }

    fun goToHome(){
        startActivity(Intent(this,Home_Activity::class.java))
    }*/
}