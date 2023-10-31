package com.example.nesnetabanliprogramlama

fun main (){

    val k1 =Kategoriler(1,"Dram")
    val k2 =Kategoriler(2,"Komedi")

    val y1 =Yonetmenler(1,"Nuri Bilge Ceylan")
    val y2 =Yonetmenler(2,"Quentin Tarantino")

    val f1 =Filmler(1,"Django",2013 ,k1,y2)

    println("Film id : ${f1.film_id}")
    println("Film ad : ${f1.film_Ad}")
    println("Film yıl : ${f1.film_yil}")
    println("Film kategori_id : ${f1.kategori.kategori_id}")
    println("Film kategori_ad : ${f1.kategori.kategori_ad}")
    println("Film yonetmen_id : ${f1.yonetmen.yonetmen_id}")
    println("Film yonetmen_adi : ${f1.yonetmen.yonetmen_adi}")

}