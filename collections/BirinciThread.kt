package com.example.string_ileri_kotlin

class BirinciThread :Thread() {

    override fun run() {

        for ( i in 100..199){
            println("Birinci Thread : $i")
            Thread.sleep(100)
        }
    }
}