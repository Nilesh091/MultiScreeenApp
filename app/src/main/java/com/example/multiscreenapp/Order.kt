 package com.example.multiscreenapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
//import kotlinx.android.synthetic.main.activity_order.TvOrder

 class Order : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)
        val ni6=findViewById<TextView>(R.id.TvOrder)
        val ordersOfCustomer=intent.getStringExtra(MainActivity.KEY)
        ni6.text=ordersOfCustomer.toString()
    }
}