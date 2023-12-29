package com.larisantos.aulamodulos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.Valida
import com.larisantos.api.Retrofit
import com.larisantos.aulamodulos.databinding.ActivityMainBinding
import com.larisantos.autenticacao.AutenticacaoActivity
import com.larisantos.banco.BancoDadosApp

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnAbrirLogin.setOnClickListener {
            startActivity(
                Intent(this, AutenticacaoActivity::class.java)
            )
        }

        /*Valida.validarData()
        Retrofit.configuracao()
        BancoDadosApp.configurarBanco()*/

    }
}