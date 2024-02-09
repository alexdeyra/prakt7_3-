import kotlin.math.PI
fun main() = try {
    print("R1: ")
    var r1= readLine()!!.toDouble()
    print("R2: ")
    var r2= readLine()!!.toDouble()
    when {
        (r1<r2 && r1>0 && r2>0)-> println("Плоащдь кольца равна S=${PI*(r2*r2-r1*r1)}")
        else -> println("r1 не должен быть больше r2 и оба радиуса должны быть больше нуля")
    }
}catch (e:Exception) {println("Вы ввели не цифру")}