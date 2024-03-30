package basic

fun streamAndLambda() {
    var list: List<Int> = listOf(1, 2, 3, 5, 6)

    // Java List<Integer> collect = list.stream().map(m -> m * 2).collect(Collectors.toList());
    // Kotlin
    // 소괄호 생략 가능, stream(), toList() 등 생략 가능
    list.stream().map({ it -> it * 2 }).toList()
    list.map({ it -> it * 2 }).toList()
    list.map { it -> it * 2 }.toList()
    list.map { it -> it * 2 }

    list.filter { it -> it > 1 }.map { it -> it * 2 }.sorted()
}