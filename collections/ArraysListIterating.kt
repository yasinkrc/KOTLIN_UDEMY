package com.example.collections

fun main(){

    val meyveler =ArrayList<String>()

    meyveler.add("Elma")
    meyveler.add("Portakal")
    meyveler.add("Kiraz")
    meyveler.add("Muz")
    meyveler.add("Karpuz")

    for (meyve in meyveler){

        println("Sonuc : $meyve")
    }

    for ((indeks ,meyve) in meyveler.withIndex()){

        println("${indeks+1}.sıra: $meyve")
    }

}