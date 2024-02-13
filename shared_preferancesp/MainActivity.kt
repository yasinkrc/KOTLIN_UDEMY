package com.example.shared_preferancesp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.shared_preferancesp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.buttonGit.setOnClickListener {

            val sp =getSharedPreferences("KisiselBilgiler", Context.MODE_PRIVATE)
            val editor =sp.edit()
            editor.putString("ad","Ahmet")
            editor.putInt("yas",18)
            editor.putFloat("boy",1.78f)
            editor.putBoolean("bekarMi",true)
            val arkadasListesi =HashSet<String>()
            arkadasListesi.add("Zeynep")
            arkadasListesi.add("Ece")
            arkadasListesi.add("Ali")

            editor.putStringSet("arkadasListesi",arkadasListesi)
            editor.commit()
            startActivity(Intent(this@MainActivity,Activityb::class.java))
            finish()
        }
    }
}