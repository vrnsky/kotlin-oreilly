package chapter6

class CoffeeMaker: Appliance() {
    override val color = ""
    var coffeeLeft = true

    override fun consumePower() {
        println("Consuming power")
    }

    fun fillWithWater() {
        println("Fill with water")
    }

    fun makeCoffee() {
        println("Make the coffee")
    }
}