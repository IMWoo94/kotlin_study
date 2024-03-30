package basic


/**
 * Java 에서 제공하는 접근 제어자가 있다면, Kotlin 에서는 가시성 제어자가 있다.
 * 역할 비슷하지만 조금씩 다른 기능이 있다.
 */

/**
 * public : 어디서나 접근 O, Java 와의 차이점은 Default 가 public 이다.
 * private : 클래스 내에서만 접근 가능 Java 와 동일
 * protected : 상속받은 클래스에서만 접근 할 수 있으며, Java 와 동일 합니다.
 * 다만, kotlin 의 경우 클래스 선언이 final 이 default 이므로 상속을 위해 open 을 선언해야 합니다.
 * ex) class VisibilityModifier -> final class VisibilityModifier [ 상속 불가 ]
 *     open class VisibilityModifier [ 상속 가능 ]
 * internal : Java == default, 별도로 부여를 해야 동일 모듈로 접근 제한
 * 여기서 모듈은 패키지보다 범위가 넓다. 한 프로젝트는 다수의 모듈을 포함할 수 있음
 */

open class VisibilityModifier {

    // 가시성 제어자 미 선언 시 기본적으로 public
    fun publicMultiplyTwoNumbers(a: Int, b: Int) = println("public : " + a * b)

    private fun privateMultiplyTwoNumbers(a: Int, b: Int) = println("private : " + a * b)

    protected fun protectedMultiplyTwoNumbers(a: Int, b: Int) = println("protected : " + a * b)

    internal fun internalMultiplyTwoNumbers(a: Int, b: Int) = println("internal : " + a * b)

}