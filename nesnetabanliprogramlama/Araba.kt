package com.example.nesnetabanliprogramlama

class Araba (var renk : String , var hiz :Int , var calisiyor_mu :Boolean) {
    /*
    var otobus : Otobus ? =null
    lateinit var otobus: Otobus

     */

  fun bilgi_Al(){

      println("Renk : $renk ")
      println("hız : $hiz ")
      println("calişiyor mu  : $calisiyor_mu ")

  }

    fun calistir(){
        calisiyor_mu=false
    }
    fun durdur(){
        calisiyor_mu=true
    }
    fun hizlan( kacKm :Int) {

        hiz=hiz+kacKm
    }
    fun yavasla(kacKm: Int){
        if (hiz>0){
            hiz=hiz-kacKm
        }
        else {
            println("araba duruk halde ")
        }
    }
}