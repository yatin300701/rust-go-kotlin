fun main(){

    // as and as?
    // as is throw exception typecase and alias for import
    // as? typesafe typecase

    typecaseToInt(1234)

    // // Delegation using by

    // val base = BaseImpl(10)
    // Derived(base).print()


}

fun typecaseToInt(obj:Any){
    val str = obj as? String;
    println("Typecased to string with as? : $str")

    val forceful_str = obj as String;
    println("Typecased to string with as $forceful_str")
}

interface Base{
    fun print()
}

class BaseImpl(val x:Int):Base{
    override fun print(){print(x)}
}

class Derived(b:Base): Base by b
