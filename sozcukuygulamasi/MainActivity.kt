package com.example.sozcukuygulamasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sozcukuygulamasi.databinding.ActivityMainBinding
import com.info.sqlitekullanimihazirveritabani.DatabaseCopyHelper

class MainActivity : AppCompatActivity(),SearchView.OnQueryTextListener{
    private lateinit var binding :ActivityMainBinding
    private lateinit var kelimelerListe : ArrayList<Kelimeler>
    private lateinit var adapter: KelimelerAdapter
    private lateinit var vt: VeriTabaniYardimcisi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        veriTabaniKopyala()
        binding.toolbar.title="Sözlük Uygulaması"
        setSupportActionBar(binding.toolbar)

        binding.RecyclerView.setHasFixedSize(true)
        binding.RecyclerView.layoutManager=LinearLayoutManager(this)
        vt =VeriTabaniYardimcisi(this)

        kelimelerListe =KelimelerDao().tumKelimeler(vt)


      /*  kelimelerListe=ArrayList()
        val k1 =Kelimeler(1,"Dog","Köpek")
        val k2 =Kelimeler(2,"Fish","Balık")
        val k3 =Kelimeler(3,"Table","Masa")

        kelimelerListe.add(k1)
        kelimelerListe.add(k2)
        kelimelerListe.add(k3)


       */
        adapter=KelimelerAdapter(this,kelimelerListe)

        binding.RecyclerView.adapter=adapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.toolbar_menu,menu)

        val item =menu?.findItem(R.id.action_ara)
        val searchView=item?.actionView as SearchView
        searchView.setOnQueryTextListener(this)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onQueryTextSubmit(query: String): Boolean {
        arama(query)

        if (query != null) {
            Log.e("Gönderilen Arama",query)
        }
        return  true
    }

    override fun onQueryTextChange(newText: String): Boolean {
        arama(newText)
        if (newText != null) {
            Log.e("Harf Girdikçe",newText)
        }
     return true
    }

    fun veriTabaniKopyala(){

        val copyHelper=DatabaseCopyHelper(this)
        try {
            copyHelper.createDataBase()
            copyHelper.openDataBase()
        }catch (e:Exception){

            e.printStackTrace()
        }
    }

    fun arama(aramaKelime:String){
        kelimelerListe =KelimelerDao().aramaYap(vt,aramaKelime)

        adapter=KelimelerAdapter(this,kelimelerListe)

        binding.RecyclerView.adapter=adapter
    }
}