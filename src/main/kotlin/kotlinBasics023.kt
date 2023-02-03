//023 higher-order function


// when you pass a function as a parameter to a function

fun main() {
    // here we are passing multiple functions to doOperation function
    println(doOperation(8,4,multiple))


    //also we can store the function in a variable
    val finalResult = doOperation(8,4,{ num1 : Int , num2 : Int -> num1 * num2 })
    println(finalResult)

    val finalResult1 = doOperation(8,4, ::sum)
    println(finalResult)
    // passing normal function name as a parameter to another function you have to write :
    // :: function name

    val finalResult2 = doOperation(8,4) { num1: Int, num2: Int -> num1 * num2 }
    println(finalResult2)
    // we can move lambda argument out of parentheses like this

    val result2 = doOperation1{ num1 : Int , num2 : Int -> num1 * num2 }
    println(result2)
    // if we have only the function as a parameter we have to write the parentheses

}

fun sum(number1 :Int, number2: Int):Int{
    return number1 + number2
}// this is a normal function, not lambda, we can pass it to another function


fun doOperation(no1: Int, no2 :Int, myFunction : (Int,Int)-> Int ): Int {
    val result=  myFunction(no1,no2)
    return result
}
// to pass a function as a parameter to another function you have to write:
// function name :(first data type of the variable ,second data type of the variable ,) -> data type of the function


val multiple = { num1 : Int , num2 : Int -> num1 * num2 }
// this is lambda !!


//note: the signature of the lambda (multiple) has two integer parameters it returns an integer as same as the function (doOperation) does
// that it means the two signatures should be the same

//-----------------------
fun doOperation1( myFunction :(Int,Int)-> Int ): Int {
    val result=  myFunction(2,4)
    return result
}


fun getFriendsNamesStartWith4(listOfFriends :List<String>, firstCharacter :Char) =
    listOfFriends.filter { it[0] == firstCharacter }
// filter function is lambda and it takes one parameter, and it does not have a name it looks like:
// () -> Boolean








