

val config by lazy {
    println("Init config")
    "Config"
}

fun main() {
    println("hello")
    val person1 = Customer("Yatin",24)
    println("Customer 1 is ${person1.name} with age ${person1.age}")

    val fruits = arrayOf("Apple","Orange","PineApple")
    val notOrange = fruits.filter{it != "Orange"}
    println("Fruits which are not orange are $notOrange")

    if("Apple" in fruits)
    println("Apple is in fruits")
    else println("Apple is not in fruits")

    /**
     * Lazy Property
     * Value is NOT Created  untill its accessed first time and then cached forever
     */

    println("Before lazy confign")
    println("Lazy is $config")

    /**
     * Extension Function
     * Adds utility Funtion to an existing type without modifying the original class or its source code
     * Does it at compile time
     */

    val mail = "hello@gmail.com"
    val normal = "test"
    println("Mail is ${mail.isEmail()} and normal is ${normal.isEmail()}")

    println("Name is ${Resource.name}")


    // Inline value use
    user(UserId(1))


    // if not null else && get first item or null from collection
    val list = listOf<String>()
    println("list is ${list.firstOrNull() ?: "empty" }")

    // execute if no null
    val value = "Hello World"
    value.let{
        println("Value is not null")
    }


    // Build array -  using IntArray
    val arr = IntArray(3) // [0,0,0]
    val arr2 = IntArray(3){i->i*2} // [0,1,4]
    val arr3 = IntArray(3).apply{fill(2)} // [2,2,2]

    // swap two numbers
    var a = 1
    var b = 2
    a = b.also{b=a}
}

// Data class has getters , setter and other funs by default
data class Customer(
    val name: String,
    val age: Int
)

// Extension Function
fun String.isEmail() = contains("@") && contains(".")

// singleton object
object Resource{
    val name = "Name"
}


/**
 * Inline
 * creates a distinct , compiler enforced type that is usually represented as its underlying value at runtime
 */
@JvmInline
value class UserId(val value:Int)
// can add validations in it, which will run at runtime
// we are not using data obj as it will allocate memory  for obj, but inline will not

fun user(id:UserId){
    println("User id is ${id.value}")
}





