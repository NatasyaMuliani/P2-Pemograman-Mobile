fun main(){
    val angka = 7

    when(angka){
        3,4,5 -> println("it is summer seosen")
        6,7,9 -> println("it is rainy seosen")
        8,11 -> println("it is auntum seosen")
        10,12,1,2 -> println("it is winter seosen")
        else -> print("invalid input")
    }

    //case calculator when

    println("masukkan Nilai 1 :")
    val n1: Double = readLine()!!.toDouble()
    println("masukkan Nilai 2 :")
    val n2: Double =  readLine()!!.toDouble()
    println("masukkan Nilai 3 :")
    val n3: Double =  readLine()!!.toDouble()

    println("masukkan Opsi:")
    val opsi = readLine()

    when(opsi){
         "a","A"  -> println("operasi penjumlahan :" + (n2 + n3) )
        "b","B"  -> println("operasi pengurangan  :" + (n3 - n1) )
        "c","C"  -> println("operasi perkalian :" + (n2 * n3) )
        "d","D"  -> println("operasi pembagian :" + (n1 / n3) )
        else -> print("invalid input")
    }
}








