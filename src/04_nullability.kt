/*
*   2 ways to store null in a variable
*/ 
fun main() {
    val favoriteActor = null
    println(favoriteActor)


    val favoriteActor: String? = null
    println(favoriteActor)
}
// output - null


/*
* reassign a null variable using 
*/
fun main() {
    var favoriteActor: String? = null
    println(favoriteActor)
    
    
    favoriteActor = "kevin"
    println(favoriteActor)
}




/*
* ways to access methods or properties of nullable variables
*/
fun main() {
    /*
    *   (?.) safe call operator 
    */
    var favoriteActor: String? = null
    println(favoriteActor?.length)


    /*
    *   not null assertion
    */
    var favoriteActor: String? = "kevin"
    println(favoriteActor!!.length)



    /*
    *   if / else conditionals
    */
    var favoriteActor: String? = null
    
    if (favoriteActor != null){
        println(favoriteActor.length)
    }else{
        println("favoriteActor is null")
    }



    /*
    *   if / else expressions
    */
    var favoriteActor: String? = "Sandra Oh"

    val lengthOfName = if (favoriteActor != null) {
      favoriteActor.length
    } else {
      0
    }

    println("The number of characters in your favorite actor's name is $lengthOfName.")





    /*
    *   elvis operator
    */ 
    var favoriteActor: String? = null

    val lengthOfName = favoriteActor?.length ?: 0

    println("The number of characters in your favorite actor's name is $lengthOfName.")

}