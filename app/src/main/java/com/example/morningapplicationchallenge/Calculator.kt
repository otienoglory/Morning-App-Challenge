package com.example.morningapplicationchallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Calculator : AppCompatActivity() {
    lateinit var cAns: TextView
    lateinit var mFirstnum: EditText
    lateinit var mSecondnum: EditText
    lateinit var cAdd: Button
    lateinit var cSub: Button
    lateinit var cDiv: Button
    lateinit var cMul: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        cAns=findViewById(R.id.mAns)
        mFirstnum=findViewById(R.id.mfirstnumber)
        mSecondnum=findViewById(R.id.msecondNumber)
        cAdd=findViewById(R.id.mAdd)
        cSub=findViewById(R.id.mSub)
        cDiv=findViewById(R.id.mDiv)
        cMul=findViewById(R.id.mMultiply)


        // set onClick listeners to all the buttons
        cAdd.setOnClickListener {
            // Receive the first and second number to compute
            var firstNumber = mFirstnum.text.toString().trim()
            var secondNumber = mSecondnum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                cAns.text = "Please enter valid number!!!"
            }else{
                // Proceed to compute the values
                var jibu = firstNumber.toDouble() + secondNumber.toDouble()
                cAns.text = jibu.toString()
            }
        }
        cSub.setOnClickListener {
            // Receive the first and second number to compute
            var firstNumber = mFirstnum.text.toString().trim()
            var secondNumber = mSecondnum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                cAns.text = "Please enter valid number!!!"
            }else{
                // Proceed to compute the values
                var jibu = firstNumber.toDouble() - secondNumber.toDouble()
                cAns.text = jibu.toString()
            }
        }
        cDiv.setOnClickListener {
            // Receive the first and second number to compute
            var firstNumber = mFirstnum.text.toString().trim()
            var secondNumber = mSecondnum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                cAns.text = "Please enter valid number!!!"
            }else{
                // Proceed to compute the values
                var jibu = firstNumber.toDouble() / secondNumber.toDouble()
                cAns.text = jibu.toString()
            }

        }
        cMul.setOnClickListener {
            // Receive the first and second number to compute
            var firstNumber = mFirstnum.text.toString().trim()
            var secondNumber = mSecondnum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                cAns.text = "Please enter valid number!!!"
            }else{
                // Proceed to compute the values
                var jibu = firstNumber.toDouble() * secondNumber.toDouble()
                cAns.text = jibu.toString()
            }

        }
    }

}
