package com.example.string_ileri_kotlin

fun main(){
/*
    val str1 ="Merhaba"
    println(str1)

    var str2=String()
    str2="Kotlin"
    println(str2)

    val str3="""
       NASILSIN 
       MERHABA 
       HEY
    """.trimIndent()
    println(str3)

    val str4=""

    val str5=String()

    if (str4.isEmpty())
    {
        println("str4 boş şuan")
    }
    else {

        println("str4 dolu")
    }
    if (str5.isEmpty())
    {
        println("str5 boş şuan")
    }
    else {

        println("str5 dolu")
    }

    var a =10
    var b=20

    println("$a x $b = ${a*b}")

    val str6 ="Merhaba"
    val str7=" Dünya"
    val str8 =str6+str7
    println(str8)

    val str9 ="Merhaba ,Kotlib !"

    println("$str9 boyutu :${str9.length}")
    */

val stra="Merhaba"
val strb="Merhaba Dünya"

    if (stra==strb){
        println("$stra ve $strb eşşitir")
    }
    else {
        println("$stra ve $strb eşşit değildir")

    }
    println("*****************************************************************************************************")
    if (stra==strb)   println("$stra ve $strb eşşitir") else println("$stra ve $strb eşşit değildir")



    for ( s in strb) {

        print(s)
    }
}