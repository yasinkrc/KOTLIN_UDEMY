package com.example.nesnetabanliprogramlama
import android.bluetooth.le.ScanCallback
import com.example.nesnetabanliprogramlama.paket2.B
import java.lang.Exception
import java.lang.NullPointerException
import java.lang.StrictMath.abs
import java.util.Arrays
import java.util.Random
import java.util.RandomAccess
import java.util.Scanner
import java.util.SplittableRandom
import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.max
import kotlin.math.min
import kotlin.math.sqrt
import kotlin.reflect.typeOf

open class MyClass {

    var isim= "YASİN"
    companion object {
        val globalVariable = "Merhaba, Dünya!"

        fun printGlobalVariable() {
            println(globalVariable)
        }
    }
}

enum class HaftaGunleri {
    PAZAR, PAZARTESI, SALI, CARSAMBA, PERSEMBE, CUMA, CUMARTESI
}


/*

Composition

- Başka Sınıflardan oluşmuş nesnelerin diğer sınıflarda değişken olması

class Adress (var il :String , var ilçe : String ) {

}

class Kişiler (var ad : String , var yaş : Int , var adres :Adres) {

}

val adress =Adres("Bursa" , "Osmangazi " )

val kisi =Kişiler("Ahmet",18,adress )

print(kişi.ad)
print(kişşi.yaş)
print(kişi.aderess.il)
print(kişi.aderess.ilçe)

// Genelde bu veritabanları için kullanıllır

 */




fun main(){

    val gun = HaftaGunleri.PAZARTESI

    when (gun) {
        HaftaGunleri.PAZAR -> println("Bugün Pazar.")
        HaftaGunleri.PAZARTESI -> println("Bugün Pazartesi.")
        HaftaGunleri.SALI -> println("Bugün Salı.")
        HaftaGunleri.CARSAMBA -> println("Bugün Çarşamba.")
        HaftaGunleri.PERSEMBE -> println("Bugün Perşembe.")
        HaftaGunleri.CUMA -> println("Bugün Cuma.")
        HaftaGunleri.CUMARTESI -> println("Bugün Cumartesi.")
    }
    var isim =MyClass.globalVariable
    MyClass.printGlobalVariable()


 /*
    var sayi1=10
    //var sayi1d ,sayi2 ,sayi3=10
    // var a
    var a = 5 ; var c=5 ;var d=6
    println(a)
    println(c)
    println(d)
    println(a+c+d)
    println("${a} , ${c} , ${d}")

    println("\"DİKKAT\" dedi")
    println("//Selam//")
    println("\\selam\\")

    val b = Scanner(System.`in`)
    print("Adınızı giriniz : ")
    val isim =b.nextLine()
    println("Nice to meet you ${isim}")
*/
 /*
    var number = 1234
    println(number::class)
    var a=number.toString()
   println(a::class)

  */

    /*
        val sayi = 10
        val bolen = 0

        try {
            val sonuc = sayi / bolen
            println("Sonuç: $sonuc")
        } catch (e: ArithmeticException) {
            println("Hata yakalandı: Sıfıra bölme hatası - ${e.message}")
        }


     */

    /*
    val girdi=Scanner(System.`in`)
    print("Lütfen ilk  sayıyı giriniz ")
    val sayi = girdi.nextInt()
    print("Lütfen ikinci  sayıyı giriniz ")
    val sayi2 =girdi.nextInt()

    try {

        val sonuc = (sayi/sayi2)
        println("sonuc : $sonuc")
    }catch (e: Exception) {

        println("Payda sıfır olamaz : $e")
    }



     */4

   /*
        val sayiDizisi = arrayOf("5", "10", "15", "20", "30", "yüz") // Son öğe geçerli bir sayı değil
        for (sayi in sayiDizisi) {
            val tamsayi = sayi.toIntOrNull()
            if (tamsayi != null) {
                println("$sayi tamsayıya dönüştürüldü: $tamsayi")
            } else {
                println("$sayi bir tamsayıya dönüştürülemedi.")
            }
        }

    */
  /*
    val sayi: Int? = 42 // Null olabilen bir tamsayı
    sayi?.let { nonNullSayi ->
        println("Değişken null değil, değeri: $nonNullSayi")



   */

    // When

    /*

    var sayi = 1

    when(sayi){

        1-> println("sayı 1")
        2-> println("sayı 2")
        3-> println("sayı 3")
        4-> println("sayı 4")
        5-> println("sayı 5")
        6-> println("sayı 6")
        7-> println("sayı 7")
        else -> println("Böyle bir sayi yok $sayi")
    }
    println("Birinci ")

    for (i in 1..5){
        println(" ${i} ")
    }
    println("İkinci ")
    for (i in 1 until 20 step  2){

        println(i)
    }
    println("Üçüncü  ")
    for (i in 60 downTo 0 step 6){

        println(i)

     */

    // Dizi ve döngüler
/*
    val a = arrayOf("selam","bir",4,5,96,78,123,7896)

    for (i in a){
        println(i)
    }


 */

   // var a = Array<String>(5){""}
   // val  girdi =Scanner(System.`in`)

    //var  a= arrayOf("yasin","karaca","mehmet",5,6,3,54,5,45,45,4,54,54,5,45,4)
/*
    for (i in 0 until a.size){
        println("isim giriniz : ")
        val isim =girdi.nextLine()
        a[i]=isim
    }

 */

 //   val a = arrayOf("yasin", "karaca", "mehmet", 5, 6, 3, 54, 5, 45, 45, 4, 54, 54, 5, 45, 4)
   // val reversedArray = a.reversedArray()
    //println(reversedArray.contentToString())


    /*
    for ((i,isim) in a.withIndex()){
        println("${i+1}.isim : $isim")
    }


     */

    /*
    val sayiAdeti = 10

burada bilmedeğim bir hata oldu
    for (i in 1..sayiAdeti) {
        val rastgeleSayi = random.nextInt(1, 101) // 1 ila 100 arasında rastgele bir sayı üretir
        println("Rastgele Sayı $i: $rastgeleSayi")
    }




     */
    /*

    val a = ceil(6.5)
    println(a)
    val b = sqrt(45f)
    println(b)
    val c= floor(4.545)
    println(c)
    val e=abs(-8)
    println(e)
    val d= max(152,444)
    println(d)
    val f= min(45.4,3.4)
    println(f)



    */

    // NESNE TABANLI PROGRAMLAMA

    // Ütü --> sınıf
    //Ütü1 - Ütü2 --> nesneler
 /*
    val beb=bebek()

    println(beb.isim)
    println(beb.yas)
    beb.isim="ahmet"
    beb.yas=12

    println(beb.isim)
    println(beb.yas)

  */

   // var beb= bebek("yasin",20)
   // var beb= bebek("yasin",20)
  /*
  val beb  = bebek("Yazgülü",22)
  println(beb.isim)

  beb.a()
    println(beb.isim)

   */

  /*
  val beb=bebek("yas",11)
  println(beb.tekrar_(12,24))
  println(beb.topla(1,2,3,4,5))

   */
    /*
    val beb =bebek("yasin",23)
    var str :String ="Null"
    var str1 :String? = null
    var sayi :Int ?


    str1?.trim()

    str!!.trim()

    var a :bebek ? =null

     */

    // Ektension Fonksiyon ve infix özelliği

    /*
    fun Int.carpi(sayi : Int) : Int {

        return this*sayi
    }

    */







}




