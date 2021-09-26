package chapter12


data class Grocery(
    val name: String, val category: String,
    val unit: String, val unitPrice: Double, val quantity: Int
)

fun main(args: Array<String>) {
    val groceries = listOf(
        Grocery("Tomatoes", "Vegetables", "lb", 3.0, 3),
        Grocery("Mushrooms", "Vegetables", "lb", 4.0, 1),
        Grocery("Bagels", "Bakery", "Pack", 1.5, 2),
        Grocery("Olive oil", "Pantry", "Bottle", 6.0, 1),
        Grocery("Ice cream", "Frozen", "Pack", 3.0, 2)
    )

    val highestPrice = groceries.maxByOrNull { it.unitPrice * 5 }
    println("The highest price is $highestPrice")
    val lowestQuantity = groceries.minByOrNull { it.quantity }
    println("The lowest quantity is $lowestQuantity")


    val sumQuantity = groceries.sumBy { it.quantity }
    println("sumQuantity: $sumQuantity")

    val totalPrice = groceries.sumByDouble { it.unitPrice * it.quantity }
    println("totalPrice: $totalPrice")

    val vegetables = groceries.filter { it.category == "Vegetables" }
    println("vegetables: $vegetables")

    val notFrozen = groceries.filterNot { it.category == "Frozen" }
    println("notFrozen: $notFrozen")

    val groceryNames = groceries.map { it.name }
    println("groceryNames: $groceryNames")
    val halfPrice = groceries.map { it.unitPrice * 0.5 }
    println("halfPrice: $halfPrice")

    val newPrices = groceries.filter { it.unitPrice > 3.0 }
        .map { it.unitPrice * 2 }
    println("newPrices: $newPrices")

    println("Grocery names")
    groceries.forEach { println(it.name) }

    println("Grocery with unitPrice > 3.0")
    groceries.filter { it.unitPrice > 3.0 }
        .forEach { println(it.name) }

    var itemNames = ""
    groceries.forEach { itemNames += it.name + " "}
    println("itemNames: $itemNames")

    groceries.groupBy { it.category }
        .forEach {
            println(it.key)
            it.value.forEach {
                println("   " + it.name)
            }
        }

    val ints = listOf(1, 2, 3)
    val sumOfInts = ints.fold(1) {runningProduct, item -> runningProduct * item}
    println(sumOfInts)

    val grocNames = groceries.fold("") {string, item -> string + " ${item.name}"}
    println(grocNames)

    val changeFrom50 = groceries.fold(50.0) {change, item -> change - item.quantity * item.unitPrice}
    println("changeFrom50: $changeFrom50")

}