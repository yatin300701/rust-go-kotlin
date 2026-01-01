/**
 * Types
 * In kotlin eveything is obj , ie have methods which it can call to, but that does not mean
 * it allocats memory for each one of them
 *
 * Int - have plus(4) // just add fn
 * boxing occurs when required ie nullable types, generics <List> , usage of Any
 *
 * Kotlin exproses primities as if  it were obj
 * while still using primitive representations at run time
 */

/**
 * All Nullable References to such objects refers to the same cached object
 * val a:Int = 100
 * val boxA : Int?  = a
 * val boxB : Int? = a
 *
 * println(boxA == boxB) // true
 */

