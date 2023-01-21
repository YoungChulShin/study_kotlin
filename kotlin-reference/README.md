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
- `a downTo b`: a부터 b까지 값을 내리면서 가져올 수 있다
- `step`: 값을 얼마씩 증가시킬지 결정
   - `1..10 step 2`: 1부터 10까지 2씩 증가하면서 