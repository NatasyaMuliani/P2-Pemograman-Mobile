
fun main(){
    println("masukkan Nilai Uts Anda")
    val uts: Int = readLine()!!.toInt()
    println("masukkan Nilai Uas Anda")
    val uas: Int =  readLine()!!.toInt()

    val NA : Double= 0.4 * uts + (0.6 * uas)
    println(NA)
    if(NA > 80){
        println("Selamat Anda naik semester")
    }else{
        println("Kamu cuti semester")
    }
}

