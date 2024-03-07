package basic

/**
 * 기존 Java for 문법보다 간결하게 나타낼 수 있다.
 */
fun loop() {
    var sum = 0
    for (i in 1..10) {
        sum += i
    }
    println(sum)
}

/**
 * 내림차순, 건너뛰기 같이 직관적으로 선언하여 사용할 수 있다.
 */
fun loop1() {
    for (i in 10 downTo 0 step 3) {
        println(i)
    }
}

fun loop2() {
    for (i in 0 until 2) {
        println(i)
    }
}

fun main() {
//    loop()
//    loop1()
    loop2()
}