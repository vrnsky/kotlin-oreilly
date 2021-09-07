package chapter1

fun main(args: Array<String>) {
    var x = 50
    while (x > 20) {
        x = x - 1;
        println("x is $x.")
    }

    for (i in 1..10) {
        x = x + 1
        println("x is $x.")
    }
}