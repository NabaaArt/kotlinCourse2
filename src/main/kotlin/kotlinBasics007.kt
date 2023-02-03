
//007 when statement


var friendCount1 = 70
fun main() {

    if(friendCount1 in 0..20){
        println("lonely")
    }else if(friendCount1 in 20..100){
        println("family $ friends")
    }else if(friendCount1 in 100..500){
        println("social person")
    }else if(friendCount1 in 500..5000){
        println("famous")
    }
// it will show a warning that says " cascade (if) should be replaced with when

    // when is the same as a switch with more functionality, it means if else if else statements
    when (friendCount1) {
        in 0..20 -> {
            println("lonely")
        }
        in 20..100 -> {
            println("family $ friends")
        }
        in 100..500 -> {
            println("social person")
        }
        in 500..5000 -> {
            println("famous")
        }
    }


    val myNumber = 10
    when(myNumber){
        1,10-> {
            println("one")
            println("ten")
        }// if myNumber = 1 or 10
        2-> println("two\n")
        in 11..99-> print("two\n")
        else -> println("other number\n")

    }

    // you can delete print statements so (when) will return a value that you can store in variable

    val digitalCount =

        when(myNumber){
            in 1..9 -> "one\n"
            in 10..99 -> "two\n"
            in 100..999 -> "three\n"

            else -> "long number"
            // note: if you delete the else statement it will cause an error, because when you want to return a value
            //from when statement you have to write (else statement) because you will store the value of (when) in a variable
            // and maybe the variable won't have any value so you should write (else statement)
        }
    print(digitalCount)

    // or you can set a null value :
    val digitalCount1 : String? =

        when(myNumber) {
            in 1..9 -> "one\n"
            in 10..99 -> "two\n"
            in 100..999 -> "three\n"

            else -> null
        }
    print(digitalCount1)


    // also you have not in
    val myNumber1= 7
    val digitalCount2  =

        when(myNumber) {
            !in 20..40 -> "some number"
            in 1..9->"one"
            else -> null
            // here it will just only execute the first (in statement) and won't check others (in statements)
        }
    print(digitalCount2)

}

