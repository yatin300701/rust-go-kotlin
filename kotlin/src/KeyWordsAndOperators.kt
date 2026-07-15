fun keyWordsAndOperators(){
    println("")
    println("")
    println("Started day 2 of key words and operator: ")

   // for type checking and type casting

    // is - check type
    // !is - not of a type
    // as - Unsafe cast - it forces kotlin to attempt type of element to this, if not possible throw error
    // as? - Safe cast - it asks kotlin to change its type if not possible give null, not error
    // these are not actually converting but just type asserting

    val obj:Any = "Hello"

    if(obj is String){
        println(obj.length)
    }
    val num1: Int? = obj as? Int
    println("num1 is ${num1}")
    // will get error in this
    // val num2: Int = obj as Int
    // print("num1 ${num2}")


    // visibility modifier

    // public - everywhere
    // private - only inside class or file
    // protected - class + subclasses ( inherited in entire hierarchy )
    // internal - same module

    // ?: elvis - operator - if null or empty use this
    val length = obj.toString().length ?: 0

    // Object Oriented Programming

    // constructor - secondary constructor - primary is in class header
    class User1(val name:String) // default created constructor
    class User2 {
        var name:String ;
        constructor(name:String){
            this.name = name
        }
        constructor(id:Int){
            this.name = "User$id"
        }
    }
    println("User can be created as ${ User2(2).name}")





}