import kotlin.math.pow
import kotlin.math.sqrt


fun main() {
try {
    print("x = ")
    val x = readLine()!!.toDouble()
    print("y = ")
    val y = readLine()!!.toDouble()
    print("R = ")
    val r = readLine()!!.toDouble()

    val hypotenuse = sqrt(x.pow(2) + y.pow(2))

    if (hypotenuse <= r) {
        println("Принадлежит")
    } else {
        println("не принадлежит")
    }
}catch (e:Exception) {println("Вы ввели не то")}
}