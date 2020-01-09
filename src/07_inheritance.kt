/*
*    inheritance in kotlin
*/
// Parent class must be marked 'open'
open class Animal {
    // Property must be 'open' to be overridden
    open val legs: Int = 4

    // Function must be 'open' to be overridden
    open fun makeSound() {
        println("Generic animal sound")
    }
}

// Child class extends parent using ':' and initializes its constructor
class Dog : Animal() {
    override val legs: Int = 4

    override fun makeSound() {
        println("Woof!")
    }
}






/*
*    Aggregation (Weak HAS-A Relationship)
*/

// The independent "part" object
data class Professor(val name: String)

// The "whole" container object
class University(val name: String) {
    // Aggregation: Holds a mutable list of Professors
    private val professors = mutableListOf<Professor>()

    fun hire(professor: Professor) {
        professors.add(professor)
    }

    fun showStaff() {
        println("$name staff members:")
        professors.forEach { println("- ${it.name}") }
    }
}

fun main() {
    // 1. Create the independent professor objects first
    val profAlice = Professor("Dr. Alice")
    val profBob = Professor("Dr. Bob")

    // 2. Create the university scope
    var techUniversity: University? = University("Tech University")
    
    // 3. Establish the weak HAS-A relationship
    techUniversity?.hire(profAlice)
    techUniversity?.hire(profBob)
    techUniversity?.showStaff()

    // 4. Destroy the university container object
    println("\n--- Shutting down the university ---")
    techUniversity = null 

    // 5. The professor objects still exist independently in memory
    println("Checking professor status after university shutdown:")
    println("Professor 1: ${profAlice.name} is still alive and available.")
    println("Professor 2: ${profBob.name} is still alive and available.")
}













/*
*    Composition (Strong HAS-A) relationship
*/

// The "Part" component
class Engine(val horsepower: Int) {
    fun start() {
        println("Engine with $horsepower HP roaring to life!")
    }
}

// The "Whole" container (Strong HAS-A)
class Car(val model: String) {
    // The Car instantiates and owns the Engine directly.
    // The Engine's lifecycle is strictly bound to this Car.
    private val engine: Engine = Engine(250)

    fun startCar() {
        println("Preparing to drive $model...")
        engine.start() // Relying on the owned component
        println("Car is moving.")
    }
}

fun main() {
    // Creating the container automatically creates its internal dependencies
    val myCar = Car("Tesla Model 3")
    myCar.startCar()
    
    // Once 'myCar' goes out of scope, the internal Engine is marked for garbage collection too.
}