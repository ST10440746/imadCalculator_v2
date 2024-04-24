package com.ST10440746.imadcalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.sqrt


class MainActivity : AppCompatActivity() {

   private var etNum1 :EditText? = null
   private var etNum2 :EditText? = null
   private var tvDisplay : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNum1 = findViewById(R.id.etNum1)
        etNum2 = findViewById(R.id.etNum2)
        tvDisplay = findViewById(R.id.tvDisplay)

        val btnAdd = findViewById<Button>(R.id.btnAdd)
        btnAdd.setOnClickListener { add() }

        val btnSub = findViewById<Button>(R.id.btnSub)
        btnSub.setOnClickListener { sub() }

        val btnMul = findViewById<Button>(R.id.btnMul)
        btnMul.setOnClickListener { mul() }

        val btnDiv = findViewById<Button>(R.id.btnDiv)
        btnDiv.setOnClickListener { div() }

        val btnSqr = findViewById<Button>(R.id.btnSqr)
        btnSqr.setOnClickListener { sqr() }

        val btnPow = findViewById<Button>(R.id.btnPow)
        btnPow.setOnClickListener { pow() }

        val btnNextSc = findViewById<Button>(R.id.btnNextScreen)
        btnNextSc.setOnClickListener {
            // call the next screen

            val intent = Intent( this, MainActivity2::class.java)
            // start your next activity
            startActivity(intent)
        }


    }




    private fun add(){
        val input1 = etNum1?.text?.toString()
        val input2 = etNum2?.text?.toString()
         /*
        if (input1.isNullOrEmpty() || input2.isNullOrEmpty()) {
            tvDisplay?.text = " Please enter a valid number ."
            return
        }
        */
        val intNum1 = input1!!.toInt()
        val intNum2 = input2!!.toInt()
        var intAnswer = 0

        for (i in 1..intNum2) {
            intAnswer =  intNum1 + intNum2
        }

        tvDisplay?.text = intAnswer.toString()
    }



    private fun sub(){
        val input1 = etNum1?.text?.toString()
        val input2 = etNum2?.text?.toString()

        if (input1.isNullOrEmpty() || input2.isNullOrEmpty()) {
            tvDisplay?.text = "Please enter a valid number ."
            return
        }
        val intNum1 = input1.toInt()
        val intNum2 = input2.toInt()
        var intAnswer = 1

        for (i in 1..intNum2) {
            intAnswer = intNum1 - intNum2
        }

        tvDisplay?.text = intAnswer.toString()
    }

    private fun mul(){
        val input1 = etNum1?.text?.toString()
        val input2 = etNum2?.text?.toString()

        if (input1.isNullOrEmpty() || input2.isNullOrEmpty()) {
            tvDisplay?.text = "Please enter a valid number ."
            return
        }
        val intNum1 = input1.toInt()
        val intNum2 = input2.toInt()
        var intAnswer = 0

        for (i in 1..intNum2) {
            intAnswer = intNum1 * intNum2
        }

        tvDisplay?.text = intAnswer.toString()
    }

    private fun div() {
        val input1 = etNum1?.text?.toString()
        val input2 = etNum2?.text?.toString()

        if (input1.isNullOrEmpty() || input2.isNullOrEmpty()) {
            tvDisplay?.text = "Please enter a valid number ."
            return
        }
        val intNum1 = input1.toInt()
        val intNum2 = input2.toInt()
        var fltAnswer = 0

        for (i in 1..intNum2) {

            if (intNum2 == 0) {
                tvDisplay?.text = "Division by zero is not allowed"

            } else {

                fltAnswer = intNum1 / intNum2
            }

            tvDisplay?.text = fltAnswer.toString()
        }
    }

    private fun sqr(){
        val input1 = etNum1?.text?.toString()
        val input2 = etNum2?.text?.toString()

        if (input1.isNullOrEmpty()){ // || input2.isNullOrEmpty()) {
            tvDisplay?.text = "Please enter a valid number ."
            return
        }
        val intNum1 = input1.toInt()
        //val intNum2 = input2.toInt()
        var fltAnswer = 1

        //for (i in 1..intNum2) {

            //val squareRoot = sqrt(intNum1.toDouble())

            fltAnswer = sqrt(intNum1.toDouble()).toInt()


//        }

        tvDisplay?.text = fltAnswer.toString()
    }

    private fun pow(){

        val input1 = etNum1?.text?.toString()
        val input2 = etNum2?.text?.toString()

        if (input1.isNullOrEmpty() || input2.isNullOrEmpty()) {
            tvDisplay?.text = "Please enter a valid number ."
            return
        }
        val intNum1 = input1.toInt()
        val intNum2 = input2.toInt()
        var intAnswer = 1

        // intAnswer = intNum1.pow(intNum2)

        for (i in 1..intNum2) {
            intAnswer *= intNum1
        }

      tvDisplay?.text = intAnswer.toString()
    }
}
