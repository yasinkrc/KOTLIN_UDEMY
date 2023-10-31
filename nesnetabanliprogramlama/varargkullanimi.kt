package com.example.nesnetabanliprogramlama

fun main(){


    fun toplam(vararg sayilar : Int) : Int {

        var toplam = 0

        for ( i in sayilar) {

            toplam +=i
        }

        return  toplam
    }

    println(toplam(1,2,3,4,5))
}