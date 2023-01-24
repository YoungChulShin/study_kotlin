package study.kotlin.reference.concepts.classesandobject

fun main() {
    // 클래스 초기화 테스트
    val initOrderDemo = InitOrderDemo("son")

    val customer = Customer("hello")

    // 아무 파라미터도 정의하지 않으면 public 기본 생성자가 생성


}

// 기본 생성자
class Person(firstname: String)

// 클래스 초기화
// - init 키워드를 이용해서 초기화를 저징할 수 있다
// - 순서대로 실행된다
class InitOrderDemo(name: String) {
    val firstProperty = "First property: $name".also(::println)

    init {
        println("First initializer block that prints $name")
    }

    val secondProperty = "Second property: $name".also(::println)

    init {
        println("Second initializer block that prints $name")
    }
}

class Customer(name: String)

// 기본생성자에 접근 제한자를 설정하려면 constructor 키워들가 필요하다
class PrivateCustomer private constructor(name: String) {

    constructor(): this("hello")
}

// 아무것도 지정하지 않으면 기본 생성자가 추가된다

class PetPerson(val pets: MutableList<Pet> = mutableListOf())
class Pet {
    constructor(owner: PetPerson) {
        owner.pets.add(this)
    }
}

// 기본생성자가 있을 때 추가 생성자가 생긴다면 추가 생성자는 기본 생성자를 호출해야한다

class Person2(val name: String) {
    val children: MutableList<Person2> = mutableListOf()

    // 1. Person2를 통해서 기본생성자가 호출되고
    // 2. 초기화 로직이 수행된다
    constructor(name: String, parent: Person2): this(name) {
        parent.children.add(this)
    }
}