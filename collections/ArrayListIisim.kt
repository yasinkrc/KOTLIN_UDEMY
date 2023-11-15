package com.example.collections

import java.util.Scanner

fun main() {
    val isimler = ArrayList<String>()

    isimler.add("Leyla")
    isimler.add("Ahmet")
    isimler.add("Yasin")
    isimler.add("Yazgülü")
    isimler.add("ibrahim")
    isimler.add("Halil")

    println("Lütfen bir isim giriniz ")
    val girdi = Scanner(System.`in`)
    val girilenIsim = girdi.next()

    if (isimler.contains(girilenIsim)) {
        println("İsim bulunmaktadır")
    } else {
        println("İsim bulunmamaktadır")
    }
}
