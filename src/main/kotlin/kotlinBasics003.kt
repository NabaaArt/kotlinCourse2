//003 null safety in kotlin

/** in java you can enter any null string, but in kotlin, all the primitive data types, and all classes that we can make objects
from it is null safe
null safe which means it can't take null!!!
null means empty value ( zero is not included)
 **/
fun main() {
    var accountId : String = "abc123"
    println(accountId.length)
    /* in java when you have a null string, and then you call this string (or any null value) it will
    cause a crash for the program
    but in kotlin, you can't have any null, and it will cause an error at compile time ( even before running the program)
     */
    /** if you want to initialize a nullable variable
     * you can use (?) in variable declaration
     *  that means this variable takes a normal input, or maybe it will take a null value
     */
    var accountId1 : String? = "abcd123"
    /** if you write it this way :
    println(accountId1.length)
    it will cause an error because the ( accountId1 ) may be null and if it is null then you can't do any operation
    for example.
    to fix it you can use it!! and that means you are sure that the variable ( accountId1 ) is not null
     */
    println(accountId1!!.length)

// note if the value is null the program will be crashed, to fix it in ( java )we can use the if statement
    if (accountId1 != null ){
        println(accountId1.length)
    }
    /** this will make the code longer, so you have to use ? and that means if the variable has a value then print it
    and if it is null then convert the null the ( accountId3 ) in  println(accountId3?.length) to ( length ) the length will be null and it will
    print null **/

    var accountId3 : String? = null
    println(accountId3?.length)
}


