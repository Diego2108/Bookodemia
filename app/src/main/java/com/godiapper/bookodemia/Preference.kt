package com.godiapper.bookodemia

import android.content.Context

class Preference (val context:Context){
    val SHARE_NAME = "Mydtb"
    val share_correo_register = "correo_registro"
    val share_contrasena_register = "pasword_registro"
    val storage = context.getSharedPreferences(SHARE_NAME, 0)

    fun saveCorreo(correo:String){
        storage.edit().putString(share_correo_register, correo).apply()
    }

    fun savePasword(pasword:String){
        storage.edit().putString(share_contrasena_register, pasword).apply()
    }

    fun getCorreo():String{
        return storage.getString(share_correo_register, "")!!
    }

    fun getPasword():String{
        return storage.getString(share_contrasena_register, "")!!
    }
    fun wipe(){
        storage.edit().clear().apply()
    }
}