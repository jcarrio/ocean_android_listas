package com.example.ocean_android_listas

import android.os.AsyncTask
import android.widget.Toast

class TaskAssincrona() : AsyncTask<String,String,String>() {

    // Executado previamente, no início
    override fun onPreExecute() {
        super.onPreExecute()

        // Executa algo antes de iniciar a task
        // ex: Glide, Retrofit
    }

    override fun doInBackground(vararg params: String?): String {
        // Implementação do seu algoritmo super potente

        return ""
    }

    override fun onProgressUpdate(vararg values: String?) {
        super.onProgressUpdate(*values)

        // Notifica a thread principal sobre algo
    }

    override fun onPostExecute(result: String?) {
        super.onPostExecute(result)

        // Executa algo quando a task termina
    }

    override fun onCancelled() {
        super.onCancelled()

        // O que fazer quando algum método encerra a task
    }
}