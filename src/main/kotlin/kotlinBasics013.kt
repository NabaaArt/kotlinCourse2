// 013 function in kotlin


//functional programming: means that every action (or function ) is can be separated into separate function
var likeCount =0
fun main() {
    like()
    like()
    dislike()
    like()
    print("likes: $likeCount")
    // when we invoke the function in the main function it will be executed !!
    //the function won't execute until we invoke it
}
fun like(){
    likeCount++
}
fun dislike(){
    likeCount--
}