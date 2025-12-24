// Visibility modifiers - private , protected, internal , public
// Default - public

// private - will be visible inside the file which contains declaration

// internal - client inside the module will see internal members if she/he sees declaring class

// protected - same visibility as private but it is also visibile in subclases

package foo

private fun foo(){
    // visible to visibility modifier file
    println("I am private and visible to this file only")
}

public var bar = 5 // visible everywhere

internal val baz = 6 // same module only

// FOR CLASSES

// private - visible in class only
// protected - visible in subclass but same as private
// internal - client in this module who sees declaring class sees it
// public - who sees class sees it 

open class Outer{
    private val a = 1
    protected open val b = 2
    internal open val c = 3
    val d = 4

    protected class Nested{
        public val e: Int = 5
    }
}

class Subclases:Outer(){
    //a is not visible
    // b,c,d are visible 
    // Nested and e are visble

    override  val b = 6
    override val c = 7
}

class Unrelated(private val o:Outer){
    fun printAll(){
        println("${o.c}")
    }
}

fun main(){
    val  o = Outer()
     val u =  Unrelated(o)
     u.printAll()
}
