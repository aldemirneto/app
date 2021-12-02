package br.edu.ifspprc.teste

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class SextaTela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sexta_tela)
        val submeter: Button = findViewById(R.id.submit_5)
        val editText: EditText = findViewById(R.id.submissao_5)
        val dica: Button = findViewById(R.id.Dica3)

        dica.setOnClickListener {
            Toast.makeText(this@SextaTela, "A imagem acima pode ou nao pode ser um ESTEREOGRAMA", Toast.LENGTH_SHORT).show()
        }
        submeter.setOnClickListener{
            if (editText.text.toString() == "Homer") {
                Toast.makeText(this@SextaTela, "Acertou!", Toast.LENGTH_SHORT).show()
                irParaSetimaTela()

            }

            else{
                Toast.makeText(this@SextaTela, "Errou, tente novamente", Toast.LENGTH_SHORT).show()
                editText.setText("")


            }
        }
    }

    private fun irParaSetimaTela() {
        val intent = Intent(this, SetimaTela::class.java )
        startActivity(intent)
    }
    }
