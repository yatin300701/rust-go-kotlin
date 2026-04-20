fun main(){
    // for loop
    val fruits = mutableListOf<String>("Apple","Orange")
    val iterator = fruits.listIterator()
     while (iterator.hasNext()) {
        val value = iterator.next()
        println(value)
    }

    // break and continue

    /**
     * Labels are control flow feature
     * controls break, continue, return jumps
     */
    loop@ for(i in 1..10){
        for(j in 1..10){    
            if(i==1 && j == 2) break@loop // it break loop label for loop , ie parent , not just child
            println("i and j are $i and $j")
        }
    }

    for(i in 1..10){
        for(j in 1..10){    
            if(i==1 && j == 2) break // it will not work 
            println("new i and j are $i and $j")
        }
    }

    // return@forEach 
    /**
     * If you want to do nothing in forEach loop and return it, not its parent function, use @forEach
     */

    val list = listOf(1,2,3,4,5)
    
    list.forEach{
        if(it == 3) return@forEach // return to forEach ie loop
        println(it)
    }

    // equivalent to break 
    run loop@{
        list.forEach{
            if(it == 3) return@loop
            println(it)
        }
    }

    /**
     * return@label value
     * 
     * label - where to return
     * value - what to return
     */


     val value = run loop@{
        if(true) return@loop 1
         2
     }

     println("value is $value")

    
}