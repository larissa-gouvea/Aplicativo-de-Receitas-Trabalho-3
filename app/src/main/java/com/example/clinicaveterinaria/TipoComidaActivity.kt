package com.example.clinicaveterinaria

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
lateinit var TipoBtnDoce: Button
lateinit var TipoBtnSalgados: Button
lateinit var TipoBtnVegano: Button
lateinit var TipoBtnSemAcucar: Button
lateinit var TipoBtnSemLactose: Button
lateinit var TipoBtnPontos: Button

class TipoComidaActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tipo_comida)
        TipoBtnDoce = findViewById(R.id.tipo_btn_doces)
        TipoBtnSalgados = findViewById(R.id.tipo_btn_salgados)
        TipoBtnVegano = findViewById(R.id.tipo_btn_vegano)
        TipoBtnSemAcucar = findViewById(R.id.tipo_btn_sem_acucar)
        TipoBtnSemLactose = findViewById(R.id.tipo_btn_sem_lactose)
        TipoBtnPontos = findViewById(R.id.tipo_btn_pontos)

        TipoBtnDoce.setOnClickListener {
            val intent = Intent(this, TelaListaReceitasActivity::class.java)
            startActivity(intent)
        }
        TipoBtnSalgados.setOnClickListener {
            val intent = Intent(this, TelaListaReceitasActivity::class.java)
            startActivity(intent)
        }
        TipoBtnVegano.setOnClickListener {
            val intent = Intent(this, TelaListaReceitasActivity::class.java)
            startActivity(intent)
        }
        TipoBtnSemAcucar.setOnClickListener {
            val intent = Intent(this, TelaListaReceitasActivity::class.java)
            startActivity(intent)
        }
        TipoBtnSemLactose.setOnClickListener {
            val intent = Intent(this, TelaListaReceitasActivity::class.java)
            startActivity(intent)
        }
        TipoBtnPontos.setOnClickListener {
            val intent = Intent(this, InformacoesContaActivity::class.java)
            startActivity(intent)
        }
    }
}