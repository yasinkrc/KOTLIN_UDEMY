package standart_Programlama_Yapilari

fun main(){

    // Her ikiside if ve döngülerde kullanılır

    for (i in 1..5){

        if (i==3){
            break
        }

        println("Döngü1 : $i")
    }
    for (i in 1..5){

        if (i==3){
            continue
        }

        println("Döngü2 : $i")
    }
}