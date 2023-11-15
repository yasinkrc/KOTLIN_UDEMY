package com.example.collections

import java.util.Scanner

fun main(){

    val sayilar =ArrayList<Int>()
    val sayilarcift =ArrayList<Int>()
    val sayilartek =ArrayList<Int>()

    while (true){

        println("Bir sayi giriniz / Çıkmak için ise 0 a basınız ")
        val girdi = Scanner(System.`in`)
        val sayi =girdi.nextInt()

        if (sayi==0){
            break
        }
        else {
            sayilar.add(sayi)
        }
    }


    for (i in sayilar){

        if (i %2 ==0){

            sayilarcift.add(i)

        }

        sayilartek.add(i)

    }

    println("Çift sayılar : $sayilarcift")
    println("Tek sayılar : $sayilartek")

}