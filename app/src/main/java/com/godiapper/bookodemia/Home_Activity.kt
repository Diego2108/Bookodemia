package com.godiapper.bookodemia

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.textfield.TextInputLayout
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.dialog_add_libro.*
import kotlinx.android.synthetic.main.cardview_libros.*
import com.godiapper.bookodemia.adapter.AdapterLibro
import kotlinx.android.synthetic.main.dialog_add_libro.view.*

class Home_Activity : AppCompatActivity() {

    val listLibros : MutableList<Libro> = mutableListOf()
    var adapterLibro = AdapterLibro(listLibros)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        initRecyclerLibros()

        initFabAddLibro(this)
    }

    private fun initFabAddLibro(context: Context) {
        fab_agregar_libros.setOnClickListener {
            val layoutInflater =
                LayoutInflater.from(context).inflate(R.layout.dialog_add_libro, null)
            val dialog = AlertDialog.Builder(context).setView(layoutInflater).setCancelable(false)

            val instanciaDialogo = dialog.show()
            layoutInflater.button_agregar_libro.setOnClickListener{
                val urlImage =layoutInflater.til_url.editText?.text.toString().trim()
                val nombre = layoutInflater.til_nombre.editText?.text.toString()
                val anio = layoutInflater.til_anio.editText?.text.toString()
                if(urlImage.isNotEmpty() && nombre.isNotEmpty() && anio.isNotEmpty()){
                    adapterLibro.agregarLibro(
                        Libro(
                            urlImage,
                            nombre,
                            anio.toInt()
                        ))

                    instanciaDialogo.dismiss()
                }
            }
        }
    }

    fun initRecyclerLibros(){
        listLibros.add(Libro("https://cloudfront-eu-central-1.images.arcpublishing.com/prisa/2FEZLOAZVN2WNSJRJPOGCA2EOY.jpg",
            "Cancion de Hielo y fuego",
            1995))

        listLibros.add(
            Libro(
                "https://quelibroleo.com/images/libros/libro_1322009582.jpg",
                "El señor de los anillos",
                1992
            ))

        listLibros.add(
            Libro("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQx8Zb_48tAIwUuqxRSsqkeHdLuMIwabHFbRA&usqp=CAU",
                "Festin de cuervos",
                1997)
        )

        recyclerview_libros.layoutManager = LinearLayoutManager(this)
        recyclerview_libros.setHasFixedSize(true)
        adapterLibro = AdapterLibro(listLibros)
        recyclerview_libros.adapter = adapterLibro
    }*/
}