package com.example.collections

import java.util.Scanner

fun main(){

    val girdi =Scanner(System.`in`)
    val personeler=ArrayList<Personel>()

    for (i in 1..5){
        print("$i. Personel ad : ")
        val isim =girdi.next()
        print("$i. Personel il : ")
        val il =girdi.next()
        print("$i. Personel adress ilçe  : ")
        val ilce =girdi.next()
        val adres =Adres(il,ilce)

        val personel=Personel(i,isim,adres)

        personeler.add(personel)


    }


    for (p in personeler){

        println("**************")
        println("Personel no : ${p.no}")
        println("Personel isim : ${p.isim}")
        println("Personel il : ${p.adres.il}")
        println("Personel ilce: ${p.adres.ilce}")
    }
}