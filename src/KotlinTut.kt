package demo
import java.util.Random

fun main ( args: Array<String>) {
    println("Sum = ${getSum(1,2,3,4,5)}")


// function literal
val multiply = {num1: Int, num2: Int -> num1 * num2}

    println("5*3 = ${multiply(5,3)}")


}

// variable args
fun getSum( vararg nums: Int ) : Int {

    var sum = 0

    nums.forEach {n -> sum += n}
    return sum
}



