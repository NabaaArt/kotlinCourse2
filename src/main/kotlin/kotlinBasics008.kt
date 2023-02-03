//008 list in kotlin



// mutable: means changeable like var
//immutable: means unchangeable like val


fun main() {
    val friendNameList : List<String> = listOf("Ahmed","Ali","Zahraa")
    // if you don't set a data type for the list, it will take any data type you enter

    val friendNameList1 = listOf("Ahmed","Ali","Zahraa", 4, 4.5 , 'f')
    //group of data types

    println(friendNameList)
    //  friendNameList[0]="Saif"
    // the list is immutable, so this statement will cause an error, to make it mutable:

    val friendNameList2 = mutableListOf("Ahmed","Ali","Zahraa")
    friendNameList2[0]="Saif"
    friendNameList2.add("saif")
    friendNameList2.add(1,"noor") // add on index 1 of the list
    println(friendNameList2)

    // friendNameList2 is val so how we could change the list values?
    // answer:  friendNameList2 is mutable means you can edit on it by adding new elements or changing its values
    //also it is val list and that means we can't replace another list!!!

// we can replace the list to another list by var :

    var friendNameList3 = mutableListOf("Ahmed","Ali","Zahraa")
    friendNameList3= mutableListOf("Zaid","Laith")

// search about what is the difference between a list and an array

    var friendNameList4 = arrayOf("Ahmed","Ali","Zahraa")
}



