package br.edu.ifspprc.teste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class OitavaTela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oitava_tela)
        val submeter: Button = findViewById(R.id.submit_7)


        submeter.setOnClickListener {
            Toast.makeText(this@OitavaTela, "obrigado por jogar!", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}