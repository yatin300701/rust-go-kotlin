/**
 * Arrays
 * holds fixed number of same type of data
 *
 * - mutable element
 */


fun main(){
    val simpleArray = arrayOf(1,2,3)
    println("Simple array is ${simpleArray.joinToString()}")

    // array of nulls

    val nullArray = arrayOfNulls<Int>(4)
    println("null array ${nullArray.joinToString()}")

    // Initialise arryay
    val initArray = Array<Int>(3){ i->i}
    // or Array(3){it}
    println("Init Arry ${initArray.joinToString()}")

    //Modifing array -
    initArray[0] = 2
    println("Init Arry ${initArray.joinToString()}")

    // Spread operator (*) expands array elements for vararg
    printAllInts(*initArray.toIntArray())

    // functions on arry
    // - contentEquals
    // - contentDeepEquals
    // - sum
    // - shuffle
    // - toList / toSet

}

fun printAllInts(vararg nums: Int) {
    for (num in nums) {
        println(num)
    }
}