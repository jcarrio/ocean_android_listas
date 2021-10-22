package com.example.ocean_android_listas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Layout Manager
        val rvPessoas = findViewById<RecyclerView>(R.id.rvPessoas)
        rvPessoas.layoutManager = LinearLayoutManager(this)

        // Adapter
        val elvis = Pessoa("Elvis Presley", "http://s2.glbimg.com/8nsQk5XkGOWiGbBbI64Wcg213IY=/top/e.glbimg.com/og/ed/f/original/2016/01/09/smiley-face-elvis-presley-smile-haircut-eyes-988181-1-1024x768.jpg", "Rei do Rock!")
        val michael = Pessoa("Michael Jackson", "https://br.web.img3.acsta.net/c_310_420/pictures/210/152/21015281_20130625213155152.jpg", "Rei do Pop!")
        val pele = Pessoa("Pelé", "https://www.gazetaesportiva.com/wp-content/uploads/imagem/2020/04/24/url-906x1024.jpeg", "Rei do Futebol!")
        val xuxa = Pessoa("Xuxa", "https://cdns-images.dzcdn.net/images/artist/90d4f4da08c169589600b394a23dde8e/264x264.jpg", "Rainha dos Baixinhos!")
        val fagundes = Pessoa("Antonio Fagundes", "https://www20.opovo.com.br/images/app/noticia_132346504881/2014/10/02/3324318/rei-do-gado.png", "Rei do Gado")

        val itens = listOf(elvis, michael,pele, xuxa, fagundes)
        rvPessoas.adapter = ItemAdapter(itens)

        val botao = findViewById<Button>(R.id.button)
        val progressBar = findViewById<ProgressBar>(R.id.progressBar)

        botao.setOnClickListener {
            TaskAssincrona().execute()
        }
    }
}