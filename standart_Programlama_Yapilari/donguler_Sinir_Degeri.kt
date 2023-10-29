package standart_Programlama_Yapilari

fun main(){

    /*
    *Döngüler belirli kodları tekrarlı çalıştırma amaçlı yapılardır
    * Örneğin ; Veri tabanından gelen verileri işlemek için
    *Döngü Türleri ;
    * for in
    * While
     */

    //  3 ile 6
    for (i in 3..6 step 1) {

        println(i)
    }
    var sayac=3
    while (sayac<=6) {
        println(sayac)
        sayac++
    }
    // 0 ile 8 2 şer 2 şer artsın ve azalsın

    for ( i in 0..8 step 2 ) {
        println(i)

    }

    for (i in 8 downTo 0 step 2) {

        println(i)

    }
    println("************************** son *************")

    sayac=0
    while (sayac<=8) {

        println(sayac)
        sayac+=2
    }
    sayac=8
    while (sayac>=0) {

        println(sayac)
        sayac-=2
    }
}