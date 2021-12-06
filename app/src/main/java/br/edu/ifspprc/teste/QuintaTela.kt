package br.edu.ifspprc.teste

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class QuintaTela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quinta_tela)
        val submeter: Button = findViewById(R.id.submit_4)
        val editText: EditText = findViewById(R.id.submissao_4)
        val dica: Button = findViewById(R.id.Dica2
        )
        dica.setOnClickListener {
            Toast.makeText(this@QuintaTela, "Desencriptar é a BASE de tudo", Toast.LENGTH_SHORT).show()
        }
        submeter.setOnClickListener{
            if (editText.text.toString() == "2010") {
                Toast.makeText(this@QuintaTela, "Acertou!", Toast.LENGTH_SHORT).show()
                irParaSextaTela()
                finish()


            }

            else{
                Toast.makeText(this@QuintaTela, "Errou, tente novamente", Toast.LENGTH_SHORT).show()
                editText.setText("")


            }
        }
    }

    private fun irParaSextaTela() {
        val intent = Intent(this, SextaTela::class.java )
        startActivity(intent)
    }


}