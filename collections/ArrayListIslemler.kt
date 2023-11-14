package com.example.collections

fun main(){

    val meyveler = ArrayList<String>()

    meyveler.add("Çilek")
    meyveler.add("Muz")
    meyveler.add("Elma")
    meyveler.add("Kivi")
    meyveler.add("Kiraz")

    println(meyveler.isEmpty()) // False
    println(meyveler.size) // Genelde bunu tercih et boyutu için
    println(meyveler.count()) // Boyut
    println(meyveler.first()) // İlk eleman
    println(meyveler.last()) // Son eleman
    println(meyveler.contains("kiraz")) // True - False Döndürür var mı yok mu


    println(meyveler.max())
    println(meyveler.min())
    meyveler.sort()
    println(meyveler.toString())

    meyveler.reverse()
    println(meyveler)

    meyveler.removeAt(3)
    println(meyveler)
    meyveler.remove("Kivi")
    println(meyveler.toString())

    meyveler.clear()
    println(meyveler)
}