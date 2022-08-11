package ch05

fun main() {
//    val strings = arrayOf("1", "2", "3", "4")
//    println(strings[0])
//
//    val arrayOfNulls = arrayOfNulls<String>(5)
//    arrayOfNulls[0] = "1"
//    println(arrayOfNulls[0])
//
//    val array = Array(5) { i -> (i * i).toString() }
//    for (item in array) {
//        println(item)
//    }

    val arrayOf = arrayOf(1, 2, 3, 4, 5)
    val intArrayOf = intArrayOf(1, 2, 3, 4, 5)

    val indices = arrayOf.indices
    println(indices)

    for((index, value) in arrayOf.withIndex()) {
        println("$index - $value")
    }
}