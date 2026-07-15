fun basicSyntax(){
    // print syntax
    print("Hello")
    println("World")

    // print in next line
    println("Next line hello world")

    // variable assigned only once
    val x:Int = 5; // can't be reassigned after initialization

    // var for variable assigned which can be reassigned
    var y = x+1;
    y++
    println("value of y is $y")

    val sq = Square()
    println("Square is ${sq.printData()}")

    // string template
    val a = 2;
    val s1 = "a is $a"
    val s2 = "${s1.replace("is","was")}, but now is $a"
    println(s2)


    // conditional expressions
    fun maxOf(a:Int,b:Int) = if(a>b) a else b;
    println("max of 2, 3 is ${maxOf(2,3)}")

    // for loop
    val items = listOf("apple","banana","kiwi")
    for(item in items){
        println(item)
    }

    for(index in items.indices){
        println("item at $index is ${items[index]}")
    }

    // while
    var index = 0;
    while(index < items.size){
        println("item at $index is ${items[index]}")
        index++;
    }

    // when

    fun describe(obj:Any):String = when(obj){
        1->"Hello"
        else -> "Unknown"
    }

    println(describe(1))

    // Ranges
    val value = y+1
    val range = 9
    // min..max -> range
    if (value in 1..range+1){
        println("fits in range")
    }

    // collection - iterate over collection
    val item = listOf("apple","banana","mango")
    for(i in item) println(i)
    // can use in to check if data in it
    fun checkFruitInList(fruit:String, list: List<String>)
    = fruit in list

    println("is mango in list ? Ans: ${checkFruitInList("mango",item)}")

    // lamda expressions in collections
    item.filter { it.startsWith("as") }
    println(item)

    // Nullable values and null checks
    // need ot add ? at the end for possible null values

    // The is operator checks weather an object is of given type.
    // If kotlin can't prove that the variable can't change after the check
    // it automatically casts it to that type

    //eg
    val obj:Any = "Hello"
    if(obj is String){
        println("no need to typecheck to string for checking len: ${obj.length}")
    }




}

// classes are final by default so, can't be used with inheritance, so use
// open : for making  it inheritable
class Rectangle(val height:Int, val length:Int){
    // In classes, constructor is created automatically
    val perimeter = (height + length) * 2;
}

open class Shape(){
    private val priName = "hello"
    var name = priName;
}


// inheritance in classes is denoted by (:)

class Square():Shape(){
    fun printData(){
        name
    }
}