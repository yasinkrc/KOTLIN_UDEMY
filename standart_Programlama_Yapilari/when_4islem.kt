package standart_Programlama_Yapilari

import java.util.Scanner

fun main(){

    var girdi=Scanner(System.`in`)
    print("Tercih giriniz : ")
    var secim=girdi.next()
    var a =4
    var b=9

    when(secim){

        "toplama"-> println("Toplama : ${a+b}")
        "çıkarma"-> println("Çıkarma : ${a-b}")
        "çarpma"-> println("Çarpma : ${a*b}")
        "bölme"-> println("Bölme : ${a/b}")
        else -> println("Yanlış seçim tekrar deneyiniz ! ")

    }
}