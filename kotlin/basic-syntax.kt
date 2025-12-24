fun main(){

    // Print Data 

    print("Hello")
    print(" World ")
    println("!")
    println("Kotlin Started")

    //  Read Data

    // println("Enter any word: ")
    // val word = readln();

    // println("You entered : $word");

    // Functions

    printSum(4,5)
    println("Sum of 3 and 4 is ${printSumShort(3,4)}")


    //  Variables

    /**
     * Val - Immutable variable 
     * Var - Mutable variable
     */

    //  Classes

    val rectangle = Rectangle(5.0, 4.0)
    println("Parimeter is ${rectangle.perimeter}")

    // Conditional Expressions

    println("Max of 5 and 6 is ${maxOf(5,6)}")

    // List and For loop

    val items = listOf("apple","banana","kiwi")
    for(item in items){
        println("Item  is ${item}")
    }

    //  while

    var index = 0;
    println("\nUsing while loop: ")
    while(index<items.size){
        println("${items[index]}")
        index++
    }

    // Ranges

        // check condition 
        val num = 12;
        if(num in 0..12){
            println("$num is in range of 1 to 12")
        }

        // for
        for(x in 1..3){
            println("Range item: $x")
        }

    // Type check
    val str = "Hello is am Yash"
    println("length of string is ${getStringLength(str)}")
    

}

// Inheritance between classes is declared by : 
// Classes are final by default
// to make it inheritable use 'open'


class Rectangle(val height:Double, val length:Double){
    val perimeter = (height+length)*2;
}

fun printSum(a:Int,b:Int){
    println("Sum of these two is ${a + b}")
}

fun printSumShort(a:Int,b:Int)= a+b;

fun maxOf(a:Int, b:Int) =  if(a>b) a else b;

fun getStringLength(obj:Any):Int?{
        // type check 
        if(obj is String){
            return obj.length
        }
        return null
}