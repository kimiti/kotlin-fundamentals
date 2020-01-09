/*
*   Reuse superclass code in subclasses with the super keyword
*/
open class Robot {
    open val model = "Gen 1"
    open fun powerOn() {
        println("System booting...")
    }
}

class CleaningRobot : Robot() {
    override val model = "Vacuum Bot" // Overriding parent property
    
    override fun powerOn() {
        super.powerOn() // Calls Robot.powerOn()
        println("Cleaning protocols active. Model: ${super.model}") // Accesses Robot.model
    }
}