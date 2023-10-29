package standart_Programlama_Yapilari

import java.util.Scanner

fun main(){

    val girdi = Scanner(System.`in`)
    print("Giriş bilgisi  : ")
    var start=girdi.nextInt()
    print("sonladırma bilgisi : ")
    var end=girdi.nextInt()

    for (i in start..end){

        if (i%2==0){
            println("Çift sayi : $i")
        }
        else if (i%2!=0){
            println("Tek sayi : $i")
        }
    }

}