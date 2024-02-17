package com.example.sqlitekullanimi

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class VeritabaniYadimmcisi(context:Context) :SQLiteOpenHelper(context,"rehper",null,1){
    override fun onCreate(db: SQLiteDatabase?) {

        db?.execSQL("CREATE TABLE kisiler(kisi_no INTEGER PRIMARY KEY AUTOINCREMENT ," +
                "kisi_ad TEXT ,kisi_tel TEXT , kisi_yas INTEGER ,kisi_boy DOUBLE);")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

        db?.execSQL("DROP TABLE IF EXISTS kisiler ")
        onCreate(db)
    }
}