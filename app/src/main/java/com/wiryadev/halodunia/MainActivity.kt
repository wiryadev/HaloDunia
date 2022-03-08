package com.wiryadev.halodunia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name = "Bambang"

        Log.d("BINARIAN", "Halo $name")
    }
    fun punyaGua(){
        print("Hola!")
    }
}