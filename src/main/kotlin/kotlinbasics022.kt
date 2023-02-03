//022 kotlin lambdas



//making function in lambda, note that nothing changes in the function it only does not have any name
// the last line should be the return line
fun main() {
    println(myFunction())
    println(myFunction1(4,8))
    println(myFunction2(4,7))
    println(myFunction3())
}


val myFunction ={
    "hello"
}
val myFunction1 ={ no1:Int , no2:Int ->
    no1 + no2
}

// making data type for the lambda

val myFunction2 :( Int , Int ) -> Int = { no1 , no2 ->
    no1 + no2
}

// when the function doesn't have a data type it will return unit

val myFunction3 :() -> Unit ={
    println("hello lambda")
}

