package standart_Programlama_Yapilari

fun main(){

    val meyveler= arrayListOf<String>("Elma","Portakal","Limona","Karpuz","Kiraz")

    for (meyve in meyveler){
        println(meyve)
    }
    for ((indeks , meyve) in meyveler.withIndex()){
        println("${indeks+1}. $meyve")
    }
}