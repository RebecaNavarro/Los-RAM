package com.example.losram

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.losram.databinding.ItemCarruselBinding

class CarruselAdapter(private var carrruselList: List<CarruselModel>): RecyclerView.Adapter<CarruselAdapter.CarruselViewHolder>() {
    class CarruselViewHolder(val binding:ItemCarruselBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarruselViewHolder {
        val binding =
            ItemCarruselBinding
                .inflate(LayoutInflater.from(parent.context), parent, false)
        return CarruselViewHolder(binding)
    }

    override fun getItemCount(): Int = carrruselList.size

    override fun onBindViewHolder(holder: CarruselViewHolder, position: Int) {

        val binding = holder.binding

        val promo = carrruselList[position]
        holder.binding.apply {
//            Glide.with(binding.carruselImage.context)
//                .load(carrruselList[position].imagen)
//                .into(binding.carruselImage)


            Glide.with(carruselImage).load(carrruselList[position].imagen).into(carruselImage)
//            promoName.text = promo.name
        }
    }
}