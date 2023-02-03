//002 variables in kotlin


// when you want to declare a non-changeable variable we use val
// the story: we want to build a social media app, and we need to have a link for it
val link :String ="www.oursocialmedia.com"

fun main() {
    //   link="newlink.com"
    // writing this line will cause an error because we declared the link as val and you can't change its value!!
    println(link)

    var like1:Int=5
    // now we can change this value whenever we want
    like1++
    // ++ will increase the number by one , like1++ = like1 + 1
    println(like1)

//declaring a variable in the main function or inside any function will allow you to use that variable in the same function scope only

    val like2 : Long = 4
    // long is used for long numbers

    val like3 : Double = 4.1
    val like4 : Float = 4.1f
    // double and float are used for double numbers
    //you have to write f with float numbers, and you don't have to write float type

    var isFollower: Boolean = false
// boolean takes 2 values which are true or false

    var isFollowers: Char = 'n'
// it takes one symbol, and it has to be in '' not ""

// the first letter for data type should be in upper case
    // the name of the variables we always use camel case which is the first word is lower case and the next words in appar
// case( just for the first letter in the word)


    var isFollowing : Boolean= true
    var isFollowingText :String = isFollowing.toString()
// it will convert the (isFollowing) value to a string and store it in (isFollowingText) variable


    var friendCount :String = "317"
    println(friendCount.toInt() +1)
// if you have a variable which is the count of friends and its type is a string, and you want to increase the number for example
    //   you have to convert it to an int


    var friendCounts :String = "317.2"
    println(friendCounts.toDouble() +1)

// converting string to double, note : there is no decimal number with points for the count of friends

    var follwingCount = 200
    var followersCount =120
    println(followersCount + follwingCount)
    println(followersCount - follwingCount)
    println(followersCount * follwingCount)
    println(followersCount / follwingCount)

    // we can do all the mathematical operations

    // note: when you use a variable and didn't change it , IntelliJ IDEA will highlight the variable which means he is telling you to make it val


    var firstCondition = true
    var secondCondition = false
    print (firstCondition && secondCondition)
    /** && (and)  is logical opration
     * false && false = false
     * true && false = false
     * false && true = false
     * true && true = true
     * **/

    print (firstCondition || secondCondition)
    /** || (or)  is logical opration
     * false || false = false
     * true || false = true
     * false || true = true
     * true || true = true
     * **/
    println ( 120>100)
    // it will return true
    println ( 120+100)

    println ( 120<100)
    // it will return false
    println ( 120==100)
    // it will return false



    val length = 120
    println(length.minus(5))
    println(length.plus(5))
    // here we are calling a function on the object (length)


    //string templets one of the most important priorities in kotlin


    var userAge = "19"
    var userInfo = "user age = " +userAge

    /** it will cause a warning
    to fix it you have to choose ( convert concatenation to the template) on the warning options
    to show warning options :
    click on alt + enter for windows
    click on option + return for mac
     **/

    var userInfo1 = "user age = $userAge"
// when you write a string then $ before the variable name, it will insert the variable which has a $ to the Sring
    println(userInfo1)


    var userInfo2 = "user age = ${userAge + 1 }"
// when you want to insert a variable and do some operation for example

    println("enter user age")
    var userAge1  = readLine()
//when you want to read numbers more than ones
    /**
    var userAge1 :Int = readLine()
    if you write readLine to an Int variable it will cause an error
    case readLine function takes a string
    to fix it :
     **/

    println("enter user age")
    var userAge2 :Int = readLine()!!.toInt()
    var userInfo3= "user age = ${userAge2 + 1 }"
    println(userInfo3)
    // now it will take a value from the user as a string then convert it to int then store it in userAge2 variable
}


