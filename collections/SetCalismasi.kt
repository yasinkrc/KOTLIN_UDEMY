package com.example.collections

fun main(){

    // Tanimlama

    val meyveler = setOf<String>("Çilek","Muz","Elma","Kivi")
    val meyveler2 = setOf("Çilek","Muz","Elma","Kivi")
    //val meyveler3 =ArrayList("") --> Hata verdi demek ArrayListe olmuyor

    val iller = mutableSetOf<String>("Bursa","İstanbul","Ankara","İzmir")

    // val sayilar=HashSet<Int>(1,2,3,5) --> hata veriyor haberin olsun
    val sayilar=HashSet<Int>()

    sayilar.add(10)
    sayilar.add(20)
    sayilar.add(30)

    println(sayilar)
    sayilar.add(15)
    sayilar.add(20)
    println(sayilar.toString())

    println("***************")
    println(sayilar.elementAt(1))
    println(sayilar.size)
    println(sayilar.count())
    println(sayilar.isEmpty())
    println(sayilar.isNotEmpty())
    println(sayilar.contains(20))
    println(sayilar.contains(15))

    for (s in sayilar){

        println(s)
    }

    for ( (i,s) in sayilar.withIndex()){

        println("$i. ->$s")
    }

    sayilar.remove(10)
    println(sayilar.toString())
    sayilar.clear()
    println(sayilar.toString())


}