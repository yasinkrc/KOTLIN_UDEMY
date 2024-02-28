package com.example.sozcukuygulamasi

import android.annotation.SuppressLint

class KelimelerDao {


    @SuppressLint("Range")
    fun tumKelimeler(vt:VeriTabaniYardimcisi):ArrayList<Kelimeler>{

        val kelimelerListe =ArrayList<Kelimeler>()
        val dB=vt.writableDatabase
        val c =dB.rawQuery("SELECT *FROM kelimeler",null)
        while (c.moveToNext()){

            val kelime =Kelimeler(c.getInt(c.getColumnIndex("kelime_id")),
                c.getString(c.getColumnIndex("ingilizce")),
                c.getString(c.getColumnIndex("turkce")))
            kelimelerListe.add(kelime)
        }

        return kelimelerListe
    }


    @SuppressLint("Range")
    fun aramaYap(vt:VeriTabaniYardimcisi,aramaKelime:String):ArrayList<Kelimeler>{

        val kelimelerListe =ArrayList<Kelimeler>()
        val dB=vt.writableDatabase
        val c =dB.rawQuery("SELECT *FROM kelimeler WHERE ingilizce like '%$aramaKelime%'",null)
        while (c.moveToNext()){

            val kelime =Kelimeler(c.getInt(c.getColumnIndex("kelime_id")),
                c.getString(c.getColumnIndex("ingilizce")),
                c.getString(c.getColumnIndex("turkce")))
            kelimelerListe.add(kelime)
        }

        return kelimelerListe
    }
}