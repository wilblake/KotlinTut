package demo
fun main (args: Array<String>) {

    val myName = "Wil Blake"
    val longStr = """This is a long string ...."""
    println("String len : ${longStr.length}")
    println("1 + 2 = ${1 + 2}")
    var str1 = "A random string"
    var str2 = "a random string"
    println("Strings Equal: ${str1.equals(str2)}")
    println("Compare A to B: ${"A".compareTo("B")}")

    println("2nd Index : ${str1.get(2)}")
    println("2nd Index : ${str1[2]}")
    println("2nd - 7th Index : ${str1.subSequence(2,8)}")
    println("Contains random : ${str1.contains("random")}")
}
