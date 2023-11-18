package com.example.string_ileri_kotlin

fun main(){

    val x=10
    val y=0

    val dizi =Array<Int>(2){0} // {0,0}


    try {
        println("sonuç :${x/y}")
        println("İşlem tamam ")
        dizi[4]=8


    }
    catch(e : Exception) {
        if (e is ArithmeticException)
          println("Payda sıfır olamaz ")
        if (e is ArrayIndexOutOfBoundsException)
            println("Dizi sınırını geçtiniz")
    }
 try {
        dizi[4]=8
        println("İşlem tamam ")


    }
    catch(e : ArithmeticException) {

          println("Payda sıfır olamaz ")

    }
    catch (e :IndexOutOfBoundsException){
        println("Dizi Boyutunu geçtin")
    }


}