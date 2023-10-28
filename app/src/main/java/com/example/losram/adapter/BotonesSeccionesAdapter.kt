package com.example.losram.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.losram.databinding.ItemBotonesSeccionesBinding

class BotonesSeccionesAdapter : RecyclerView.Adapter<BotonesSeccionesAdapter.BotonesSeccionesAdapterViewHolder>() {
     private var context: Context?= null
    private val listaBotones = mutableListOf<Boton_de_secciones>()
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BotonesSeccionesAdapter.BotonesSeccionesAdapterViewHolder {
        context=parent.context
        return BotonesSeccionesAdapterViewHolder(
            ItemBotonesSeccionesBinding.inflate(
                LayoutInflater.from(parent.context),parent,false
            )
        )
    }

    override fun onBindViewHolder(
        holder: BotonesSeccionesAdapter.BotonesSeccionesAdapterViewHolder,
        position: Int) {
        holder.binding(listaBotones[position])
        }

    override fun getItemCount(): Int = listaBotones.size

    inner class BotonesSeccionesAdapterViewHolder(private val binding: ItemBotonesSeccionesBinding):
            RecyclerView.ViewHolder(binding.root) {

                fun binding(data:Boton_de_secciones) {
                    binding.botonseccion.text = data.nombre_boton
                }
        fun addBoton(newListaBotones: List<Boton_de_secciones>) {
            listaBotones.clear()
            listaBotones.addAll(newListaBotones)
        }
            }

}