
fun main() {
try {
    print("k = ")
    val k = readLine()!!.toDouble()
    print("b = ")
    val b = readLine()!!.toDouble()
    print("c = ")
    val c = readLine()!!.toDouble()
    print("d = ")
    val d = readLine()!!.toDouble()

    println("находим y=kx+b")
    var x1 = -b / k
    var y1 = k * x1 + b
    println("равно ($x1;$y1)")

    println("находим y=cx+d")
    var x2 = -d / c
    var y2 = c * x2 + d
    println("равно ($x2;$y2)")
}catch (e:Exception) {println("вы ввели не цифру")}
}