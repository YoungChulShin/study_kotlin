package ch03

class Task(val name: String, _priority: Int = TEST_PRIORITY) {

    companion object {
        const val MIN_PRIORITY = 1
        const val MAX_PRIORITY = 5
        const val DEFAULT_PRIORITY = 3
        val TEST_PRIORITY = 10
    }

    // =validPriority는 초기화 함수
    // 그 이후에 값 변경은 setter를 통해서
    var priority = validPriority(_priority)
        set(value) {
            field = validPriority(value)
        }


    private fun validPriority(p: Int) =
        p.coerceIn(MIN_PRIORITY, MAX_PRIORITY)
}

fun main() {

    val task = Task(name = "test", _priority = 2)
    println(task.priority)

    task.priority = 6
    println(task.priority)

    val task2 = Task(name = "test")
    println(task2.priority)
}