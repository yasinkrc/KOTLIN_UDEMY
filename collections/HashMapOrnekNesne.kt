package com.example.collections

fun main(){


    val o1 =Ogrenci(1,"Ahmet","11F")
    val o2=Ogrenci(2,"Zeynep","10A")
    val o3 =Ogrenci(3,"Ceyda","12A")

    val ogrenciler =HashMap<Int ,Ogrenci>()

    ogrenciler.put(o1.no,o1)
    ogrenciler.put(o2.no,o2)
    ogrenciler.put(o3.no,o3)

    for ( (ogrenciNO ,nesne ) in ogrenciler){

        println("**********************")
        println("Öğrenci no : $ogrenciNO")
        println("Öğrenci ad : ${nesne.ad}")
        println("Öğrenci sinif : ${nesne.sinif}")
    }

}