package com.fiap.myapplication

// Importa as classes necessárias para o código
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.myapplication.R
import java.util.Scanner

// Declara a classe MainActivity que herda da classe AppCompatActivity
class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Define o layout da tela usando o arquivo de layout activity_main.xml
        setContentView(R.layout.activity_main)

        // Encontra o botão na interface do usuário usando o ID 'button'
        val button = findViewById<Button>(R.id.button)
        val textView = findViewById<TextView>(R.id.textView) // Encontra a TextView

        fun calcularPesoIdeal(sexo: String, altura: Double): Double {
            return if (sexo.toLowerCase() == "masculino") {
                altura - 100
            } else {
                altura - 110
            }
        }

        fun main() {
            val scanner = Scanner(System.`in`)
            val sexo = scanner.nextLine()
            val altura = scanner.nextDouble()
            val pesoIdeal = calcularPesoIdeal(sexo, altura)

        }

    }

}