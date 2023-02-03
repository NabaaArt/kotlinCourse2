
//011 breaking loops in kotlin


// break is used to stop the loop

fun main() {
    for(i in 1..20){
        if (i==9) break
        println(i)
    }

    // breaking nested loop

    for(i in 1..5){

        for(j in 1..10){
            if(i==2)break
            print("${i*j}\t")
        }
        print("\n ")
    }
    // here it will skip when i=2  and complete the rist of the loop

    for(i in 1..5){
        if(i==2)break
        for(j in 1..10){

            print("${i*j}\t")
        }
        print("\n ")
    }
    // here it will stop executing when the 1 = 2



    // label of loops

    loop1@  for(i in 1..5){
        loop2@   for(j in 1..10){
            print("${i*j}\t")
        }
        print("\n ")
    }

    //you can write a break statement anywhere inside the loop scope and put a label for the loop then call it in a break statement
    loop1@  for(i in 1..5){
        loop2@   for(j in 1..10){
            if(i==2) break@loop2
            print("${i*j}\t")
        }
        print("\n ")
    }
}





