package gallery.mima.androidassessment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class CalculationActivity : AppCompatActivity() {
    lateinit var tilFirstNumber: TextInputLayout
    lateinit var etNumber1: EditText
    lateinit var etNumber2: EditText
    lateinit var tilSecondNumber: TextInputLayout
    lateinit var tvOutput: TextView
    lateinit var btnAdd: Button
    lateinit var btnMinus: Button
    lateinit var btnDivide: Button
    lateinit var btnModulus: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculation)

        tilFirstNumber = findViewById(R.id.tilFirstNumber)
        tilSecondNumber = findViewById(R.id.tilSecondNumber)
        etNumber1 = findViewById(R.id.etNumber1)
        etNumber2 = findViewById(R.id.etNumber2)
        tvOutput = findViewById(R.id.tvOutput)
        btnAdd = findViewById(R.id.btnAdd)
        btnMinus = findViewById(R.id.btnMinus)
        btnDivide = findViewById(R.id.btnDivide)
        btnModulus = findViewById(R.id.btnModulus)

        btnAdd.setOnClickListener {
            val Num1 = etNumber1.text.toString()
            val Num2 = etNumber2.text.toString()
            addition(Num1.toInt(), Num2.toInt())
        }

        btnMinus.setOnClickListener {
            val Num1 = etNumber1.text.toString()
            val Num2 = etNumber2.text.toString()
            subtraction(Num1.toInt(), Num2.toInt())
        }


        btnDivide.setOnClickListener {
            val Num1 = etNumber1.text.toString()
            val Num2 = etNumber2.text.toString()
            division(Num1.toInt(), Num2.toInt())
        }


        btnModulus.setOnClickListener {
            val Num1 = etNumber1.text.toString()
            val Num2 = etNumber2.text.toString()
            modulus(Num1.toInt(), Num2.toInt())
        }
    }

    fun addition(Num1: Int, Num2: Int) {
        var total = Num1 + Num2
        tvOutput.text = total.toString()
    }

    fun subtraction(Num1: Int, Num2: Int) {
        var subtract = Num1 - Num2
        tvOutput.text = subtract.toString()
    }

    fun division(Num1: Int, Num2: Int) {
        var divide = Num1 / Num2
        tvOutput.text = divide.toString()
    }

    fun modulus(Num1: Int, Num2: Int) {
        var quotient = Num1 % Num2
        tvOutput.text = quotient.toString()
    }

}


