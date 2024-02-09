import kotlin.math.pow

fun main() {
    try {
       print("рис а")
        print("\nВведите x:")
        var x1 = readLine()!!.toDouble()
        var y1=0.0
        if (x1>=-1)
        {
            when{
                x1<=1 && x1>=-1 -> y1=Math.sqrt(x1.pow(2)+1)
                x1>1 -> y1=x1-1
            }
            println("Для $x1 функция равна ${String.format("%.2f", y1)}")
        }
        else println("х должен быть больше -1")
        print("рис б")
        print("\nВведите x:")
        var x2 = readLine()!!.toDouble()
        var y2=2.0
        if (x2>=-1)
        {
            when{
                x2<=0 && x2>=-1 -> y2=x2+1
                x2>0&&x2<=3->y2=1.0
                x2>3&&x2<=4-> y2--
                else ->println("x не в границах")
            }
            println("Для $x2 функция равна: $y2")
        }
        else println("x должен быть больше -1")
        print("рис в")
        print("\nВведите x:")
        var x3 = readLine()!!.toDouble()
        var y3=0.0
        if (x3>=-1)
        {
            when{
             x3<=0 &&x3>=-1 -> y3=x3+1
             x3>0&&x3<=1->y3=x3
             x3>3&&x3<=4->y3=x3*0.5-0.5
             else ->y3=1.0
            }
            println("Для $x3 функция равна: $y3")
        }
        println("x должен быть больше -1")
    }catch (e:Exception) {
        println("вы ввели не то")}
}