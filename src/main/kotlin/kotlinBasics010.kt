//010 while loop



// while loop same as for loop,but it is used when you don't know the steps (number of repetitions)

fun main() {
    var myNumber =2048

    while (myNumber>2){
        println(myNumber)
        myNumber /= 2
    }
    // do while is the same as while, but it will execute the statement the first time then check and execute while condition
    do{
        println(myNumber)
        myNumber /= 2
    }    while (myNumber>2)
}




