//005 conditional in kotlin

val isUserBlocked = true
val followerCount =3700000

val isUserBlocked1 = false

fun main() {
    if (isUserBlocked) {
        println("user is blocked")
        // this line will execute if it is true
    }
    if (4 > 2) {
        println("user is blocked")
        // this line will execute if it is true
    }
    if (4 < 2) {
        println("user is blocked")
        // this line won't execute if it is false
    }
    if (isUserBlocked1) {
        println("user is blocked")

    } else {
        println("profile details ")
    }

    // nested if
    /** when the first if condition won't execute then it will jump on the else if condition
    and if it won't execute then it will execute the else state
     **/


    if (followerCount < 1000) {
        println(followerCount)
    } else if (followerCount < 1000000) {
        println("${followerCount / 1000}k")
    } else {
        println("${followerCount / 1000000}M")
    }








    val numberOne = 200
    val numberTwo = 280
    var max = 0
    if( numberOne>numberTwo){
        max =numberOne
    }else{
        max =numberTwo
    }
    println("max :$max")
    // shortcut for the same code

    var max1 = if( numberOne > numberTwo) numberOne else numberTwo
    println("max :$max")

}
