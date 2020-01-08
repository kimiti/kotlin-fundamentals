/*
*   Overriding Methods
*/
open class Animal {
    // Must be marked 'open' to allow overriding
    open fun makeSound() {
        println("Generic animal sound")
    }
}

class Dog : Animal() {
    // Must use the 'override' keyword
    override fun makeSound() {
        println("Bark!")
    }
}





/*
*   Overriding Properties
*/
open class Vehicle {
    open val speed: Int = 0
}

// Option 1: Overriding in the class body
class Car : Vehicle() {
    override val speed: Int = 100
}

// Option 2: Overriding directly in the constructor
class Motorcycle(override val speed: Int) : Vehicle()