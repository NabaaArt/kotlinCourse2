// 015 compact function in kotlin
//is used when the function does only one action, for example: increasing or decreasing a variable number,
// or it only returns the value
fun main() {
like2()
    dislike2()
    getLikesDetails2()
    like2()
    showLikes1()
}


fun like2() = likeCount1++


fun dislike2() =  likeCount1--


fun getLikesDetails2 () =  "likes: $likeCount1\n"


fun showLikes1() = print(getLikesDetails())
