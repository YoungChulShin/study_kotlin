# 저장소 설명
[Kotlin Docs](https://kotlinlang.org/) 를 보면서 필요한 부분을 코딩하고 메모하는 저장소

# Overview
## Kotlin Native
https://kotlinlang.org/docs/native-overview.html

개념
- Kotlin code를 이용해서 Virtual Machine없이 동작하는 코드를 작성할 수 있다

# Basics
## Basic Syntax
### 상속
기본적으로 클래스는 final이기 때문에 상속을 하려면 `open` 키워드를 붙여준다

### when 표현식
개념
- java의 case 같은 느낌. when 에 다양한 식을 추가해서 조건을 추가할 수 있다

샘플 코드
```kotlin
fun describe(obj: Any) =
    when (obj) {
        1           -> "One"
        "Hello"     -> "hi"
        is Long     -> "Long"
        !is String  -> "Not a string"
        else        -> "Unknown"
    }
```

### Rnage
개념
- `a..b`: a에서 b까지 범위의 값을 올리면서 가져올 수 있다
   - `1..9`: 1부터 9까지
- `a until b`: a에서 b까지. b를 포함하지 않는다
- `a downTo b`: a부터 b까지 값을 내리면서 가져올 수 있다
- `step`: 값을 얼마씩 증가시킬지 결정
   - `1..10 step 2`: 1부터 10까지 2씩 증가하면서 

## Idioms
### Data class
기능
- getter, setter(val 일 경우)
- toString
- equals, hashcode
- copy
- componentN

### Lazy Property
특징
- val에 값을 호출되는 시점에 값으로 정의할 수 있다
- 예를 들어서 변후가 호출되는 시점에 시간으로 값을 설정하고 싶다면
   ```kotlin
   val time: String by lazy {
    Instant.now().toString()
   }
   ```

### Extension functions
특징
- 기존 타입에 추가적인 기능을 확장해서 추가할 수 있다
- 예: 모든 문자열에 `hi` 기능을 추가하고 싶으면
   ```kotlin
   // 선언
   fun String.sayHi() {
      println("hi, $this")
   }

   // 사용
   val name = "shinyc"
   name.sayHi()
   ```

### Singleton
```kotlin
object Resource {
    val name = "Name"
}
```

### Abstract class 
추상 클래스 선언
```kotlin
abstract class MyAbstractClass {
    abstract fun doSomething()
    abstract fun sleep()
    fun greeting() {
        println("hi")
    }
}
```

추상 클래스의 구현 클래스 정의
```kotlin
class MyClass: MyAbstractClass() {
    override fun doSomething() {
        println("lalala")
    }

    override fun sleep() {
        println("zzzz")
    }
}
```

추상클래스를 직접 선언
- object를 이용해서 선언
```kotlin
val myInstantObject = object : MyAbstractClass() {
    override fun doSomething() {
        println("lalala")
    }

    override fun sleep() {
        println("zzzz")
    }
}
```

### if, when, try-catch expression
if, when, try-catch는 표현식으로 사용될 수 있다

### with. apply, also
with
- 특정 인스턴스를 이용해서 n개의 메서드를 호출할 수 있다
   ```kotlin
   val test = Test()
   with(test) {
    // method #1
    // method #2
    // method #3
   }
   ```

apply
- 생성자에서 제공되지 않는 속성에 대한 설정을 할 때 유용하다
   ```kotlin
   val myRectangle = Rectangle().apply {
     length = 4
     color = 0x121212
   }
   ```
also
- 응답 값이 바뀌지 않으면 추가적인 동작을 수행할 때
   ```kotlin
   // swap value
   var a = 1
   var b = 2
   a = b.also { b = a }
   ```