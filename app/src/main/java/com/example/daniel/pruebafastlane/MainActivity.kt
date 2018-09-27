package com.example.daniel.pruebafastlane

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()  {

    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button
    private lateinit var button4: Button
    private lateinit var button5: Button
    private lateinit var button6: Button
    private lateinit var button7: Button
    private lateinit var button8: Button
    private lateinit var button9: Button
    private lateinit var buttonC: Button
    private lateinit var buttonPlus: Button
    private lateinit var buttonMinus: Button
    private lateinit var buttonEqual: Button
    private lateinit var textResult: TextView
    lateinit var result: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textResult = findViewById(R.id.text_result)

        result = ""

        button1 = findViewById(R.id.button_1)
        button1.setOnClickListener{
            addText(button1.text.toString())
        }

        button2 = findViewById(R.id.button_2)
        button2.setOnClickListener{
            addText(button2.text.toString())
        }

        button3 = findViewById(R.id.button_3)
        button3.setOnClickListener{
            addText(button3.text.toString())
        }

        button4 = findViewById(R.id.button_4)
        button4.setOnClickListener{
            addText(button4.text.toString())
        }

        button5 = findViewById(R.id.button_5)
        button5.setOnClickListener{
            addText(button5.text.toString())
        }

        button6 = findViewById(R.id.button_6)
        button6.setOnClickListener{
            addText(button6.text.toString())
        }

        button7 = findViewById(R.id.button_7)
        button7.setOnClickListener{
            addText(button7.text.toString())
        }

        button8 = findViewById(R.id.button_8)
        button8.setOnClickListener{
            addText(button8.text.toString())
        }

        button9 = findViewById(R.id.button_9)
        button9.setOnClickListener{
            addText(button9.text.toString())
        }

        buttonC = findViewById(R.id.button_C)
        buttonC.setOnClickListener{
            clearText()
        }

        buttonPlus = findViewById(R.id.button_plus)
        buttonPlus.setOnClickListener {
            addText(buttonPlus.text.toString())
        }

        buttonMinus = findViewById(R.id.button_minus)
        buttonMinus.setOnClickListener {
            addText(buttonMinus.text.toString())
        }

        buttonEqual = findViewById(R.id.button_equal)

    }

    fun clearText() {
        result = ""
        textResult.setText(result)
    }

    fun addText(number: String){
        result += "$number "
        textResult.setText(result)
    }
}
