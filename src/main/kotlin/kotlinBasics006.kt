//006 ranges in kotlin

var friendCount = 137
fun main() {
    if(friendCount >= 0 && friendCount<=20){
        println("lonely")
    }else if(friendCount >= 20 && friendCount<=100){
        println("family $ friends")
    }else if(friendCount >= 100 && friendCount<=500){
        println("social person")
    }else if(friendCount >= 500 && friendCount<=5000){
        println("famous")
    }
    // this code can be shorter and easier

    val myRange = 0..20
    //or
    val myRange1 = 0.rangeTo(20)
    // descending
    val myRange2 = 20.downTo(0)
    myRange.printAll()
    //when you write number1..number2 this means that there is a range from number1 to number2

    if(friendCount in 0..20){
        println("lonely")
    }else if(friendCount in 20..100){
        println("family $ friends")
    }else if(friendCount in 100..500){
        println("social person")
    }else if(friendCount in 500..5000){
        println("famous")
    }



    val myRange3 = 0..100 step (5)
    // it will take numbers from 0 + 5 = 5 then 5+5=10 till 100

    println("enter number to see if it is in range or not")

    val someNumber = readLine()!!.toInt()
    if (someNumber in myRange3){
        println("in range")
    }else{
        println(" not in range")
    }


// range also could be letters
    var myRange4 = 'a'..'m' step (3)
    println("enter word to see if the first char is in range or not")
    val someChar = readLine()!!.toCharArray()[0]
    if (someChar in myRange4){
        println("in range")
    }else{
        println(" not in range")
    }

}

fun IntProgression.printAll(){
    this.forEach{
        print("  $it  ")
    }
}







