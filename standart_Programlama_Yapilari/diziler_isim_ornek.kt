package standart_Programlama_Yapilari

import java.util.Scanner

fun main(){

    /*
    5 kişinin ismini konsoldan girerek kayıt işlemini
    yapınız ve girilen isimleri ekranda gösteriniz
     */
    val girdi = Scanner(System.`in`)
    print("Kaç tane isim girmek istersiniz :  ")
    var sayi=girdi.nextInt()
    val dizi = Array<String>(sayi){""}
    while (sayi>0){

        println("İsim Giriniz ")
        dizi[sayi-1]=girdi.next()
        sayi--
    }
    println("Sonuçlar")
    println(dizi.contentToString())
}