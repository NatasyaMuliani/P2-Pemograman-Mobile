fun main(){
    println("masukkan nama lengkap")
    val nama: String? = readLine()
    println("masukkan bilangan 1")
    val bil1: Double = readLine()!!.toDouble()
    println("masukkan bilangan 2")
    val bil2: Double =  readLine()!!.toDouble()

    println("operasi penjumlahan :" + (bil1 + bil2) )
    println("operasi pengurangan :" + (bil1 - bil2) )
    println("operasi perkalian :" + (bil1 * bil2) )
    println("operasi pembagian :" + (bil1 / bil2) )

}