package com.godiapper.bookodemia.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.godiapper.bookodemia.Libro
import com.godiapper.bookodemia.R
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.godiapper.bookodemia.Detalles
import com.godiapper.bookodemia.Registro_Activity
import com.google.android.material.card.MaterialCardView


class AdapterLibro (val libros: MutableList<Libro>) :
    RecyclerView.Adapter<AdapterLibro.LibroHolder>()
    {
        class LibroHolder(val view: View) : RecyclerView.ViewHolder(view) {
           /* val cardView: MaterialCardView = view.findViewById(R.id.cardView_agregar_libro)*/
            val imagenView: ImageView = view.findViewById(R.id.imageView_libro)
            val nombreView: TextView = view.findViewById(R.id.textView_Nombre)
            val autorView: TextView = view.findViewById(R.id.textView_Anio)
            val categoryView: TextView = view.findViewById(R.id.textView_category)

            fun setImagen(imagen: Libro) {

                nombreView.setText(imagen.titulo)
                autorView.setText(imagen.autor)
                categoryView.setText(imagen.categoria)

                Glide.with(view).load(imagen.url).diskCacheStrategy(DiskCacheStrategy.NONE)
                    .into(imagenView)

                nombreView.setOnClickListener{
                    detalleLibro(view.context,imagen)
                }
            }

            fun detalleLibro(context: Context,libro: Libro){
                val intent = Intent(context.applicationContext,Detalles::class.java)
                context.startActivity(intent)
            }

        }

        //textView_Nombre

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LibroHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            return LibroHolder(layoutInflater.inflate(R.layout.cardview_libros, parent, false))
        }

        override fun onBindViewHolder(holder: LibroHolder, position: Int) {
            holder.setImagen(libros[position])
        }

        override fun getItemCount(): Int = libros.size

        fun agregarLibro(libro: Libro) {
            this.libros.add(libro)
            notifyItemInserted(itemCount)
        }

        /*private fun notifyItemInserted(itemCount: Any) {

        }*/
    }


