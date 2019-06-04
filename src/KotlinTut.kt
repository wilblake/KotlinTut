package demo


fun main ( args: Array<String>) {

    fun add(num1: Int, num2: Int): Int = num1 + num2
    println("5 + 4 = ${add(5, 4)}")

    // Single line function doesn't need return type
    // Note default values
    fun subtract(num1: Int = 1, num2: Int = 1) = num1 - num2
    println("5 - 4 = ${subtract(5, 4)}")

    // Named params
    println("4 - 5 = ${subtract(num2 = 5, num1 = 4)}")

    // Unit , not void
    fun sayHello(name: String): Unit = println("Hello $name")

    sayHello("Paul")

    val (two, three) = nextTwo(1)
    println("1 $two $three")
}

fun nextTwo(num:Int): Pair<Int, Int> {
    return Pair(num+1,num+2)

}






