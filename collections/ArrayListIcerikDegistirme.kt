package com.example.collections

fun main(){

    val sayilar =ArrayList<Int>()

    sayilar.add(1)
    sayilar.add(2)
    sayilar.add(3)
    sayilar.add(4)
    sayilar.add(5)
    println("Değişimden Önce ")
    println(sayilar.toString())
    for ((indeks , i) in sayilar.withIndex()){

        sayilar[indeks]=i*2

    }
    println("Değişimden Sonra ")
    println(sayilar.toString())


}