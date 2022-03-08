package com.wiryadev.halodunia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wiryadev.halodunia.databinding.ActivityConstraintBinding

class ConstraintActivity : AppCompatActivity() {

    private lateinit var binding: ActivityConstraintBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConstraintBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun abc(){
        println("CDE")
    }

    fun testAfif(){
        println("Selamat malam!")
        tesnuyuy()
    }

    fun tesnuyuy (){
        println("Hola!")
    }
    //hurrraaa
}