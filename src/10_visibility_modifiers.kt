/*
*   visibility modifier for properties
*/
open class SmartDevice() {
    private var deviceStatus = "online"
}

/*
*   visibility modifier for setter functions
*/
open class SmartDevice(){
    var deviceStatus = 1
    	private set(value){
            if(value in 0..100){
                field = value
            }
        }
}

/*
*   visibility modifier for methods
*/
class SmartTvDevice{
    var channelNumber: Int = 0
    
    protected fun nextChannel() {
        channelNumber++
        println("Channel number increased to $channelNumber.")
    }      

}


// With a visibility modifier (the "constructor" keyword is REQUIRED)
class User private constructor(val name: String) 



/*
*   visibility modifier for classes
*/
internal open class SmartDevice(val name: String, val category: String) {

}