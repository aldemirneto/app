package br.edu.ifspprc.teste

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SetimaTela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setima_tela)
        val submeter: Button = findViewById(R.id.submit_6)
        val editText: EditText = findViewById(R.id.submissao_6)
        val dica: Button = findViewById(R.id.Dica4)

        dica.setOnClickListener {
            Toast.makeText(this@SetimaTela, "Talvez você nao esteja brilhando o suficiente", Toast.LENGTH_SHORT).show()
        }
        submeter.setOnClickListener{
            if (editText.text.toString() == "Lumos") {
                Toast.makeText(this@SetimaTela, "Acertou!", Toast.LENGTH_SHORT).show()
                irParaOitavaTela()

            }

            else{
                Toast.makeText(this@SetimaTela, "Errou, tente novamente", Toast.LENGTH_SHORT).show()
                editText.setText("")


            }
        }
    }

    private fun irParaOitavaTela() {
        val intent = Intent(this, OitavaTela::class.java )
        startActivity(intent)
    }
    }
