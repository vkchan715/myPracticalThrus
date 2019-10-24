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

        val roll2: Button = findViewById(R.id.roll2)
        roll2.setOnClickListener { rollDice2() }

        val roll3: Button = findViewById(R.id.roll3)
        roll3.setOnClickListener { rollDice3() }

        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = "Dice Rolled!"

        val rollButton2: Button = findViewById(R.id.roll_button2)
        rollButton2.setOnClickListener{ countDice()}

        val resetButton: Button = findViewById(R.id.roll_button3)
        resetButton.setOnClickListener{ reset()}

        val sumButton: Button = findViewById(R.id.sumbutton)
        sumButton.setOnClickListener{ sum() }

    }

    private fun rollDice() {
            Toast.makeText(this, "button clicked",
                Toast.LENGTH_SHORT).show()
            val resultText: TextView = findViewById(R.id.result_text)
            val randomInt = Random().nextInt(6) + 1
            resultText.text = randomInt.toString()
        }
    private fun rollDice2() {
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()

        var rtext2: TextView = findViewById(R.id.rtext2)

        val randomInt = Random().nextInt(6) + 1

        rtext2.text=randomInt.toString()
    }
    private fun rollDice3() {
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()
        var rtext3: TextView = findViewById(R.id.rtext3)
        val randomInt = Random().nextInt(6) + 1
        rtext3.text=randomInt.toString()
    }

    private fun countDice(){
        Toast.makeText(this, "Dice added",
            Toast.LENGTH_SHORT).show()

        var rtext: TextView = findViewById(R.id.result_text)
        var rtext2: TextView = findViewById(R.id.rtext2)
        var rtext3: TextView = findViewById(R.id.rtext3)
        var numeric = true
        var str: String = rtext.text.toString()
        var str2: String = rtext2.text.toString()
        var str3: String = rtext3.text.toString()

        try {
            val num = parseDouble(str)
            val num2 = parseDouble(str2)
            val num3 = parseDouble(str3)
        } catch (e: NumberFormatException) {
            numeric = false
        }

        if(numeric){
            if(str != "6"){
                var number: Int = Integer.parseInt(str) + 1
                rtext.text = number.toString()
            }
            if(str2 != "6"){
                  var number2: Int = Integer.parseInt(str2) + 1
                  rtext2.text = number2.toString()
            }
            if(str3 != "6"){
                var number3: Int = Integer.parseInt(str3) + 1
                 rtext3.text = number3.toString()
            }
        }
        else {
           rtext.text =  "1"
            rtext2.text =  "1"
            rtext3.text =  "1"
        }
    }

    private fun reset(){
        Toast.makeText(this, "Reset Successfully!",
            Toast.LENGTH_SHORT).show()

        val retext: TextView = findViewById(R.id.result_text)
        val retext2: TextView = findViewById(R.id.rtext2)
        val retext3: TextView = findViewById(R.id.rtext3)
        retext.text = "0"
        retext2.text = "0"
        retext3.text = "0"
    }

    private fun sum(){
        Toast.makeText(this, "Sum Successfully!",
            Toast.LENGTH_SHORT).show()

        var rtext: TextView = findViewById(R.id.result_text)
        var rtext2: TextView = findViewById(R.id.rtext2)
        var rtext3: TextView = findViewById(R.id.rtext3)
        var totalresult: TextView = findViewById(R.id.totalresult)

        var number: Int = Integer.parseInt(rtext.text.toString())
        var number2: Int = Integer.parseInt(rtext2.text.toString())
        var number3: Int = Integer.parseInt(rtext3.text.toString())
        var total: Int= number + number2 + number3

        totalresult.text = total.toString()

    }
}
