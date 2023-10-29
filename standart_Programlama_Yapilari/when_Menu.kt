package standart_Programlama_Yapilari

import java.util.Scanner

fun main(){

    val girdi=Scanner(System.`in`)
    println("Sil (1)")
    println("Ekleme (2)")

    val tercih =girdi.nextInt()
    when (tercih) {
        1-> println("Veri silindi ")
        2-> println("Veri eklendi")
        else -> println("Böyle bir işlem yok    ")


    }
}