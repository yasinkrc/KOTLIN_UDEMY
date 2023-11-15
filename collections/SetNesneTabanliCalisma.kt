package com.example.collections

fun main(){

    val o1 =Ogrenci(1 ,"Ahmet","11F")
    val o2 =Ogrenci(2 ,"Zeynep","10A")
    val o3 =Ogrenci(3 ,"Ceyda","9Z")
    val o4 =Ogrenci(1 ,"Ece","12A")

    val ogrenciler =HashSet<Ogrenci>()

    ogrenciler.add(o1)
    ogrenciler.add(o2)
    ogrenciler.add(o3)
    ogrenciler.add(o4)

    for (o in ogrenciler){

        println("****************")
        println("Öğrenci no :${o.no}")
        println("Öğrenci ad :${o.ad}")
        println("Öğrenci sinif :${o.sinif}")
    }

}