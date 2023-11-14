package com.example.collections

fun main(){

    val k1 =Kisiler(6 ,"Ahmet")
    val k2=Kisiler(9 ,"Zeynep")
    val k3 =Kisiler(3 ,"Berna")

    val kisilerArrayList =ArrayList<Kisiler>()

    kisilerArrayList.add(k1)
    kisilerArrayList.add(k2)
    kisilerArrayList.add(k3)

    println("Önce")

    for (k in kisilerArrayList){

        println("${k.kisiAd} : ${k.kisiNo}")
    }

    println("Sayısaldan küçükten Büyüğe")

    val siralamaArrayList1 =kisilerArrayList.sortedWith(compareBy{it.kisiNo})

    for (k in siralamaArrayList1){

        println("${k.kisiAd} : ${k.kisiNo}")
    }
    println("Sayısaldan Büyükten Küçüğe ")

    val siralamaArrayList2 =kisilerArrayList.sortedWith(compareByDescending { it.kisiNo })

    for (k in siralamaArrayList2){

        println("${k.kisiNo} - ${k.kisiAd}")
    }

    println("İsim sıralama")
    val siralamaArrayList3=kisilerArrayList.sortedWith(compareByDescending { it.kisiAd })

    for (k in siralamaArrayList3){

        println("${k.kisiNo} - ${k.kisiAd}")
    }
}