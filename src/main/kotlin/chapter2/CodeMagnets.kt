package chapter2

fun main(args: Array<String>) {
    val fruit = arrayOf("Apple", "Banana", "Cherry", "Blueberry", "Pomegranate")
    val indexes = arrayOf(1, 3, 4, 2)
    var x = 0

    while (x < 4) {
        var y = indexes[x]
        println("Fruit = ${fruit[y]}")
        x = x + 1
    }
}