package com.example.preferencedatastore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.preferencedatastore.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private var binding :ActivityMainBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        val ap =AppPref(this)
        val job = CoroutineScope(Dispatchers.Main).launch {

            ap.kayitAd("Ahmet")
            ap.kayitYas(23)
            ap.kayitBoy(1.78)
            ap.kayitBekar(true)

            val liste=HashSet<String>()
            liste.add("Mehmet")
            liste.add("Zeynep")
            liste.add("Yasin")
            ap.kayitArkadasListe(liste)

      //       ap.silAd()
            val gelenAd=ap.okuAd()
            val gelenYas=ap.okuYas()
            val gelenBoy=ap.okuBoy()
            val gelenBekar=ap.okuBekar()

            Log.e("Gelen Ad",gelenAd.toString())
            Log.e("Gelen Yas",gelenYas.toString())
            Log.e("Gelen Boy",gelenBoy.toString())
            Log.e("Gelen Bekar",gelenBekar.toString())

            val gelenListe=ap.okuArkadasListe()

            for ( i in ap.okuArkadasListe()){

                Log.e("Gelen isim",i)
            }

            var gelenSayac=ap.okuSayac()
            ap.kayitSayac(++gelenSayac)
            binding!!.textViewSayac.text="Açılış Sayısı :$gelenSayac"
        }

    }
}