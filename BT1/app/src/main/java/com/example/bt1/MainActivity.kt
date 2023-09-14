package com.example.bt1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fun buildAquarium() {
            val myAquarium = Aquarium()
            Aquarium.printSize()
            myAquarium.height = 60
            myAquarium.printSize()
        }
        fun main() {
            buildAquarium()
        }
    }
}