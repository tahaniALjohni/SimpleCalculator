package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var firstEntry: EditText
    private lateinit var secondEntry: EditText
    private lateinit var resultTV: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstEntry= findViewById(R.id.firstNum)
        secondEntry= findViewById(R.id.secondNum)
        resultTV= findViewById(R.id.tvResult)

    }

    fun plus(view: View) {
        if (firstEntry.text.isNotBlank()&&secondEntry.text.isNotBlank())
            "${firstEntry.text.toString().toFloat()+secondEntry.text.toString().toFloat()}".also { resultTV.text = it }
        else
            Toast.makeText(this,"Please Enter Valid Values",Toast.LENGTH_SHORT).show()
    }

    fun minus(view: View) {
        if (firstEntry.text.isNotBlank()&&secondEntry.text.isNotBlank())
            "${firstEntry.text.toString().toFloat()-secondEntry.text.toString().toFloat()}".also { resultTV.text = it }
        else
            Toast.makeText(this,"Please Enter Valid Values",Toast.LENGTH_SHORT).show()
    }

    fun multiply(view: View) {
        if (firstEntry.text.isNotBlank()&&secondEntry.text.isNotBlank())
            "${firstEntry.text.toString().toFloat()*secondEntry.text.toString().toFloat()}".also { resultTV.text = it }
        else
            Toast.makeText(this,"Please Enter Valid Values",Toast.LENGTH_SHORT).show()
    }

    fun divide(view: View) {
        if (firstEntry.text.isNotBlank()&&secondEntry.text.isNotBlank()) {
            if (secondEntry.text.toString().toFloat() != 0f)
                "${
                    firstEntry.text.toString().toFloat() / secondEntry.text.toString().toFloat()
                }".also { resultTV.text = it }
            else
                Toast.makeText(this,"Can't divide by 0",Toast.LENGTH_SHORT).show()
        }
        else
            Toast.makeText(this,"Please Enter Valid Values",Toast.LENGTH_SHORT).show()
    }
}