package com.example.losram.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.losram.R
import com.example.losram.dataclases.Prendas

class CarritoAdapter (
     var tvTotal: TextView,
     var carroCompras: ArrayList<Prendas>
    ): RecyclerView.Adapter<CarritoAdapter.ViewHolder>() {

        var total: Double = 0.0

        class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
            val tvNomProducto = itemView.findViewById(R.id.tvNomProducto) as TextView
            val tvDescripcion = itemView.findViewById(R.id.tvDescripcion) as TextView
            val tvPrecio = itemView.findViewById(R.id.tvPrecio) as TextView
        }

        override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
        ): ViewHolder {
            val vista = LayoutInflater.from(parent.context).inflate(R.layout.item_carrito, parent, false)

            total = 0.0

            carroCompras.forEach {
                total += it.precio
            }

            tvTotal.text = "$$total"

            return ViewHolder(vista)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val producto = carroCompras[position]

            holder.tvNomProducto.text = producto.nombrePrenda
            holder.tvDescripcion.text = producto.descripcion
            holder.tvPrecio.text = "$${producto.precio}"
        }

        override fun getItemCount(): Int {
            return carroCompras.size
        }

    }
