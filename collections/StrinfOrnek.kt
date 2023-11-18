package com.example.string_ileri_kotlin

import java.util.Scanner

fun main(){


    print("Lütfen cümle ya da kelime giriniz  : ")
    val girdi =Scanner(System.`in`)
    val text=girdi.nextLine()

    var newText=""

    for (i in text){

        newText =i+newText
    }
    print("Girdiğiniz text'in ters mesajı : $newText ")

    print("Lütfen cümle ya da kelime giriniz  : ")
    val texta = girdi.nextLine()

    val kelimeler = texta.split(" ")
    val tersText = kelimeler.reversed().joinToString(" ")

    print("Girdiğiniz text'in ters mesajı : $tersText ")




}