package com.example.losram.adapter

import android.content.Context
import android.content.SharedPreferences
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.os.persistableBundleOf
import androidx.recyclerview.widget.RecyclerView
import com.example.losram.databinding.ItemprendasBinding
import com.example.losram.dataclases.Prendas
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class PrendasAdapter : RecyclerView.Adapter<PrendasAdapter.PrendasAdapterViewHolder>() {
    private var context: Context? = null
    private var listaPrendas = mutableListOf<Prendas>()
    lateinit var tvCantProductos: TextView
    lateinit var btnVerCarro: Button
    lateinit var carroCompra: ArrayList<Prendas>
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

    inner class PrendasAdapterViewHolder(private val binding: ItemprendasBinding) :
            RecyclerView.ViewHolder(binding.root) {

                fun binding(data: Prendas) {
                    binding.TextViewNombrePrenda.text = data.nombrePrenda
                    binding.TextViewPrecio.text = data.precio.toString()
                    binding.TextViewDisponibilidad.text = data.disponibilidad
                    binding.imagenDeLista.setImageResource(data.imagenPrenda)
                    binding.checkBoxPrendas.setOnCheckedChangeListener{compoundButton, b ->
                        if(binding.checkBoxPrendas.isChecked){
                            tvCantProductos.text = "${Integer.parseInt(tvCantProductos.text.toString().trim()) +1}"
                            carroCompra.add(listaPrendas[adapterPosition]) //si hay algun error ver el position
                            guardarCarroCompras()
                        }else{
                            tvCantProductos.text = "${Integer.parseInt(tvCantProductos.text.toString().trim()) -1}"
                            carroCompra.remove(listaPrendas[adapterPosition])
                            guardarCarroCompras()
                        }

                    }
                }

        fun guardarCarroCompras() {
            val sharedPreferences: SharedPreferences? = context?.getSharedPreferences("carro_compras", Context.MODE_PRIVATE)

            sharedPreferences?.edit()?.apply{
                val gson = Gson()
                val carroComprasJson = gson.toJson(carroCompra)

                // Guardar la cadena JSON en SharedPreferences
                putString("carro_compras_json", carroComprasJson)

                // Aplicar los cambios
                apply()
            }

            val carroComprasJson = sharedPreferences?.getString("carro_compras_json", null)

            if(carroComprasJson != null){
                val gson = Gson()
                val type = object : TypeToken<ArrayList<Prendas>>() {}.type
                carroCompra = gson.fromJson(carroComprasJson, type)
            }
            tvCantProductos.text = carroCompra.size.toString()
        }

    }


}