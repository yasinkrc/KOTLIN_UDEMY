package com.example.filmleruygulamasi

import android.annotation.SuppressLint

class KategorilerDao {

   @SuppressLint("Range")
   fun tumKategoriler(vt:VeritabaniYardimcisi):ArrayList<Kategoriler>{

       val db =vt.writableDatabase
       val kategoriListe=ArrayList<Kategoriler>()
       val c = db.rawQuery("SELECT *FROM kategoriler",null)

       while (c.moveToNext()) {

           val kategori =Kategoriler(c.getInt(c.getColumnIndex("kategori_id")),
               c.getString(c.getColumnIndex("kategori_ad")))

           kategoriListe.add(kategori)
       }

       return kategoriListe
   }

}