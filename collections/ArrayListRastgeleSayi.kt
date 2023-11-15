package com.example.collections

import kotlin.random.Random

fun main(){
    val sayillar = ArrayList<Int>()

    for (i in 1..100){

        val rastgeleSayi=Random.nextInt(0, 101)
        sayillar.add(rastgeleSayi)
    }

    println(sayillar)
}