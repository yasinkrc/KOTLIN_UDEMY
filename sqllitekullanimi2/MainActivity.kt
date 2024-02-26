package com.example.sqllitekullanimi2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.sqllitekullanimi2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val vt =VeriTabaniYardimcisi(this)
        //Kisilerdao().kisiEkle(vt,"Ahmet","99999",18,1.75)
        //Kisilerdao().kisiEkle(vt,"Ahmet","99999",18,1.785)
        //Kisilerdao().kisiEkle(vt,"Yasin","4564",28,1.775)
        //Kisilerdao().kisiEkle(vt,"Yazgülü","6499",11,1.175)
        //Kisilerdao().kisiEkle(vt,"Leyla","99009",8,1.65)

        //Kisilerdao().kisiGuncelle(vt,"Yeni Zeynep ",3,"12321321",100,1.22)

       //   Kisilerdao().kisiSil(vt,3)
      //  val kisiListe=Kisilerdao().tumKisiler(vt)

        //val kisiListe=Kisilerdao().arama(vt,"Ya")

        //val kisiListe=Kisilerdao().rasgele(vt)
       // val sonuc =Kisilerdao().kayitKontrol(vt,"Ahmet")
        //Log.e("Kayıt Kontrol",sonuc.toString())
        val kisi =Kisilerdao().kisiGetir(vt,4)
        if (kisi!=null){

            Log.e("Kişi no 4 ",kisi.kisi_no.toString())
            Log.e("Kişi ad 4 ",kisi.kisi_ad.toString())
            Log.e("Kişi tel 4  ",kisi.kisi_tel.toString())
            Log.e("Kişi yas 4 ",kisi.kisi_yas.toString())
            Log.e("Kişi boy 4 ",kisi.kisi_boy.toString())
        }
        val kisiListe=Kisilerdao().tumKisiler(vt)
        for (k in kisiListe) {

            Log.e("Kişi no ",k.kisi_no.toString())
            Log.e("Kişi ad ",k.kisi_ad.toString())
            Log.e("Kişi tel ",k.kisi_tel.toString())
            Log.e("Kişi yas",k.kisi_yas.toString())
            Log.e("Kişi boy",k.kisi_boy.toString())
        }


    }
}