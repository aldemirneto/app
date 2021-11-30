package br.edu.ifspprc.teste

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class TerceiraTela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terceira_tela)
        val submet: Button = findViewById(R.id.botao_2)
        val text: EditText = findViewById(R.id.submissao_1)
        submet.setOnClickListener{
            if (text.text.toString() == "A agua"){
                Toast.makeText(this@TerceiraTela, "Acertou!", Toast.LENGTH_SHORT).show()
                irParaQuartaTela()

            }
            else if (text.text.toString() == "agua"){
                Toast.makeText(this@TerceiraTela, "Acertou!", Toast.LENGTH_SHORT).show()
                irParaQuartaTela()
            }

            else{
                Toast.makeText(this@TerceiraTela, "Errou, tente novamente", Toast.LENGTH_SHORT).show()
                text.setText("")

            }
        }
    }

    private fun irParaQuartaTela(){
        val intent = Intent(this, QuartaTela::class.java)
        startActivity(intent)
    }
}