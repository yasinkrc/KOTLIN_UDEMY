package com.example.collections

fun main(){

    val meyveler=ArrayList<String>()
    meyveler.add("Elma")
    meyveler.add("Kiraz")
    meyveler.add("Şeftali")
    meyveler.add("Karpuz")
    meyveler.add("Limon")
    meyveler.add("mandalina")
    println(meyveler)
    println(meyveler.toString())
    println("*************************************************")
    println(meyveler[0])
    println(meyveler.get(4))

    meyveler.add("mandalina")
    println(meyveler)

    meyveler[2]="Ananas"
    println(meyveler.toString())
    meyveler.add(3,"Muz")
    println(meyveler)

}