package com.godiapper.bookodemia.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.godiapper.bookodemia.Libro
import com.godiapper.bookodemia.R
import kotlinx.android.synthetic.main.dialog_add_libro.view.*
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.google.android.material.card.MaterialCardView


class AdapterLibro (val libros: MutableList<Libro>){/*:
   RecyclerView.Adapter<AdapterLibro.LibroHolder>() {
    class LibroHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val cardView : MaterialCardView = view.findViewById(R.id.cardView_agrgar_libro)
        val imagenView : ImageView = view.findViewById(R.id.imageView_libro)
        val nombreView : TextView = view.findViewById(R.id.textView_Nombre)
        val anioView : TextView = view.findViewById(R.id.textView_Anio)

        fun setImagen(imagen: Libro){

            nombreView.setText(imagen.nombre)
            anioView.setText(imagen.anio.toString())

            Glide.with(view).load(imagen.url).diskCacheStrategy(DiskCacheStrategy.NONE)
                .into(imagenView)

            cardView.setOnClickListener {
//                Snackbar.make(view, "Tap en ${koder.nombre}", Snackbar.LENGTH_SHORT).show()
                //showDialog(view.context, Libro)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LibroHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return LibroHolder(layoutInflater.inflate(R.layout.dialog_add_libro, parent, false))
    }

    override fun onBindViewHolder(holder: LibroHolder, position: Int) {
        holder.setImagen(libros[position])
    }

    override fun getItemCount(): Int = libros.size

    fun agregarLibro(libro: Libro){
        this.libros.add(libro)
        notifyItemInserted(itemCount)
    }*/
}