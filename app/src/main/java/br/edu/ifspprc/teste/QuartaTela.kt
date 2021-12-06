package br.edu.ifspprc.teste

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class QuartaTela : AppCompatActivity() {
    private var mediaPlayer = MediaPlayer()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quarta_tela)
        val submeter: Button = findViewById(R.id.submit_3)
        val comecar: ImageView = findViewById(R.id.iniciar_musica)
        val editText: EditText = findViewById(R.id.submissao_3)
        val parar: ImageView = findViewById(R.id.parar_musica)
        mediaPlayer = MediaPlayer.create(this, R.raw.som)
        val dica: Button = findViewById(R.id.Dica)
        dica.setOnClickListener {
            Toast.makeText(this@QuartaTela, "--.- ..- .- .-.. / .- / -- . .-.. .... --- .-. / ..-. .- -.-. ..- .-.. -.. .- -.. . / -.. --- / -... .-. .- ... .. .-.. ..--..", Toast.LENGTH_LONG).show()
        }
        comecar.setOnClickListener{

            if(mediaPlayer.isPlaying){
                mediaPlayer.pause()
                comecar.setImageResource(R.drawable.ic_baseline_pause_24)
            }
            else{
                mediaPlayer.start()
                comecar.setImageResource(R.drawable.ic_baseline_play_arrow_24)
            }
        }
        submeter.setOnClickListener{
            if (editText.text.toString().lowercase() == "ifsp") {
                Toast.makeText(this@QuartaTela, "Acertou!", Toast.LENGTH_SHORT).show()
                irParaQuintaTela()
                mediaPlayer.stop()
                finish()

            }

            else{
                Toast.makeText(this@QuartaTela, "Errou, tente novamente", Toast.LENGTH_SHORT).show()
                editText.setText("")
                mediaPlayer.stop()
                mediaPlayer = MediaPlayer.create(this, R.raw.som)

            }
        }
        parar.setOnClickListener{
            if(mediaPlayer.isPlaying){
                mediaPlayer.stop()
                mediaPlayer = MediaPlayer.create(this, R.raw.som)
            }
        }

    }

    private fun irParaQuintaTela() {
        val intent = Intent(this, QuintaTela::class.java)
        startActivity(intent)
    }
}