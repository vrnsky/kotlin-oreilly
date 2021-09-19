package chapter8

class Duck (val height: Int? = null) {
    fun quack() {
        println("Quack!")
    }
}

class MyDuck(var myDucks: Array<Duck?>) {
    fun quack() {
        for (duck in myDucks) {
            duck?.let {
                duck.quack()
            }
        }
    }

    fun totalDuckHeight(): Int {
        var h: Int = 0
        for (duck in myDucks) {
            h += duck?.height ?: 0;
        }
        return h
    }
}