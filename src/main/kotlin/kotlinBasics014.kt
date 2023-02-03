//014 return value in kotlin

// function should be reusable and reduce repetition
// click: command + r for mac  or ctrl + r for windows, and you can replace any line of code
var likeCount1 =0
fun main() {
    showLikes()
    like1()
    showLikes()
    like1()
    showLikes()
    dislike1()
    like1()
    showLikes()
}
fun like1(){
    likeCount1++
}
fun dislike1(){
    likeCount1--
}

// so here we can create a function to return the value  (likeCount1)
fun getLikesDetails(): String{
    return "likes: $likeCount1\n"
}
// we can create a function that shows likes
fun showLikes(){
    print(getLikesDetails())
}



