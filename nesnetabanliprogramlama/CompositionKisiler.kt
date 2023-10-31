package com.example.nesnetabanliprogramlama

fun main(){


    val adres = Adres("Sanliurfa","Karaköprü")

    val kisi =Kisiler1("Yazgülü",22,adres)

    println("Kişi ad : ${kisi.ad}")
    println("Kişi yas : ${kisi.yas}")
    println("Kişi adres il : ${kisi.adres.il}")
    println("Kişi adres ilce : ${kisi.adres.ilce}")
}