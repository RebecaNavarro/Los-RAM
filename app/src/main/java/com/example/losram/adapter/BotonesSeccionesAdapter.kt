package com.example.losram.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View.OnClickListener
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.losram.databinding.ItemBotonesSeccionesBinding
import com.example.losram.dataclases.BotonSeccion

class BotonesSeccionesAdapter : RecyclerView.Adapter<BotonesSeccionesAdapter.BotonesSeccionesAdapterViewHolder>() {
    private var onClickListener : OnClickListener? = null
    private var context: Context?= null
    private val listaBotonesSecciones = mutableListOf<BotonSeccion>()
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
        position: Int
    ) {
        holder.binding(listaBotonesSecciones[position])
        holder.itemView.setOnClickListener{
            onClickListener?.onClick(position, listaBotonesSecciones[position])

        }
    }

    override fun getItemCount(): Int {
        return listaBotonesSecciones.size
    }
    fun setOnClickListener(onClickListener: OnClickListener) {
        this.onClickListener = onClickListener
    }

    interface OnClickListener {
        fun onClick(position: Int, model: BotonSeccion)
    }

    class BotonesSeccionesAdapterViewHolder(private val binding : ItemBotonesSeccionesBinding):RecyclerView.ViewHolder(binding.root){
        fun binding(data:BotonSeccion){
            binding.botonseccion.text=data.nombresec
        }
    }
    fun addBotonSeccion(newBotonesSecciones:List<BotonSeccion>){
        listaBotonesSecciones.clear()
        listaBotonesSecciones.addAll(newBotonesSecciones)
    }



}