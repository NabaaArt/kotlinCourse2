//004 string manipulation


fun main() {
    var userName :String ="ahmed Diaa"
    println(userName.capitalize())
    // it will make the first letter in the first word in capital letter
    println(userName.indexOf('m'))
    println(userName.indexOf('n'))
    // it will return the index of a char, it will return -1 if the char is not existed in the string

    println(userName.substring(3))
    // it will cut the string from the start index to the end of the string

    val indexOfSecondWord = userName.indexOf('D')
    println(userName.substring(indexOfSecondWord))
// the start index is D

    println(userName.substring(userName.indexOf('D')))
// shorter code


    println(userName.isBlank())
    // it will return true if it's blank " " or false it is not empty

    //from kotlin documantaion

    val myString = "Hey there!"
    var item: Char

    item = myString[0]    // item contains 'H'
    for (item in myString) {
        println(item)
    }

    /**
    myString[1] = 'h' it will cause an error
    Strings in Kotlin are Immutable
    Like Java, strings are immutable in Kotlin. This means you cannot change the individual character of a string. For example,
     **/







    /*
     String Literals
     A literal is the source code representation of a fixed value. For example, "Hey there!" is a string literal
     that appears directly in a program without requiring computation (like variables).
    1. Escaped string
     An escaped string may have escaped characters in them. For example,
     */

    val myString2 = "Hey there!\n"
//Here, \n is an escape character that inserts a newline in the text where it appears.


    /**
    Here is a list of escape characters supported in Kotlin:

    \t - Inserts tab
    \b - Inserts backspace
    \n - Inserts newline
    \r - Inserts carriage return
    \' - Inserts single quote character
    \" - Inserts double quote character
    \\ - Inserts backslash
    \$ - Inserts dollar character
     */
    /*
        2. Raw String
        A raw string can contain newlines (not new line escape character)
        and arbitrary text. A raw string is delimited by a triple quote """. For example,
     */
    val myString3 = """
    for (character in "Hey!")
        println(character)
"""
    print(myString3)

    /*
    By default, trimMargin() function uses | as the margin prefix.
    However, you can change it by passing a new string to this function.
     */
    val myString4 = """
    |Kotlin is interesting.
    |Kotlin is sponsored and developed by JetBrains.
"""
    println(myString4)

    println("Output using trimMargin function:\n")
    println(myString4.trimMargin())
    /*
    By default, trimMargin() function uses | as the margin prefix. However,
     you can change it by passing a new string to this function.
     */
    val myString5 = """
    !!! Kotlin is interesting.
    !!! Kotlin is sponsored and developed by JetBrains.
"""
    println(myString5.trimMargin("!!! "))

// Example: String Template With Raw String
    val a = 5
    val b = 6

    val myString6 = """
    |${if (a > b) a else b}
"""
    println("Larger number is: ${myString6.trimMargin()}")








    /**
    Few String Properties and Functions:
     * compareTo function - compares this String (object) with the specified object.
    Returns 0 if the object is equal to the specified object.
     * get function - returns character at the specified index.
    You can use the index access operator instead of the get function as index access
    operator internally calls the get function.
     *   plus function - returns a new string which is obtained by the concatenation of this string and
    the string passed to this function.
    You can use ( + )operator instead of plus function as (+) operator
    calls plus function under the hood
     *  subSequence Function - returns a new character sequence starting at
    the specified start and end index.

     */


}



