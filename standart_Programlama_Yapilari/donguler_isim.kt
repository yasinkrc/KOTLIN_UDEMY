package standart_Programlama_Yapilari

import java.util.*

fun main(){

    val girdi=Scanner(System.`in`)
    print("Merhaba hoş geldin Neyi Tekrarlamak istedğin yazarmısın : ")
    val isim=girdi.next()
    print("Peki kaç kere tekrarlamak istiyorsun : ")
    var sayi=girdi.nextInt()
    var sayac=1
    while (sayi>0){

        println("${sayac}. $isim")
        sayi--
        sayac++
    }


}