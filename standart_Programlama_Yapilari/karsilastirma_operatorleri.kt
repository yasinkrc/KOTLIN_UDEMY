package standart_Programlama_Yapilari

fun main(){

    var s1 =50
    var s2=50

    var y1=70
    var y2=80

    println(s1==s2)
    println(s1>=s2)
    println(s1>s2)
    println(s1<=s2)
    println(s1<s2)
    println(y1>y2)
    println(y1>=y2)
    var sonuc =( s1>=s2 || y1>y2)
    var sonuc_ =( s1>=s2 && y1>y2)
    println( "Or işleminin sonucu : $sonuc " )
    println( "Or işleminin sonucu : $sonuc_ " )
}