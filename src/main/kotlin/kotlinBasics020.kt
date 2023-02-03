//020 named args in kotlin


fun main() {
    createUser(123882 ,"bk119",25,"iraq",null)
    //this is named args
    createUser(
        city = null,
        userName = "bk119",
        userAge = 24,
        userId = 123455,
        country = null,
    )
}


/**
 *This function creates a new user and stores it in the database
 * @param userId user unique id
 * @param userName user a unique name
 * @param user age should be larger than 12
 * @param country optional user country
 * @param city optional user city
 */


fun createUser(userId:Int,userName :String,userAge :Int, country:String?,city:String?){
    //let us imagine that function creates a user and store it in the database
    //then display it user name
    displayText(userName)

}

fun displayText(text :String){
    println(text)
}



//createUser(
//city = null,
//userName = "bk119",
//userAge = 24,
//userId = 123455,
//country = null,
//)
//}

//this is called dead code you should delete it