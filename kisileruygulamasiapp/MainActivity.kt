package com.example.kisileruygulamasiapp

import android.annotation.SuppressLint
import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.Menu
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kisileruygulamasiapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),SearchView.OnQueryTextListener {
    private  lateinit var  binding :ActivityMainBinding
    private lateinit var kisilerListe:ArrayList<Kisiler>
    private lateinit var adapter: KisilerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbar.title="Kişiler Uygulaması"

        setSupportActionBar(binding.toolbar)

        binding.rv.setHasFixedSize(true)
        binding.rv.layoutManager=LinearLayoutManager(this)


        kisilerListe=ArrayList()

        val k1 =Kisiler(1,"Ahmet","8888")
        val k2 =Kisiler(2,"Yasin","66666")

        kisilerListe.add(k1)
        kisilerListe.add(k2)

        adapter=KisilerAdapter(this,kisilerListe)

        binding.rv.adapter=adapter
        binding.floatingActionButton.setOnClickListener {

            alertGoster()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.toolbar_menu,menu)

        val item =menu?.findItem(R.id.action_ara)
        val searchView =item?.actionView as SearchView
        searchView.setOnQueryTextListener(this)
        return super.onCreateOptionsMenu(menu)
    }
    @SuppressLint("MissingInflatedId")
    fun alertGoster() {


        val tasarim =LayoutInflater.from(this).inflate(R.layout.alert_tasarim,null)
        val editTextAd=tasarim.findViewById(R.id.editTextAd) as EditText
        val editTextTel=tasarim.findViewById(R.id.editTextTel) as EditText

        val ad = AlertDialog.Builder(this)

        ad.setTitle("Kişi Ekle")
        ad.setView(tasarim)
        ad.setPositiveButton("Ekle"){dialogInterface,i->

            val kisi_ad=editTextAd.text.toString().trim()
            val kisi_Tel=editTextTel.text.toString().trim()

            Toast.makeText(applicationContext,"$kisi_ad - $kisi_Tel",Toast.LENGTH_SHORT).show()

        }
        ad.setNegativeButton("İptal"){dialogInterface,i->


        }
        ad.create().show()
    }

    override fun onQueryTextSubmit(query: String): Boolean {
        Log.e("Gönderilen arama",query)
        return true

    }

    override fun onQueryTextChange(newText: String): Boolean {
        Log.e("Harf Girdikçe",newText)

        return true

    }
}