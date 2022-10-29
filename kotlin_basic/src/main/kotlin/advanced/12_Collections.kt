package advanced

fun main() {

    // immutable
    val currencyList = listOf("달러, 유로, 원")

    // mutable
    val mutableCurrencyList = mutableListOf("달러", "유로")
    mutableCurrencyList.add("원")

    val mutableCurrencyList2 = mutableListOf<String>().apply {
        add("달러")
        add("유로")
        add("원")
    }

    // immutableSet
    val numberSet = setOf(1, 2, 3, 4)

    // mutableSet
    val mutableNumberSet = mutableSetOf<Int>().apply {
        add(1)
        add(2)
        add(3)
    }

    // immutable map
    val numberMap = mapOf("one" to 1, "two" to 2)

    // mutable map
    val mutableNumberMap = mutableMapOf<String, Int>()
    mutableNumberMap["one"] = 1
    mutableNumberMap["two"] = 2

    val mutableNumberMap2 = mutableMapOf(
        "one" to 1,
        "two" to 2
    )
    mutableNumberMap2["three"] = 3

    val buildMap = buildMap {
        put("one", 1)
        put("two", 2)
    }
    println(buildMap)


    // collection builder - 입력 값은 mutable인데 결과는 immutable
    // buildList, buildSet
    val numberList = buildList{
        add(1)
        add(2)
        add(3)
    }

    // ArrayList
    var arrayList = ArrayList<Int>().apply {
        add(1)
        add(2)
    }

    // iterator
    val iterator = currencyList.iterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }

    // for
    for (currency in currencyList) {
        println(currency)
    }

    currencyList.forEach {
        println(it)
    }

    println("=======")

    val lowerList = listOf("a", "b", "c")
    val upperList = mutableListOf<String>()

    for (lowerCase in lowerList) {
        upperList.add(lowerCase.uppercase())
    }

    println(upperList)

    println("=======")
    var upplerList2 = lowerList.map { it.uppercase() }.filter { it == "A" || it == "C" }
    println(upplerList2)

    println("=======")
    // java 처럼 하려면 asSequence()를 사용하자
    //
    val toList = upplerList2.asSequence()
        .map { it.lowercase() }
        .toList()


    // map, filter, foreach 등을 제공한다
    // 이 함수들은 각각의 단계마다 결과를 만드릭 때문에 메모리가 많이 사용되는 곳에서는 asSequence를 사용한다

}