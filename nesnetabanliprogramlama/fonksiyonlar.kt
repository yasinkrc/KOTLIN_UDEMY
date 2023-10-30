package com.example.nesnetabanliprogramlama

fun main(){

    fun selamla(){

        val sonuc="Merhaba ahmet"
        println(sonuc)
    }

    selamla()

    fun selamla1() :String{

        return  "Merhaba Mehmet"

    }

    val sonuc=selamla1()
    println(sonuc)

    fun selamla2(name : String , age : Int) : String {

        return "Merhaba benim adım $name ve $age yaşındayım "

    }
    val sonuc1=selamla2("Yasin",22)
    println(sonuc1)

    fun toplama(){

        val toplam=30+40

        println("Toplam : $toplam")
    }

    toplama()

    fun toplama1() : Int {

        val toplam =30+40
        return toplam
    }
    val sonucx=toplama1()
    println(sonucx)

    fun toplama2(sayi1 : Int , sayi2 : Int) : Int {

        val toplam =sayi1+sayi2
        return  toplam
    }
    println(toplama2(5,6))
    println(toplama2(4545,646))
}