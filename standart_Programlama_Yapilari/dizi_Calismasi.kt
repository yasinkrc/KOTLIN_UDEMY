package standart_Programlama_Yapilari

fun main() {

    //Tanımlama

    val  dizi1 =Array<Int>(5){0} // {0,0,0,0,0}

    val dizi2 = arrayOf(1,10,7)
    println(dizi2[2])
    val dizi3 = arrayOf<String>("Yasin","Ahmet","Delil")
    val dizi4 = arrayOf<Int>(1,2,2,4,54,545,45,45,4,54,5,45,4)
    val dizi5 = arrayOf(3,5,8,"Selam","Hemude")

    var dizi6 = arrayOf(3,8,"elma",true)

    val meyveler= arrayOf<String>("Çikek","Muz","Elma","Kivi","Kiraz")

    // Peki veriler Nasıl Ulaşırız .

    val str1 =meyveler[2]
    println(str1)
    val str2=meyveler.get(3)
    println(str2)

    // Veri Üzerinde işlem yapma

    meyveler[1]="Yeni Muz"

    println(meyveler.contentToString())

    meyveler.set(2,"Yeni Elma")
    println(meyveler.contentToString())

    // Array işlemleri

    println(meyveler.isEmpty())
    println(meyveler.count())
    println(meyveler.first())
    println(meyveler.last())
    println(meyveler.indexOf("Kivi"))
    println(meyveler.contains("Muz"))
    println(meyveler.contains("Yeni Muz"))
    println(meyveler.max())
    println(meyveler.min())
    println(meyveler.sort())
    println(meyveler.contentToString())
    println(meyveler.reverse())
    println(meyveler.contentToString())
}