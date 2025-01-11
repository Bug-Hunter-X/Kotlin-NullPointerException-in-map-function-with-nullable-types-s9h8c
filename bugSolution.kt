fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }
    println(result) // Output: [2, 4, 6, 8, 10]

    val list2 = listOf<Int?>(1, 2, null, 4, 5)
    // Using let
    val result2 = list2.map { it?.let { it * 2 } }
    println(result2) // Output: [2, 4, null, 8, 10]

    // Using mapNotNull to exclude nulls
    val result3 = list2.mapNotNull { it?.times(2) }
    println(result3) // Output: [2, 4, 8, 10]
} 