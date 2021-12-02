package br.edu.ifspprc.teste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class OitavaTela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oitava_tela)
        val submeter: Button = findViewById(R.id.submit_6)
        val editText: EditText = findViewById(R.id.submissao_6)
    }
}