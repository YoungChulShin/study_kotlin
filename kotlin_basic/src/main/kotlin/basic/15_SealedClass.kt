package basic

// sealed -> 컴파일 시점에 하위 클래스를 알 수 있다
sealed class DeveloperInherit {

    abstract val name: String
    abstract fun code(language: String)
}

data class BackendDeveloperInherit(override val name: String) : DeveloperInherit() {

    override fun code(language: String) {
        println("저는 백엔드 개발자입니다. ${language}를 사용합니다")
    }
}

data class FrontendDeveloperInherit(override val name: String) : DeveloperInherit() {

    override fun code(language: String) {
        println("저는 프론트엔드 개발자입니다. ${language}를 사용합니다")
    }
}

object OtherDeveloperInherit : DeveloperInherit() {

    override val name = "익명"
    override fun code(language: String) {
        TODO("Not yet implemented")
    }
}

object DeveloperPool {
    private val pool = mutableMapOf<String, DeveloperInherit>()

    fun add(developer: DeveloperInherit) = when(developer) {
        is BackendDeveloperInherit -> pool[developer.name] = developer
        is FrontendDeveloperInherit -> pool[developer.name] = developer
        is OtherDeveloperInherit -> println("지원하지 않는 개발자입니다")
//        else -> println("지원하지 않는 개발자입니다")
    }

    fun get(name: String) = pool[name]
}

fun main() {
    val backendDeveloper = BackendDeveloperInherit(name = "흥민")
    DeveloperPool.add(backendDeveloper)

    val frontendDeveloper = FrontendDeveloperInherit(name = "케인")
    DeveloperPool.add(frontendDeveloper)

    println(DeveloperPool.get("흥민"))
    println(DeveloperPool.get("케인"))
}