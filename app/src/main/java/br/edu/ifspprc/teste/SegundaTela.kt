package br.edu.ifspprc.teste

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class SegundaTela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_tela)
        val submeter: Button = findViewById(R.id.submit_1)
        val editText: EditText = findViewById(R.id.submissao)
        submeter.setOnClickListener{
            if (editText.text.toString() == "O ser humano"){
                Toast.makeText(this@SegundaTela, "Acertou!", Toast.LENGTH_SHORT).show()
                IrParaTerceiraTela()
            }
            else{
                Toast.makeText(this@SegundaTela, "Errou, tente novamente", Toast.LENGTH_SHORT).show()
                editText.setText("");

            }
        }
    }

    private fun IrParaTerceiraTela(){
        val intent = Intent(this, TerceiraTela::class.java)
        startActivity(intent)
    }
}