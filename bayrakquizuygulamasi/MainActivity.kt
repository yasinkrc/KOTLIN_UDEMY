package com.example.bayrakquizuygulamasi

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bayrakquizuygulamasi.databinding.ActivityMainBinding
import com.info.sqlitekullanimihazirveritabani.DatabaseCopyHelper

class MainActivity : AppCompatActivity() {
    private lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        veriTabaniKopyala()

        binding.buttonBasla.setOnClickListener {

            startActivity(Intent(this@MainActivity,QuizActivity::class.java))

        }
    }

    fun veriTabaniKopyala(){

        val copyHelper=DatabaseCopyHelper(this)

        try {
            copyHelper.createDataBase()
            copyHelper.openDataBase()
        }
        catch (e:Exception){

            e.printStackTrace()
        }
    }


}