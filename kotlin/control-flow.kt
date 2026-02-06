fun main(){
    var routine = arrayOf("Wakeup","Eat","Sleep")
    for(i in routine.indices){
        print(routine[i]+" ")
    }
    println("")

    // with index
    for((index,value) in routine.withIndex()){
        println("The routine at $index is $value")
    }

    // in class
    val booklet = Booklet(3)
    for(page in booklet){
        println("Reading page $page")
    }

    // labels
    
    
}

// to create iterator for class is to inherit from Iterable<T> interface and override the iterator(), next() and hasNext()
class Booklet(val totalPages:Int):Iterable<Int>{
    override fun iterator():Iterator<Int> {
        return object: Iterator<Int>{
            var current = 1;
            override fun hasNext() = current <= totalPages
            override fun next() = current++ 
        }
    }
}