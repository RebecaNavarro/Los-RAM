package com.example.losram.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.losram.Nombre_secciones
import com.example.losram.R
import com.example.losram.databinding.ItemBotonesSeccionesBinding

class BotonesAdapter(val titulosDeBotones:List<Nombre_secciones>,val nav:(Nombre_secciones)->Unit):RecyclerView.Adapter<BotonesAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BotonesAdapter.ViewHolder {
       return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_botones_secciones,parent,false))
    }


    override fun onBindViewHolder(holder: BotonesAdapter.ViewHolder, position: Int) {
        holder.bind(titulosDeBotones[position],nav)
    }

    override fun getItemCount(): Int {
       return titulosDeBotones.size
    }
    inner class ViewHolder(view:View):RecyclerView.ViewHolder(view) {
        private val binding = ItemBotonesSeccionesBinding.bind(view)

        fun bind(titulo: Nombre_secciones, nav: (Nombre_secciones) -> Unit) {
            binding.botonseccion.text=titulo.getTitulo()
            binding.botonseccion.setOnClickListener{
                nav(titulo)
            }
        }
    }
}