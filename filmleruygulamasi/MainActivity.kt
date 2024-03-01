package com.example.filmleruygulamasi

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.filmleruygulamasi.databinding.ActivityMainBinding
import com.info.sqlitekullanimihazirveritabani.DatabaseCopyHelper

class MainActivity : AppCompatActivity() {
    private lateinit var binding :ActivityMainBinding
    private lateinit var kategoriListe:ArrayList<Kategoriler>
    private lateinit var adapter: KategoriAdapter
    private lateinit var vt : VeritabaniYardimcisi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbar.title="Kategoriler"
        setSupportActionBar(binding.toolbar)
        veritabaniKopyala()

        binding.rv.setHasFixedSize(true)
        binding.rv.layoutManager=LinearLayoutManager(this)

        vt  = VeritabaniYardimcisi(this)

        kategoriListe=KategorilerDao().tumKategoriler(vt)

/*
        kategoriListe=ArrayList()
        val k1=Kategoriler(1,"Komedi")
        val k2=Kategoriler(2,"Bilim Kurgu")

        kategoriListe.add(k1)
        kategoriListe.add(k2)

 */

        adapter=KategoriAdapter(this,kategoriListe)

        binding.rv.adapter=adapter

    }

    fun veritabaniKopyala(){

        val copyHelper=DatabaseCopyHelper(this)
        try {

            copyHelper.createDataBase()
            copyHelper.openDataBase()
        }catch (e:Exception){
            e.printStackTrace()
        }
    }
}