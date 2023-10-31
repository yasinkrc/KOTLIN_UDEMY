package com.example.nesnetabanliprogramlama

class Matematik {


    fun topla(sayi1 : Int , sayi2 :Int){

        val toplam =sayi1+sayi2
        println("Toplam : $toplam")


    }

    fun cikart(sayi1: Double , sayi2 : Double){

        if (sayi1>sayi2){
            val cikartma=sayi1-sayi2
            println("Çıkartma : $cikartma ve sayi1 daha büyük")
        }
        else if (sayi1<sayi2){
            val cikartma=sayi2-sayi1
            println("Çıkartma : $cikartma ve sayi2 daha büyük")
        }
        else {
            println("Çıkartma : 0 iki sayıda eşit ")
        }

    }

    fun carp(sayi1 : Int , sayi2 : Int) : Int {

        val carpma=sayi1*sayi2
        return  carpma
    }
        fun bol(sayi1 : Double , sayi2 : Double) : String {

        val bolme=sayi1/sayi2
        return  "Bolme sonucumuz : $bolme"
    }
}