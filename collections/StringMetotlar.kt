package com.example.string_ileri_kotlin

fun main(){

    val str1="Merhaba"



    println(str1.subSequence(0,3))
   // println(str1.subSequence(-1,-6))

    if (str1.contains("ba")){

        println("içeriyor")
    }
    else println("içermiyor")


    var str="sELaM"

    str=str.uppercase()
    println(str)
    println(str.toLowerCase())
    println(str.toUpperCase())
    println(str.split("A"))

    for( i in (str.split("A")))
        println(i)
    println("***********************************")

    val str5="   Merhaba "
    println(str5.trim())

}