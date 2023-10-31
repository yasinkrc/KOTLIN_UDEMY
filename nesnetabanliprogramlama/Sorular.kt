package com.example.nesnetabanliprogramlama

fun main(){

    fun soru1(derece : Int) : Double {

        val fahrenait=(derece*1.8+32)
        return  fahrenait
    }
    //println("Sonuc : ${soru1(74)}")

    // Kenarları parametre olarak girilen  ve diktörgenin çevresini hesaplayan  bir metodu yazınız


    fun soru2(kisa_kenar : Int , uzun_kenar : Int )  {

        //println("Diktörgenin Çevresi : ${(kisa_kenar+uzun_kenar)*2}")

    }

    soru2(5,6)

    fun soru3 (sayi : Int) : Int {

        if (sayi<0) {
            return -1
        }
        else if (sayi==0){
            return 1
        }
        else {
            var carpim =1
            for (i in 1..sayi) {
                carpim*=i
            }
            return carpim

        }

    }
    /*
    println("Faktoriyel sonucu : ${soru3(5)}")
    println("Faktoriyel sonucu : ${soru3(0)}")
    println("Faktoriyel sonucu : ${soru3(1)}")
    println("Faktoriyel sonucu : ${soru3(-9)}")

     */

    // Parametre olarak girilen kelime ve harf için harfin kelime içinde kaç adet olduğunu gösteren bir method yazınız

    fun soru4(harf : Char,kelime : String) : Int {

        var adet =0
        for (i in 0..kelime.length-1) {

            if (harf==kelime[i]){

                adet++
            }
        }
        return adet

    }

    /*
    println("soru4 : ${soru4('a',"yasinkaraca")}")
    println("soru4 : ${soru4('a',"keriz")}")


     */
    // Parametre olarak kenar sayısına göre iç açılar toplamını hesaplayıp sonucunu geri dönderen metod yazınız
    // Formül n : kenar_sayısı(n-2).180
    fun soru5(kenar : Int ) : Int {

        val sonuc = (kenar-2)*180
        return  sonuc
    }
    /*
    println("sonuc : ${soru5(6)}")
    println("sonuc : ${soru5(5)}")
    println("sonuc : ${soru5(3)}")

     */

    // Parametre olarak girilen gün sayısına göre maaş hesabı yapan ve elde edilen değeri geri dönderen metod yazınız

    fun soru6(gun : Int) : Int {

        var toplam = gun*8

        if (toplam<=160){

            toplam=toplam*10
            return toplam
        }
        else {

            var ektsra = (toplam-160)*20+160*10
            return ektsra

        }


    }

/*
    println("aldığı maaş ${soru6(20)}")
    println("aldığı maaş ${soru6(30)}")


 */

    // Parametre olarak girilen kota miktarına göre ücreti hesaplayarak geri dönderen metodu yazınız
    // 50GB 100 TL
    //Kota aşımından sonra her 1GB 4 TL

    fun fatura (kota : Int ) : Int {

        if (kota>50){

            var para = 100+(kota-50)*4
            return para

        }
        else {
            return 100
        }
    }

    println("Fatura tutarınız  : ${fatura(36)}")
    println("Fatura tutarınız  : ${fatura(59)}")
}