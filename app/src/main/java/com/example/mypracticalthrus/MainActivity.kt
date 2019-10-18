package com.example.mypracticalthrus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Double.parseDouble
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = "Dice Rolled!"

        val rollButton2: Button = findViewById(R.id.roll_button2)
        rollButton2.setOnClickListener{ countDice()}

        val resetButton: Button = findViewById(R.id.roll_button3)
        resetButton.setOnClickListener{ reset()}

    }

    private fun rollDice() {
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()
        val resultText: TextView = findViewById(R.id.result_text)
        val randomInt = Random().nextInt(6) + 1
        resultText.text = randomInt.toString()

    }

    private fun countDice(){
        Toast.makeText(this, "Dice added",
            Toast.LENGTH_SHORT).show()

        var rtext: TextView = findViewById(R.id.result_text)
        var numeric = true
        var str: String = rtext.text.toString()
        try {
            val num = parseDouble(str)
        } catch (e: NumberFormatException) {
            numeric = false
        }

        if(numeric){

            var number: Int = Integer.parseInt(str) +1
            rtext.text = number.toString()
        }
        else {
           rtext.text =  "Hello World!"
        }
    }

    private fun reset(){
        Toast.makeText(this, "Reset Successfully!",
            Toast.LENGTH_SHORT).show()

        val rtext: TextView = findViewById(R.id.result_text)
        rtext.text = "0"
    }
}
