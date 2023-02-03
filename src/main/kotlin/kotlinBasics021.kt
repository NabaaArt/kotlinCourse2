//021 function with list in kotlin


fun main() {
    val myFriends = listOf("Ali","Ahmed","Ameer","Haytham","Zaid")
    println(getFriendsDetails(myFriends))
    println(getFriendsNamesStartWith(myFriends,'A'))
}

fun getFriendsDetails(listOfFriends: List<String>)= "you have ${listOfFriends.size} friend"

//filter and get only friends that's there names start with a

fun getFriendsNamesStartWith(listOfFriends :List<String>, firstCharacter :Char){
    val filteredFriendsList = mutableListOf<String>()
    for (i in 0 until listOfFriends.size){
        if (listOfFriends[i].get(0)==firstCharacter){
            filteredFriendsList.add(listOfFriends[i])
        }

    }
}

// shorter function
fun getFriendsNamesStartWith1(listOfFriends :List<String>, firstCharacter :Char){
    val filteredFriendsList = mutableListOf<String>()
    for (friend in listOfFriends){
        if (friend.get(0)==firstCharacter){
            filteredFriendsList.add(friend)
        }

    }
}
// also shorter function

fun getFriendsNamesStartWith2(listOfFriends :List<String>, firstCharacter :Char) : List<String>{
    val filteredFriendsList = mutableListOf<String>()
    listOfFriends.forEach{
        if (it.get(0)==firstCharacter){
            filteredFriendsList.add(it)
        }
// (it) in (for each) means the current element
    }
    return filteredFriendsList
}


fun getFriendsNamesStartWith3(listOfFriends :List<String>, firstCharacter :Char) = listOfFriends.filter { it.get(0) == firstCharacter }
// filter the list of friends and take every friend if it's the first letter is equal to the first character



