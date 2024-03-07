package basic

/**
 * Kotlin 의 함수의 경우 Class 가 없이 함수만 존재하여도 가능
 * fun 으로 선언하고 이후 함수 명을 선언하고 마지막에 return type 을 명시한다.
 */
fun add(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    var result = add(1, 3)
    println(result)
}