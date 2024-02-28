package com.example.sozcukuygulamasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sozcukuygulamasi.databinding.ActivityDetayBinding
import com.example.sozcukuygulamasi.databinding.ActivityMainBinding

class DetayActivity : AppCompatActivity() {
    private lateinit var binding :ActivityDetayBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityDetayBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val kelime  =intent.getSerializableExtra("nesne") as Kelimeler

        binding.textViewingilizce.text=kelime.ingilizce
        binding.textViewturkce.text=kelime.turkce
    }
}