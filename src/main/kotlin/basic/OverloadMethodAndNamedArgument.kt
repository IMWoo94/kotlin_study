package basic

/**
 * 코들린에서는 Java 에서 오버로딩을 하기 위해 메소드를 각각 작성해야 하는 반면
 * 디폴트 기능을 통해서 하나의 메소드로 여러 오버로딩한 효과를 낼 수 있다.
 */
fun overloadMethod(a: Int, b: Int, c: Int = 5) {
    println(String.format("a : %d / b : %d / c : %d", a, b, c));
}

/**
 * 명명 인자를 지원하는데 이는 메소드 호출 시 파라미터를 순서대로 입력해야 적용되는 것을 네임을 통해 순서대로 입력하지 않아도 된다.
 * Java 에서는 순서대로 파라미터를 입력해야 하고, 빌더 패턴을 통해서 원하는 파라미터에 순서 관계없이 작성 할 수 있도록 하는데
 * 코틀린은 명명 인자를 파라미터 입력 시에도 지원을 한다.
 */
fun namedArgument(a: Int, b: Int, c: Int = 1) {
    println(String.format("a : %d / b : %d / c : %d", a, b, c));
}

fun main() {
    // 오버로딩
    overloadMethod(1, 2);
    overloadMethod(1, 2, 6);

    // 명명 인자
    namedArgument(b = 1, a = 5);
    namedArgument(c = 9, a = 5, b = 3);

}