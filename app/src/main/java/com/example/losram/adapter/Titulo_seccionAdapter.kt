package com.example.losram.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.losram.RecyclerViewTiendasActivity
import com.example.losram.databinding.ItemNombreSeccionTiendaBinding
import com.example.losram.dataclases.Titulo_seccion

class Titulo_seccionAdapter : RecyclerView.Adapter<Titulo_seccionAdapter.Titulo_seccionAdapterViewHolder>() {

    private var context: Context? = null
    private val titulos = mutableListOf<Titulo_seccion>()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): Titulo_seccionAdapter.Titulo_seccionAdapterViewHolder {
        context = parent.context
        return Titulo_seccionAdapterViewHolder (
            ItemNombreSeccionTiendaBinding.inflate(
                LayoutInflater.from(parent.context),parent,false
            )

          )
        }


    override fun onBindViewHolder(
        holder: Titulo_seccionAdapter.Titulo_seccionAdapterViewHolder,
        position: Int
    ) {
        holder.binding(titulos[position])
    }

    override fun getItemCount(): Int = titulos.size

    inner class Titulo_seccionAdapterViewHolder(private val binding: ItemNombreSeccionTiendaBinding) :
            RecyclerView.ViewHolder(binding.root) {

                fun binding(data: Titulo_seccion) {
                    binding.textViewTituloSeccion.text = data.texto_titulo_seccion
                }

            }
    fun addTitulo(newListaTitulos: List<Titulo_seccion>) {
        titulos.clear()
        titulos.addAll(newListaTitulos)
    }
}