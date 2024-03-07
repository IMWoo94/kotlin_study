package basic

fun square(x: Int): Int {
    return x * x
}

fun main() {
    /**
     * Kotlin 변수 선언 시 타입 추론이 기본적으로 적용이 된다.
     * 따라서 변수명 뒷 부분에 타입을 명시하지 않아도 타입 추론으로 인해서 등록이 된다.
     * val, var 의 차이
     * var 는 일반적인 변수와 동일하다.
     * 단, val 로 선언된 변수의 경우 초기화 이후 읽기 전용으로만 사용이 된다.
     */
    val onlyReadResult: Int = square(5)
    var result: Int = square(5)
    result = 20
    println(result)
    println(onlyReadResult)

    // val 변수를 초기화 이후 변경하면 어떻게 될까?
    // 컴파일 단위에서 바로 오류로 인식되어 처리가 되지 않는다.

    /*onlyReadResult = square(1)
    println(onlyReadResult)*/

    // 타입 추론을 확인 해보자
    var type1: Int = square(3);
    var type2 = square(3);
    println(type1.javaClass == type2.javaClass)
}
