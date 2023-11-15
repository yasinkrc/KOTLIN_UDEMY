package com.example.collections

import java.util.Scanner

fun main() {
    val sayilar =ArrayList<Int>()

    while (true){

        println("Bir sayi giriniz / Çıkmak için ise 0 a basınız ")
        val girdi =Scanner(System.`in`)
        val sayi =girdi.nextInt()

        if (sayi==0){
            break
        }
        else {
            sayilar.add(sayi)
        }
    }

    if (sayilar.isNotEmpty()){

        println("Girdiğin sayıların ortalması : ${sayilar.average()}")

    }
    else {
        println("herhangi bir sayi girmedini .")
    }
}


