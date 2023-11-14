package com.example.collections

fun main(){

    val u1 =Urun(1,"Saat",150.0)
    val u2 =Urun(2,"Tv",1750.0)
    val u3 =Urun(3,"Bilgisayar",2950.0)

    val urunler =ArrayList<Urun>()
    urunler.add(u1)
    urunler.add(u2)
    urunler.add(u3)

    for (urun in urunler){

        println("*****************************************")
        println("urunNo :${urun.urunNo} , urunAdi :${urun.urunAdi} , urunFiyati :${urun.urunFiyati}")

    }

}
