package com.example.sqllitekullanimi2

import android.annotation.SuppressLint
import android.content.ContentValues

class Kisilerdao() {

    fun kisiEkle(vt:VeriTabaniYardimcisi,kisi_ad :String , kisi_tel:String, kisi_yas:Int,kisi_boy:Double){

        val db =vt.writableDatabase

        val values=ContentValues()
        values.put("kisi_ad",kisi_ad)
        values.put("kisi_tel",kisi_tel)
        values.put("kisi_yas",kisi_yas)
        values.put("kisi_boy",kisi_boy)

        db.insertOrThrow("kisiler",null,values)
        db.close()
    }

    // yazılacakk
    // geri dööş deüir olnbir fnk olacak . Arra list döndrmesi gerekecek
    @SuppressLint("Range")
    fun tumKisiler(vt: VeriTabaniYardimcisi): ArrayList<Kisiler> {

        val kisilerArrayList = ArrayList<Kisiler>()
        val db = vt.writableDatabase
        val cursor = db.rawQuery("SELECT * FROM kisiler", null)

        while (cursor.moveToNext()) {
            val kisi = Kisiler(
                cursor.getInt(cursor.getColumnIndex("kisi_no")),
                cursor.getString(cursor.getColumnIndex("kisi_ad")),
                cursor.getString(cursor.getColumnIndex("kisi_tel")),
                cursor.getInt(cursor.getColumnIndex("kisi_yas")),
                cursor.getDouble(cursor.getColumnIndex("kisi_boy"))
            )
            kisilerArrayList.add(kisi) // Add each Kisiler object to the list
        }

        // Return the filled ArrayList at the end
        return kisilerArrayList
    }

    fun kisiGuncelle(vt:VeriTabaniYardimcisi,kisi_ad :String , kisi_no :Int,  kisi_tel:String, kisi_yas:Int,kisi_boy:Double){

        val db =vt.writableDatabase

        val values=ContentValues()
        values.put("kisi_ad",kisi_ad)
        values.put("kisi_tel",kisi_tel)
        values.put("kisi_yas",kisi_yas)
        values.put("kisi_boy",kisi_boy)

        db.update("kisiler",values,"kisi_no=?", arrayOf(kisi_no.toString()))
        db.close()
    }

    fun kisiSil(vt:VeriTabaniYardimcisi,kisi_no: Int){
        val db =vt.writableDatabase
        db.delete("kisiler","kisi_no=?", arrayOf(kisi_no.toString()))
        db.close()

    }

    @SuppressLint("Range")
    fun arama(vt: VeriTabaniYardimcisi,keyWord:String): ArrayList<Kisiler> {

        val kisilerArrayList = ArrayList<Kisiler>()
        val db = vt.writableDatabase
        val cursor = db.rawQuery("SELECT * FROM kisiler WHERE kisi_ad LIKE '%$keyWord%'", null)

        while (cursor.moveToNext()) {
            val kisi = Kisiler(
                cursor.getInt(cursor.getColumnIndex("kisi_no")),
                cursor.getString(cursor.getColumnIndex("kisi_ad")),
                cursor.getString(cursor.getColumnIndex("kisi_tel")),
                cursor.getInt(cursor.getColumnIndex("kisi_yas")),
                cursor.getDouble(cursor.getColumnIndex("kisi_boy"))
            )
            kisilerArrayList.add(kisi) // Add each Kisiler object to the list
        }

        // Return the filled ArrayList at the end
        return kisilerArrayList
    }


    @SuppressLint("Range")
    fun rasgele(vt: VeriTabaniYardimcisi): ArrayList<Kisiler> {

        val kisilerArrayList = ArrayList<Kisiler>()
        val db = vt.writableDatabase
        val cursor = db.rawQuery("SELECT * FROM kisiler ORDER BY RANDOM () LIMIT 2", null)

        while (cursor.moveToNext()) {
            val kisi = Kisiler(
                cursor.getInt(cursor.getColumnIndex("kisi_no")),
                cursor.getString(cursor.getColumnIndex("kisi_ad")),
                cursor.getString(cursor.getColumnIndex("kisi_tel")),
                cursor.getInt(cursor.getColumnIndex("kisi_yas")),
                cursor.getDouble(cursor.getColumnIndex("kisi_boy"))
            )
            kisilerArrayList.add(kisi) // Add each Kisiler object to the list
        }

        // Return the filled ArrayList at the end
        return kisilerArrayList
    }


    @SuppressLint("Range")
    fun kayitKontrol(vt:VeriTabaniYardimcisi, kisi_ad: String):Int {

        var sonuc :Int =0

        val db =vt.writableDatabase

        val cursor=db.rawQuery("SELECT count(*) AS sonuc FROM kisiler WHERE kisi_ad='$kisi_ad'",null)

        while (cursor.moveToNext()){
            sonuc=cursor.getInt(cursor.getColumnIndex("sonuc"))
        }

        return sonuc

    }
    @SuppressLint("Range")
    fun kisiGetir(vt: VeriTabaniYardimcisi,kisi_no: Int): Kisiler? {

        var gelenKisi:Kisiler?=null
        val db = vt.writableDatabase
        val cursor = db.rawQuery("SELECT * FROM kisiler WHERE kisi_no='$kisi_no'", null)

        while (cursor.moveToNext()) {
            gelenKisi = Kisiler(
                cursor.getInt(cursor.getColumnIndex("kisi_no")),
                cursor.getString(cursor.getColumnIndex("kisi_ad")),
                cursor.getString(cursor.getColumnIndex("kisi_tel")),
                cursor.getInt(cursor.getColumnIndex("kisi_yas")),
                cursor.getDouble(cursor.getColumnIndex("kisi_boy"))
            )
        }

        // Return the filled ArrayList at the end
        return gelenKisi
    }
}
