package standart_Programlama_Yapilari

import java.util.Scanner

fun main(){
    /*
    5 adet dersin adı ve notu konsoldan girilecek
    Karne şeklinde çıktı alınacak , ortalama hesaplancak ve ortalama 50'ye eşit ve üzerindeyse geçti diğer durumda ise
    kaldı mesajı verilecek
     */

    val girdi =Scanner(System.`in`)

    val dersler = Array<String>(5){""}
    val notlar=Array<Int>(5){0}

    for (i in 0 until dersler.count()) {

        print("${i+1}. dersi giriniz lütfen : ")
        val ders=girdi.next()
        dersler[i]=ders
        print("${i+1}. notu giriniz lütfen : ")
        val not=girdi.nextInt()
        notlar[i]=not


    }
    var toplam =0
    for (i in 0 until notlar.count()) {
        println("${dersler[i]} : ${notlar[i]}")
        toplam+=notlar[i]

    }
    val ortalama  =(toplam/notlar.count())

    if (ortalama>=50){
        println("Tebrikler geçtiniz ortalamanız : $ortalama ")
    }else {

        println("Ne yaziki  kaldınız  ortalamanız : $ortalama ")
    }


}