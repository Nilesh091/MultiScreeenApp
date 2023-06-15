package com.example.multiscreenapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
//import kotlinx.android.synthetic.main.activity_main.Et
//import kotlinx.android.synthetic.main.activity_main.Et1
//import kotlinx.android.synthetic.main.activity_main.Et2
//import kotlinx.android.synthetic.main.activity_main.Et3
//import kotlinx.android.synthetic.main.activity_main.button

class MainActivity : AppCompatActivity() {
    //creating Key
    companion object{
        const val KEY="com.example.multiscreenapp.MainActivity.KEY"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val  ni = findViewById<Button>(R.id.button)
        val  ni1 = findViewById<EditText>(R.id.Et1)
        val  ni2 = findViewById<EditText>(R.id.Et2)
        val  ni3 = findViewById<EditText>(R.id.Et3)
        val  ni4 = findViewById<EditText>(R.id.Et)



        ni.setOnClickListener{
            val message= ni1.text.toString() + " " + ni2.text.toString() + " " + ni3.text.toString() + " " +
                    ni4.text.toString()
            intent= Intent(this,Order::class.java)
            intent.putExtra(KEY,message)
            startActivity(intent)
        }
    }
}