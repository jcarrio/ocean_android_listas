package com.example.ocean_android_listas

import android.media.Image
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ItemAdapter (
    val itens: List<Pessoa>
        ) : RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindView(item: Pessoa) {
            val imagem = itemView.findViewById<ImageView>(R.id.imagem)
            val tvTitulo = itemView.findViewById<TextView>(R.id.tvTitulo)
            val btAcao = itemView.findViewById<Button>(R.id.btAcao)

            tvTitulo.text = item.nome;
            // Com Atenas
            Glide.with(itemView).load(item.imagemUrl).into(imagem)
            // Com Sparta
            // - Fazer o download
            // - Tratar os problemas
            // - Atribuir a imagem
            btAcao.setOnClickListener {
                Toast.makeText(itemView.context,item.acao,Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_item, parent,false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = itens[position]
        holder.bindView(item)
    }

    override fun getItemCount(): Int {
        return itens.size;
    }
}