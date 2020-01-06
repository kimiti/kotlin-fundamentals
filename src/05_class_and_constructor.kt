/*
*   Define a class
*/
class SmartDevice{
    // empty body
}

fun main(){
    // create an instance of a class
    val smartTvDevice = SmartDevice()
}



/*
*   define class methods & class properties
*/ 
class SmartDevice {

    // define class properties
    val name = "Android TV"
    val category = "Entertainment"
    var deviceStatus = "online"


    //  Define class methods
    fun turnOn() {
        println("Smart device is turned on.")
    }

    fun turnOff() {
        println("Smart device is turned off.")
    }
}


fun main() {
    val smartTvDevice = SmartDevice()
    
    println("Device name is: ${smartTvDevice.name}")

    // call a class method outside of the class
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()
}



/*
*   define getter and setter function
*/ 
class SmartDevice {

var speakerVolume = 2
    get() = field  
    set(value) {
        field = value    
    }



var speakerVolume = 2
    set(value) {
        if (value in 0..100) {
            field = value
        }
    }

}


/*
*   define a default constructor
*/ 
class SmartDevice constructor() {
    ...
}


/*
*   define a secondary constructor
*/ 
// Class header with a primary constructor that initializes name and age
class Person(val name: String, var age: Int) {

    // Secondary constructor that takes age as a String and converts it to an Int
    constructor(name: String, age: String) : this(name, age.toIntOrNull() ?: 0) {
        println("$name created with converted age: ${this.age}")
    }
}

fun main() {
    // Uses the secondary constructor with age as a String
    Person("Bob", "8")
    // Bob created with converted age: 8
}



/*
*   define a secondary constructor (with No Primary Constructor)
*/ 
class User {  
    var name: String
    var age: Int

    // Secondary Constructor 1
    constructor(name: String) {
        this.name = name
        this.age = 0
    }

    // Secondary Constructor 2
    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }
}


/*
*   define a secondary constructor (with a Primary Constructor)
*/ 
class Person(val name: String, var age: Int) {

    // Secondary constructor delegating to the primary constructor
    constructor(name: String) : this(name, 18) {
        // Optional: Additional initialization logic code goes here
        println("Secondary constructor called")
    }
}