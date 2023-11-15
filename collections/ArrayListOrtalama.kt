package com.example.collections

import java.util.Scanner

fun main(){

    val girdi =Scanner(System.`in`)

    val kisi=ArrayList<DersNotlar>()
    while (true){


        print("Lütfen ders adını giriniz : ")
        val dersAdi=girdi.next()
        print("Lütfen Notunuzu giriniz :")
        val dersNot =girdi.nextInt()
        val dersNotlar =DersNotlar(dersAdi,dersNot)

        kisi.add(dersNotlar)


        println("Çıkmak için (1) --- Devam etmek için diğer sayılar")
        val cikis=girdi.nextInt()

        if (cikis==0){
            var toplam =0
            for (ogrenci in kisi){

                toplam+=ogrenci.not

            }
            var ortalama=toplam/kisi.size
            println("Not ortalamanız : $ortalama ")

            if (ortalama<=50){

                println("Ne yaziki okuldan  kaldınız  :( ")
            }
            else println("Tebrikler okulu geçtiniz :) ")
            println("Çıkış Yapıldı")
            break
        }
    }



    }

