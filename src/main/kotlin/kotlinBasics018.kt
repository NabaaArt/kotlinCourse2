//018 function overloading


// we can have a function in the same name, but they must have a different signature and that means it has a different argument
// type and number and that means function overloading
fun main() {
    println(calculateSum(1,3))
    println(calculateSum(1,3,6))
    println(calculateSum("1","3"))
}

fun calculateSum (no1:Int , no2:Int):Int = no1+no2

fun calculateSum (no1:Int , no2:Int,no3:Int):Int = no1+no2+no3

fun calculateSum (no1:String , no2:String):Int =   no1.toInt() +no2.toInt()

