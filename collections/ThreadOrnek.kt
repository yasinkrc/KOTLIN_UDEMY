package com.example.string_ileri_kotlin

fun main(){

    val birinciThread =BirinciThread()
    birinciThread.start()
    val ikinciThread =Thread(IkinciThread())
    ikinciThread.start()


    for ( i in 900..999){

        println("Main Thread : $i")
        Thread.sleep(100)
    }

}