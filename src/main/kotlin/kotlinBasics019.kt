//019 comments in kotlin


// we use comments to help us understand the code

fun main() {
    println("function get age : ${getAgeStage1(23)}")
    // if you put the mouse on function call and wait it will show you the documentation comments
}


// region conditionals
/**
 * This is used as documentation
 * @param age this parameter is the age of a person
 * @return string represents the age of a person
 * @see isYounger you can use to compare ages
 */







fun getAgeStage1(age:Int)= when(age){
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

fun isYounger1 (firstPersonAge :Int,secondPerson :Int) = firstPersonAge < secondPerson

// region comment helps to group scopes of code that is connected with each other, so we can hide or show it

//endregion


