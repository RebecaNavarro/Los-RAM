package com.example.losram.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.losram.Nombre_secciones
import com.example.losram.databinding.ItemTiendasBinding
import com.example.losram.dataclases.Tiendas

class TiendasAdapter :
    RecyclerView.Adapter<TiendasAdapter.TiendasAdapterViewHolder>() {

    private var context: Context? = null
    private var listatiendas = listOf<Tiendas>()
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TiendasAdapter.TiendasAdapterViewHolder {
        context = parent.context
        return TiendasAdapterViewHolder(
            ItemTiendasBinding.inflate(
                LayoutInflater.from(parent.context),parent,false
            )
        )
    }

    override fun onBindViewHolder(holder: TiendasAdapter.TiendasAdapterViewHolder, position: Int) {
       holder.binding(listatiendas[position])
    }


    override fun getItemCount(): Int = listatiendas.size

    inner class TiendasAdapterViewHolder(private val binding: ItemTiendasBinding) :
            RecyclerView.ViewHolder(binding.root) {
                fun binding(data: Tiendas){

                   binding.TextViewNombreTienda.text = data.nombreTienda
                    binding.TextViewDireccion.text = data.direccion
                    binding.TextViewAbiertoCerrado.text = data.estadoDeTienda
                    binding.imagenDeLista.setImageResource(data.imagenPrenda)
                    binding.puntuacionTienda.text = data.puntuacionTienda.toString()

                }

            }


    fun addTiendas(newlistaTiends: List<Tiendas>) {

            listatiendas = newlistaTiends
    }
}