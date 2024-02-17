package com.example.sqlitekullanimi

import android.annotation.SuppressLint
import android.content.ContentValues

// İnsert - VERİ KAYDI


class Kisilerdao {

    fun  kisiEkle(vt :VeritabaniYadimmcisi ,kisi_ad:String,kisi_tel:String,kisi_yas:Int,kisi_boy:Double){

        val db =vt.writableDatabase
        val values =ContentValues()
        values.put("kisi_ad",kisi_ad)
        values.put("kisi_tel",kisi_tel)
        values.put("kisi_yas",kisi_yas)
        values.put("kisi_boy",kisi_boy)

        db.insertOrThrow("kisiler",null,values)
        db.close()
    }

    fun  kisiGuncele(vt :VeritabaniYadimmcisi ,kisi_no :Int ,kisi_ad:String,kisi_tel:String,kisi_yas:Int,kisi_boy:Double){

        val db =vt.writableDatabase
        val values =ContentValues()
        values.put("kisi_ad",kisi_ad)
        values.put("kisi_tel",kisi_tel)
        values.put("kisi_yas",kisi_yas)
        values.put("kisi_boy",kisi_boy)

        db.update("kisiler",values,"kisi_no=?", arrayOf(kisi_no.toString()))

        db.close()
    }

    fun kisiSil(vt:VeritabaniYadimmcisi, kisi_no:Int){
        val dbx =vt.writableDatabase
        dbx.delete("kisiler","kisi_no=?", arrayOf(kisi_no.toString()))
        dbx.close()
    }


    @SuppressLint("Range")
    fun tumKisiler(vt :VeritabaniYadimmcisi) :ArrayList<Kisiler> {


        val kisilerArrayList=ArrayList<Kisiler>()
        val db =vt.writableDatabase
        val cursor =db.rawQuery("SELECT *FROM kisiler ",null)
        while (cursor.moveToNext()){

            val kisi=Kisiler(cursor.getInt(cursor.getColumnIndex("kisi_no")),
                cursor.getString(cursor.getColumnIndex("kisi_ad")),
                cursor.getString(cursor.getColumnIndex("kisi_tel")),
                cursor.getInt(cursor.getColumnIndex("kisi_yas")),
                cursor.getDouble(cursor.getColumnIndex("kisi_boy")))
            kisilerArrayList.add(kisi)
        }
        return kisilerArrayList
    }

    @SuppressLint("Range")
    fun arama(vt :VeritabaniYadimmcisi,keyword:String) :ArrayList<Kisiler> {


        val kisilerArrayList=ArrayList<Kisiler>()
        val db =vt.writableDatabase
        val cursor =db.rawQuery("SELECT *FROM kisiler  WHERE kisi_ad like '%$keyword%' ",null)
        while (cursor.moveToNext()){

            val kisi=Kisiler(cursor.getInt(cursor.getColumnIndex("kisi_no")),
                cursor.getString(cursor.getColumnIndex("kisi_ad")),
                cursor.getString(cursor.getColumnIndex("kisi_tel")),
                cursor.getInt(cursor.getColumnIndex("kisi_yas")),
                cursor.getDouble(cursor.getColumnIndex("kisi_boy")))
            kisilerArrayList.add(kisi)
        }
        return kisilerArrayList
    }

    @SuppressLint("Range")
    fun rastgeleGetir(vt :VeritabaniYadimmcisi) :ArrayList<Kisiler> {


        val kisilerArrayList=ArrayList<Kisiler>()
        val db =vt.writableDatabase
        val cursor =db.rawQuery("SELECT *FROM kisiler ORDER BY RANDOM() LIMIT 2 ",null)
        while (cursor.moveToNext()){

            val kisi=Kisiler(cursor.getInt(cursor.getColumnIndex("kisi_no")),
                cursor.getString(cursor.getColumnIndex("kisi_ad")),
                cursor.getString(cursor.getColumnIndex("kisi_tel")),
                cursor.getInt(cursor.getColumnIndex("kisi_yas")),
                cursor.getDouble(cursor.getColumnIndex("kisi_boy")))
            kisilerArrayList.add(kisi)
        }
        return kisilerArrayList
    }


    @SuppressLint("Range")
    fun  kayitKontrol(vt:VeritabaniYadimmcisi, kisi_ad:String):Int {

        var sonuc =0

        val db =vt.writableDatabase
        val cursor =db.rawQuery("SELECT count(*) AS sonuc FROM kisiler WHERE kisi_ad='$kisi_ad' ",null)

        while (cursor.moveToNext()){

            sonuc=cursor.getInt(cursor.getColumnIndex("sonuc"))

        }

        return  sonuc
    }
    @SuppressLint("Range")
    fun kisiGetir(vt :VeritabaniYadimmcisi , kisi_no :Int) :Kisiler ?{

        var gelenKisi:Kisiler?=null
        val db =vt.writableDatabase
        val cursor =db.rawQuery("SELECT *FROM kisiler WHERE kisi_no=$kisi_no",null)
        while (cursor.moveToNext()){

            gelenKisi=Kisiler(cursor.getInt(cursor.getColumnIndex("kisi_no")),
                cursor.getString(cursor.getColumnIndex("kisi_ad")),
                cursor.getString(cursor.getColumnIndex("kisi_tel")),
                cursor.getInt(cursor.getColumnIndex("kisi_yas")),
                cursor.getDouble(cursor.getColumnIndex("kisi_boy")))
        }
        return gelenKisi
    }

}