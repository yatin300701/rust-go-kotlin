// Exceptions are objects and throwing one creates an instance of an exception class

/**
 * Kotlin offers additional ways to automatically throw exceptions using precondition functions
 * 
 * Require - check user input validity
 * Check - checks object or variable state validity
 * Error - indicates illegal state or condition
 */

fun main(){
    printNameWithCheck("Yatin")
    // printNameWithCheck("")

    printNameWithRequire("Yatin")
    // printNameWithRequire("")

    // failAlways("Yatin")
    // failAlways("")

    try {
         validateCredit(200)
    validateCredit(10)
    }
    catch(e:InvalidCredit) {
        println("Credit is invalid")
    }
   
}

fun printNameWithCheck(name:String){
    check(name.isNotBlank()) 
    println("Name is $name")
}

fun printNameWithRequire(name:String){
    require(name.length > 0) {
        "Name is empty"
    }
    println("Name is $name")
}

fun failAlways(name:String){
    error("This fun will always give error") 
    println("Name is $name")
}

/**
 * Try - Catch - Finally
 */

 /**
  * Custom Exception
    Represent domain or business failure

    Base Classes
    IllegalArgumentException - Invalid input from caller
    IllegalStateException - Invalid internal state
    RuntimeException - Domain / business rule failure
    Exception - 
  */

  class InvalidData(message:String): RuntimeException(message)

  // Example : Add-on recharge domain

  sealed class AddOnException(message:String):RuntimeException(message)
  // Sealed - compiler knows all possible failure

  class InvalidCredit(credit:Int):AddOnException("Invalid Credit $credit")


  fun validateCredit(credit:Int){
    if(credit < 100) throw InvalidCredit(credit)
    println("Credit is valid")
  }

  /**
   * Nothing
   *   type of expression 'throw IllegalArgumentException' is Nothing
   *    special type in kotlin which means functions or expressions that never complete successfully
   */

   /**
    * TODO ()
        which uses Nothing type , acts like placeholder to highlight areas of code that need to be implemented
    */

    