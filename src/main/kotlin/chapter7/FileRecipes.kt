package chapter7

data class MyRecipe(
    val title: String,
    val mainIngredient: String,
    val isVegetarian: Boolean = false,
    val difficulty: String = "Easy"
)

class Mushroom(val size: Int, val isMagic: Boolean) {
    constructor(isMagic: Boolean) : this(0, isMagic)
}

fun findRecipe(title: String = "",
               ingredient: String = "", isVegetarian: Boolean = false,
               difficulty: String = ""): Array<MyRecipe> {
    return arrayOf(MyRecipe(title, ingredient, isVegetarian, difficulty));
}

fun addNumbers(a: Int, b: Int): Int {
    return a.plus(b)
}

fun addNumbers(a: Double, b: Double): Double {
    return a.plus(b)
}

fun main(args: Array<String>) {
    val r1 = MyRecipe("Thai Curry", "Chicken", false)
    val r2 = MyRecipe(title = "Thai Curry", mainIngredient = "Chicken")
    val r3 = r1.copy(title = "Chicken Bhuna")
    println("r1 hashcode is ${r1.hashCode()}")
    println("r2 hashcode is ${r2.hashCode()}")
    println("r3 hashcode is ${r3.hashCode()}")
    println("r1 toString is ${r1.toString()}")
    println("r1 == r2 ? ${r1 == r2}")
    println("r1 === r2 ? ${r1 === r2}")
    println("r1 == r3 ? ${r1 == r3}")
    val (title, mainIngredient, vegetarian, difficulty) = r1
    println("title is ${title} and vegetarian is ${vegetarian}")

    val m1 = Mushroom(6, false)
    println("m1 size is ${m1.size} and isMagis ${m1.isMagic}")
    val m2 = Mushroom(true)
    println("m1 size is ${m2.size} and isMagis ${m2.isMagic}")

    println(addNumbers(1, 1))
    println(addNumbers(1.35, 1.25))
}