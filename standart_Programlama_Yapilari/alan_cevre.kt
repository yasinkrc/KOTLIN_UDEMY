package standart_Programlama_Yapilari

import java.util.Scanner

fun  main(){

    var girdi=Scanner(System.`in`)
    print("Lütfen Yapmak istediğiniz seçimi girniz (1 or 2 ) : ")
    var secim=girdi.nextInt()



    if (secim==1){
        println("**************** Diktörgen alanı seçitiniz********************* . ")
        print("Kısa kenarı giriniz :  ")
        var kisa_Kenar = girdi.nextInt()
        print("Uzun Kenarı giriniz : ")
        var uzun_Kenar = girdi.nextInt()
        var diktorgen_alanı =(kisa_Kenar*uzun_Kenar)
        println("Diktörgenin alani : $diktorgen_alanı")
    }
    else if (secim==2){
        println("Çember alanı seçitiniz . ")
        print(" Yarı çapı giriniz :  ")
        var yari_Cap = girdi.nextInt()
        val pi : Double = 3.14159265359
        var cember_alani =(pi*yari_Cap*yari_Cap)
        println("Çember alani : $cember_alani")

    }
    else {

        println("Yanlış bir sayı girdiniz")
    }
}