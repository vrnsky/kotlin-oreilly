package chapter4

class DrumKit(var hasTopHat: Boolean, var hasSnore: Boolean) {

    fun playTopHat() {
        if (hasTopHat) println("ding ding ba-da-bing!")
    }

    fun playSnore() {
        if(hasSnore) println("bang bang bang!")
    }
}

fun main(args: Array<String>) {
    val d = DrumKit(true, true)
    d.playTopHat()
    d.playSnore()
    d.hasSnore = false
    d.playTopHat()
    d.playSnore()
}