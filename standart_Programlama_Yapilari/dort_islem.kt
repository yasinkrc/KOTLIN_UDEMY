package standart_Programlama_Yapilari


import java.util.Scanner

fun  main(){
while (true) {


    var girdi=Scanner(System.`in`)
    print("Lütfen Yapmak istediğiniz seçimi girniz (1 , 2 , 3, 4 ) : ")
    var secim=girdi.nextInt()

    if ((secim==1) ||  (secim==2) || (secim==3) ||(secim==4) ) {
        print("1.sayi :  ")
        var birinci_Sayi = girdi.nextInt()
        print("2.sayi : ")
        var ikinci_Sayi = girdi.nextInt()


        if (secim==1){
            println("****************  Toplama ********************* . ")
            println("Toplam : ${birinci_Sayi+ikinci_Sayi}")
        }
        else if (secim==2){
            println("****************  Çıkarma  ********************* . ")
            println("Toplam : ${birinci_Sayi-ikinci_Sayi}")

        }
        else if (secim==3){
            println("****************  Çarpma  ********************* . ")
            println("Toplam : ${birinci_Sayi*ikinci_Sayi}")

        }else if (secim==4){
            println("****************  Bölme  ********************* . ")
            println("Toplam : ${birinci_Sayi/ikinci_Sayi}")

        }
        else {

            println("Yanlış bir sayı girdiniz")
        }
    } else {

        println("Yanlış Tercih girdiniz .")
    }


}
}