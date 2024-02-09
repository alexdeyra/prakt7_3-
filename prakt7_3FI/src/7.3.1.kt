import kotlin.math.PI
import kotlin.math.pow

fun main(){
    try {
        print("R=")
        val r = readLine()?.toDoubleOrNull() ?: return
        print("H=")
        val h = readLine()?.toDoubleOrNull() ?: return
        if (h>0 && r>0) {
            val v = PI * r.pow(2) * h
            println("V=$v")
        } else(println("радиус и высота должны быть больше 0"))
    }catch (e:Exception) {println("Вы ввели не цифру")}
}