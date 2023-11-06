package com.example.nesnetabanliprogramlama

import java.util.Scanner

class bebek (var isim : String , var yas : Int) {

    init {
        println("bebek sınıfından nesne oluştu .")
    }

    fun a (){

        val girdi = Scanner(System.`in`)
        println("Lütfen isim giriniz")
        isim =girdi.nextLine()

    }
    fun tekrar_( sayi :Int , number : Int) :String {

        return  "Merhaba bu iki sayinin toplamı : ${sayi+number}"
    }

    fun topla(vararg number :Int) :Int {

        var toplam=0

        for (i in number) {

            toplam+=i
        }

        return toplam

    }
    fun Int.carp (sayi :Int) :Int {
        return this * sayi
    }


}