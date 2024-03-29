package basic

fun getTypeOfDayWithSwitchStatement(dayOfWeek: Int): String {
    val typeOfDay: String = when (dayOfWeek) {
        1 -> "한 주의 시작"
        2, 3, 4 -> "주중"
        5 -> "한 주의 끝"
        6, 7 -> "주말"
        else -> throw IllegalArgumentException("잘못된 날 : $dayOfWeek")
    }
    return typeOfDay;
}

fun switchMultiType(number: Int?, char: Char?): String {
    val result = when {
        number in 3..5 -> "숫자"
        char == 'a' -> "문자"
        else -> {
            "모름"
        }
    }
    return result
}

fun main() {
//    println(getTypeOfDayWithSwitchStatement(1));
//    println(getTypeOfDayWithSwitchStatement(2));
//    println(getTypeOfDayWithSwitchStatement(5));
//    println(getTypeOfDayWithSwitchStatement(7));
//    println(getTypeOfDayWithSwitchStatement(8));

    println(switchMultiType(4, null));
    println(switchMultiType(3, 'a'));
    println(switchMultiType(1, 'a'));

}