/*
*   functions
*/ 
fun main() {
    birthdayGreeting()
}

fun birthdayGreeting() {
    println("Happy Birthday, Rover!")
    println("You are now 5 years old!")
}


/*
*   return a value from a function
*/ 
fun main() {
    val greeting = birthdayGreeting()
    println(greeting)
}

fun birthdayGreeting(): String {
    val nameGreeting = "Happy Birthday, Rover!"
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}



/*
*   Named arguments
*/ 
fun main() {
    println(birthdayGreeting(name = "Rex", age = 2))
}

fun birthdayGreeting(name: String, age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}


/*
*   default argument
*/ 
fun main() {
    val greeting = birthdayGreeting(age = 12)
    println(greeting)
}

fun birthdayGreeting(name: String = "Rover", age: Int): String {
    return "Happy Birthday, $name! You are now $age years old!"
}