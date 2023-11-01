package com.example.losram.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.losram.R
import com.example.losram.databinding.ItemprendasBinding
import com.example.losram.dataclases.Prendas


class PrendasAdapter : RecyclerView.Adapter<PrendasAdapter.PrendasAdapterViewHolder>() {
    private var context: Context? = null
    private var listaPrendas = mutableListOf<Prendas>()
    private var mListener: OnFavoritoClickListener? = null
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PrendasAdapter.PrendasAdapterViewHolder {
        context = parent.context
        return PrendasAdapterViewHolder(
            ItemprendasBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        )
    }

    override fun onBindViewHolder(holder: PrendasAdapter.PrendasAdapterViewHolder, position: Int) {
           holder.binding(listaPrendas[position])
               }

    override fun getItemCount(): Int = listaPrendas.size
    fun addPrendas(newListaPrendas: List<Prendas>) {
        listaPrendas.clear()
        listaPrendas.addAll(newListaPrendas)
    }

    interface OnFavoritoClickListener {
        fun onFavoritoClick(position: Int, nombre: String, id: Int)
    }

    fun setOnFavoritoClickListener(listener: OnFavoritoClickListener) {
        this.mListener = listener
    }

    inner class PrendasAdapterViewHolder(private val binding: ItemprendasBinding) :
            RecyclerView.ViewHolder(binding.root) {
            val ivCorazon: ImageView = itemView.findViewById(R.id.corazon_prendas)

            init {
                ivCorazon.setOnClickListener {
                    mListener?.let { listener ->
                        val position = adapterPosition
                        if (position != RecyclerView.NO_POSITION) {
                            val nombre =listaPrendas[position].nombrePrenda // obten el nombre del ítem en esta posición
                            val id = position // obten el id del ítem en esta posición
                                listener.onFavoritoClick(position, nombre, id)
                        }
                    }
                }
            }
                fun binding(data: Prendas) {
                    binding.TextViewNombrePrenda.text = data.nombrePrenda
                    binding.TextViewPrecio.text = data.precio.toString()
                    binding.TextViewDisponibilidad.text = data.disponibilidad
                    binding.imagenDeLista.setImageResource(data.imagenPrenda)
                }

            }


}