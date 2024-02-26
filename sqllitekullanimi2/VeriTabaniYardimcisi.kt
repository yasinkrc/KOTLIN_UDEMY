package com.example.sqllitekullanimi2

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

// null yazmamozın nedeni varsayılan cursoru kullandığımızdan ötürü
class VeriTabaniYardimcisi(context: Context) :SQLiteOpenHelper(context,"rehper",null,1) {
    override fun onCreate(db: SQLiteDatabase?) {
        // Burada veritabanlarını oluşturusun
        //  kaç tane istersen
        db?.execSQL("CREATE TABLE kisiler(kisi_no INTEGER PRIMARY KEY AUTOINCREMENT " +
                ", kisi_ad TEXT ,kisi_tel TEXT ,kisi_yas INTEGER ,kisi_boy DOUBLE);")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

        // burada ise yukarıdkai ind eeğer veri tabanı oluşmazsa yapılması gerekiini burada söyleriz
        db?.execSQL("DROP TABLE IF EXISTS kisiler")
        onCreate(db)
    }
}