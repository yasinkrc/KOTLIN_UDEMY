package com.example.collections

fun main(){

    val sayilar = mapOf<Int , String>(1 to "Bir" , 2 to "İki")
    val oranlar = mutableMapOf<Double,String>(1.5 to "Oran1",3.4 to "Oran2")
    val iller =HashMap<Int,String>()

    iller.put(16,"Bursa")
    iller.put(34,"İstanbul")
    iller.put(63,"Sanliurfa")

    println(iller)
    iller.put(16,"Diyarbakır")
    println(iller.toString())
    iller.put(16,"Diyarbakır")
    println(iller.toString())
    println(iller.get(34))
    println(iller)
    println(iller.size)
    println(iller.count())
    println(iller.isEmpty())
    println(iller.contains(16))
    println("***************")
    println(iller.containsKey(34))
    println(iller.containsValue("Diyarbakır"))

    for ((anahtar , deger ) in iller){

        println("$anahtar --> $deger")
    }

    iller.remove(16)
    println(iller)

    iller.clear()
    println(iller.toString())

}