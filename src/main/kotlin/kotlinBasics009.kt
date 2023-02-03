//009 for loop



// for use range, you don't have to set int for the counter because it knows that
// .. means number1 <= number2
// until means number1 < number2
fun main() {
    for (i in 10.downTo(0)step 2)
        print(" $i")
    print('\n')
    for (i in 0..10 step (2))
        print(" $i")


    for (i in 10..0 step (2))
        print(" $i")
// you can't use this , you have to use (downTo)


    val friendNameList  = listOf("Ahmed","Ali","Zahraa")
    for (i in 0 until friendNameList.size)
        println(friendNameList[i])
    // here will show a warning that we can use a loop on the elements itself, not on the index of elements


    for(element in friendNameList){
        println(friendNameList)
    }
// we use for loop in list or when you want to repeat some lines of code
    // note: we use for loop when the repetition number is known (steps) !!!!


    // advanced for loop on lists

    friendNameList.forEach{
        println(it)
        // it means: friendNameList for each (element) print it
    }

}


