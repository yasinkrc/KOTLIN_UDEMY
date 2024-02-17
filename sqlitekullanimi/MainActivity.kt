  package com.example.sqlitekullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.sqlitekullanimi.databinding.ActivityMainBinding

  class MainActivity : AppCompatActivity() {
    private lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val vt =VeritabaniYadimmcisi(this)
        val kisilerdao=Kisilerdao()
       // kisilerdao.kisiEkle(vt,"Ahmet","9999",18,1.67)
       // kisilerdao.kisiEkle(vt,"Yasin","9545999",58,1.87)
        // kisilerdao.kisiEkle(vt,"Yazgülü","9954599",28,1.97)

        //kisilerdao.kisiGuncele(vt,3,"Yeni Zeynep","111",100,1.22)

      //  val kisiListe=Kisilerdao().arama(vt,"ep")
         val kisi =Kisilerdao().kisiGetir(vt,2)
        if (kisi!=null){
            Log.e("Kişi no 4:",(kisi.kisi_no).toString())
            Log.e("Kişi ad 4:",(kisi.kisi_ad).toString())
            Log.e("Kişi tel 4 :",(kisi.kisi_tel).toString())
            Log.e("Kişi yaş:4",(kisi.kisi_yas).toString())
            Log.e("Kişi boy 4:",(kisi.kisi_boy).toString())
        }
      //  val kisiListe=Kisilerdao().rastgeleGetir(vt)
       // val sonuc=Kisilerdao().kayitKontrol(vt,"Yazgülü")
        //Log.e("Kayıt kontrol  :",sonuc.toString())
        val kisiListe=Kisilerdao().tumKisiler(vt)
        for (k in kisiListe){

            Log.e("Kişi no :",(k.kisi_no).toString())
            Log.e("Kişi ad :",(k.kisi_ad).toString())
            Log.e("Kişi tel :",(k.kisi_tel).toString())
            Log.e("Kişi yaş:",(k.kisi_yas).toString())
            Log.e("Kişi boy :",(k.kisi_boy).toString())
        }
    }
}