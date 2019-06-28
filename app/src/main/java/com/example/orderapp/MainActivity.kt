package com.example.orderapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.text.NumberFormat
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun submitOrder(view: View) {
        displayPrice(qty * 5)
    }

    private var qty = 0


    fun increase(view: View) {
        qty += 1
        displayQty(qty)
    }


    fun decrease(view: View) {
        qty -= 1
        displayQty(qty)
    }



    private fun displayQty(number: Int) {
        val quantity = findViewById<TextView>(R.id.quantity_value_textView)
        quantity.text = number.toString()

    }

    private fun displayPrice(number: Int) {
        val priceValue = findViewById<TextView>(R.id.price_value_textView)
        val msg1 = "Total : "
        val msg2 =  "\n Thank You !"
        val price = NumberFormat.getCurrencyInstance(Locale("en", "US")).format(number)
        val displayMsg = msg1 + price + msg2
        priceValue.text =displayMsg
    }
}

