package com.example.nesnetabanliprogramlama

class Hesaplayici {

    fun topla(sayi1 : Int , sayi2 : Int){
        println("Toplam : ${sayi1+sayi2}")
    }
    fun topla(sayi1: Double , sayi2: Int){

        println("Toplam 2 : ${sayi1+sayi2} ")
    }
    fun topla(sayi1: Double , sayi2: Double){

        println("Toplam 3 : ${sayi1+sayi2} ")
    }
    fun topla(sayi1: Double , sayi2: Float){

        println("Toplam 4 : ${sayi1+sayi2} ")
    }
}