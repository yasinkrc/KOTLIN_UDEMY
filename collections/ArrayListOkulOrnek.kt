package com.example.collections

import java.util.Scanner

fun main (){

    var sayac=1
    val ogreciler =ArrayList<Ogrenci>()
    val girdi =Scanner(System.`in`)

    while (true){

        print("Öğrenci adi giriniz :")
        val ad =girdi.next()
        print("Öğrenci sınıfı giriniz :")
        val sinif=girdi.next()

        val yeniOgrenci=Ogrenci(sayac,ad,sinif)
        sayac++

        ogreciler.add(yeniOgrenci)
        println("Çıkmak için (1) --- Devam etmek için diğer sayılar")
        val cikis=girdi.nextInt()

        if (cikis==0){

            for (ogrenci in ogreciler){

                println("*******************")
                println("Öğrenci no : ${ogrenci.no}")
                println("Öğrenci ad : ${ogrenci.ad}")
                println("Öğrenci sinif : ${ogrenci.sinif}")
            }
            println("Çıkış Yapıldı")
            break

        }
    }



}