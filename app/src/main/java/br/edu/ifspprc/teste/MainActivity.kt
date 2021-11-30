package br.edu.ifspprc.teste

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botao: Button = findViewById(R.id.bt_segunda_tela)
        botao.setBackgroundResource(R.color.black)
        botao.setOnClickListener{
            IrParaSegundaTela()
        }

    }
    private fun IrParaSegundaTela(){
        val intent = Intent(this, SegundaTela::class.java)
        startActivity(intent)
    }
}