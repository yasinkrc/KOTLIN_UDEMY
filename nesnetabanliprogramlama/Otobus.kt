package com.example.nesnetabanliprogramlama

class Otobus (var kapasite : Int , var nereden : String ,var nereye :String , var mevcut_Yolcu : Int) {

    fun yolcuAl(yolcu : Int){

        if (kapasite>=mevcut_Yolcu){
            mevcut_Yolcu+=yolcu
            if (mevcut_Yolcu>=kapasite){
                var a =mevcut_Yolcu-kapasite
                println("Araba dolu ne yaziki $a yolcu dışarıda kaldı ")
            }
        }
        else {
            println("Ötobüs dolu : yolcu sayısı $mevcut_Yolcu")
        }
    }
    fun yolcuIndir(yolcu : Int) {

        if (mevcut_Yolcu>=0){
            mevcut_Yolcu-=yolcu
        }
        else {
            println("Ötobüs boş zaten  : yolcu sayısı $mevcut_Yolcu")
        }

    }
    fun bilgi_al(){

        println("Kapasite : $kapasite")
        println("Nereden : $nereden")
        println("Nereye : $nereye")
        println("Yolcu Sayısı : $mevcut_Yolcu")
    }


}