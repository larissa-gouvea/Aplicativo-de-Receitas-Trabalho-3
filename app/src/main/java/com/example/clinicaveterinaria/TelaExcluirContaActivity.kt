package com.example.clinicaveterinaria

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

lateinit var ExcluirBtnRetornar: Button


class TelaExcluirContaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_excluir_conta)

        ExcluirBtnRetornar = findViewById(R.id.excluir_btn_retornar)


        ExcluirBtnRetornar.setOnClickListener {
            val intent = Intent(this, InformacoesContaActivity::class.java)
            startActivity(intent)
        }

    }
}