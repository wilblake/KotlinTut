package demo
fun main (args: Array<String>)
{
    println("Hello, world!")

    val name = "Wil"

    var myAge = 55

    var bigInt : Int = Int.MAX_VALUE

    var smallInt : Int = Int.MIN_VALUE

    println("Biggest Int: " + bigInt)
    println("Smallest  Int: $smallInt")

    var bigLong: Long = Long.MAX_VALUE
    var smallLong : Long = Long.MIN_VALUE

    println("Biggest Long $bigLong" )
    println("Smallest Long $smallLong")

    var bigDouble: Double = Double.MAX_VALUE
    var smallDouble: Double = Double.MIN_VALUE
    println("Biggest Double: $bigDouble")
    println("Smallest Double: $smallDouble")

    var bigFloat: Float = Float.MAX_VALUE
    var smallFloat: Float = Float.MIN_VALUE

    println("bigFloat $bigFloat")
    println("smallFloat $smallFloat")

    if (true is Boolean)
    {
        print("true is boolean\n")
    }
 var letterGrade: Char = 'A'
    println("A is a Char: ${letterGrade is Char}")

    println("3.14 to Int " + (3.14.toInt()))

    println("A to Int : " + ('A'.toInt()))
    println("65 to Char: " + 65.toChar() )
}
