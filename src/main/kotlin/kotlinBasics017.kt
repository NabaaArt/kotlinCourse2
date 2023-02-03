
//017 mastring function in kotlin


fun main() {
    println("function is even : ${isEven(8)}")
    println("function is even : ${isEven2(8)}")
    println("function is even : ${isEven3(8)}")
    println("function is even : ${isEven4(8)}")
    println("function get age : ${getAgeStage(23)}")
    println("function younger :${isYounger(33,44)}")
    println("functin say hallo:${sayHello("ali")}")
    println("function is powe : ${toPower(4)}")
}


fun isEven(number :Int): Boolean{
    if (number %2== 0){
        return true
    }else{
        return false
    }
}

//or
fun isEven2(number :Int): Boolean{
    return  if (number %2== 0){
        true
    }else{
        false
    }
}

//more advanced

fun isEven3(number: Int):Boolean{
    return  if (number %2== 0) true else false
}

//more advanced

fun isEven4(number: Int):Boolean = number %2 == 0

fun getAgeStage(age:Int)= when(age){
    in -1 downTo Int.MIN_VALUE-> "بعده مجاي للدنيا" // the minimum value in integer
    in 0..4 -> "baby"
    in 5..12 -> "child"
    in 12..19 -> "teen"
    in 20..39 ->"adult"
    in 40..59 -> "middle age adult"
    in 60..120 -> "old"
    in 121..Int.MAX_VALUE->"الله يرحمه" // the maximum value in integer
    else -> "wrong value"
}

// when the function name starts with (is) its type is boolean

fun isYounger (firstPersonAge :Int,secondPerson :Int) = firstPersonAge < secondPerson

fun sayHello(name:String= "my friend"):String = "hello $name"

fun toPower(number :Int,power :Int =2):Int{

    var result= number
    for(i in 1 until power) {
        result *= number
    }
    return result
}
// power here is a default value that means if you don't pass a value to power it will take its default value
// note: it should not be in the first parameter

