
fun main(){
    try {
        print("Введите четырёхзначное число: ")
       val n= readLine()!!.toInt()
        val n1=n%10
        val n2=(n/10)%10
        val n3=(n/100)%10
        val n4=(n/1000)%10
        println("Произведение ${n1*n2*n3*n4}")
    }catch (e:Exception) {println("Вы ввели не цифру")}
}