//016 function argument in kotlin

// local variable: the variable that is declared  outside the main function, and you can use it in any scope in the program
//local variable: the variable that is declared in s specific scope, and you only can use it inside that scope

// arguments or parameters: it used to give access to a function and makes it do some actions on inaccessible variables,
// it is a value that is sent to the function, and the function can use it,  but it is only a copy from the actual variables
// you can have 2 variables in a different scopes but have the same name, but you can't if they are in the same scope

fun main() {
    var likeCount2: Int = 0
    likeCount2 = like4(likeCount2)

    showLikes4(likeCount2)

    likeCount2 =  dislike4(likeCount2)

    showLikes4(likeCount2)
}
fun like4(oldLikeCount : Int)= oldLikeCount + 1
/*
we cant use (oldLikeCount++ or oldLikeCount--) because it is a copy from the argument, and you can't edit it you just pass it
to the function
*/


fun dislike4(oldLikeCount : Int) =oldLikeCount - 1

fun getLikesDetails4(likeCount2 :Int) =  "likes: $likeCount2\n"

fun showLikes4(likeCount2 : Int){
    print(getLikesDetails4(likeCount2))
}



