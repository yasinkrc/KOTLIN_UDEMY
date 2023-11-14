package com.example.collections

fun main (){

    val o1 =Ogrenci(1,"Ahmet","11F")
    val o2 =Ogrenci(2,"Zeynep","10R")
    val o3 =Ogrenci(3,"Ceyda","12A")
    val o4 =Ogrenci(4,"Mehmet","9Z")
    val o5 =Ogrenci(5,"Yasin","11F")

    val ogrenciler =ArrayList<Ogrenci>()

    ogrenciler.add(o1)
    ogrenciler.add(o2)
    ogrenciler.add(o3)
    ogrenciler.add(o4)
    ogrenciler.add(o5)
    val sonucListe=ogrenciler.filter { it.no>2 }
    val sonucListe2=ogrenciler.filter { it.ad.contains("a") }
    val sonucListe3=ogrenciler.filter { it.sinif=="11F" }
    /*
    for (o in ogrenciler){

        println("************************")
        println("Öğrenci No :${o.no}")
        println("Öğrenci Ad :${o.ad}")
        println("Öğrenci Sinif :${o.sinif}")
    }

     */
    println("11111111111111111111111")
    for (o in sonucListe){

        println("************************")
        println("Öğrenci No :${o.no}")
        println("Öğrenci Ad :${o.ad}")
        println("Öğrenci Sinif :${o.sinif}")
    }
    println("222222222222222222222222222222222222")
    for (o in sonucListe2){

        println("************************")
        println("Öğrenci No :${o.no}")
        println("Öğrenci Ad :${o.ad}")
        println("Öğrenci Sinif :${o.sinif}")
    }
    println("333333333333333333333")
    for (o in sonucListe3){

        println("************************")
        println("Öğrenci No :${o.no}")
        println("Öğrenci Ad :${o.ad}")
        println("Öğrenci Sinif :${o.sinif}")
    }

}