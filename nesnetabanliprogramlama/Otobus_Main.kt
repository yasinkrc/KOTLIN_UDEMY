package com.example.nesnetabanliprogramlama

fun main(){

    val kamilKoc=Otobus(50,"Bursa","Ankara",10)
    /*
    println(kamilKoc.kapasite)
    println(kamilKoc.nereden)
    println(kamilKoc.nereye)
    println(kamilKoc.mevcut_Yolcu)

    kamilKoc.kapasite=100
    kamilKoc.nereden="İzmir"
    kamilKoc.nereye="İstanbul"
    kamilKoc.mevcut_Yolcu=30

    println(kamilKoc.kapasite)
    println(kamilKoc.nereden)
    println(kamilKoc.nereye)
    println(kamilKoc.mevcut_Yolcu)

    println("***********************************")
    kamilKoc.bilgi_al()

     */

    kamilKoc.bilgi_al()
    kamilKoc.yolcuAl(40)
    kamilKoc.yolcuAl(40)



}