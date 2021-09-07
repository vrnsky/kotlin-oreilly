package chapter1

fun main(args: Array<String>) {
    var x = 10

    while (x > 1) {
        x = x - 1
        println(if (x < 3) "small $x" else "big $x")
    }
}