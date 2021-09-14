package chapter7

data class Recipe(val title: String, val isVegetarian: Boolean = false, val difficulty: String = "Easy")

fun main(args: Array<String>) {
    val r1 = Recipe("Thai Curry", false)
    val r2 = Recipe("Thai Curry", false)
    val r3 = r1.copy(title = "Chicken Bhuna")
    println("r1 hashcode is ${r1.hashCode()}")
    println("r2 hashcode is ${r2.hashCode()}")
    println("r3 hashcode is ${r3.hashCode()}")
    println("r1 toString is ${r1.toString()}")
    println("r1 == r2 ? ${r1 == r2}")
    println("r1 === r2 ? ${r1 === r2}")
    println("r1 == r3 ? ${r1 == r3}")
    val (title, vegetarian) = r1
    println("title is ${title} and vegetarian is ${vegetarian}")
}