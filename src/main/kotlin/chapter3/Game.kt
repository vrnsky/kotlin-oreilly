package chapter3

fun main(args: Array<String>) {
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
    printResult(gameChoice, userChoice)
}

fun getGameChoice(options: Array<String>): String {
    return options[(Math.random() * options.size).toInt()]
}

fun getUserChoice(options: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""
    while (!isValidChoice) {
        print("Please enter one of the following")
        for (item in options) print(" $item")
        println(".")
        val userInput = readLine()

        if (userInput != null && userInput in options) {
            isValidChoice = true
            userChoice = userInput
        }

        if (!isValidChoice) {
            println("You must enter a valid choice.")
        }
    }
    return userChoice
}

fun printResult(gameChoice: String, userChoice: String) {
    val result: String

    if (userChoice == gameChoice) result = "Tie!"
    else if ((userChoice == "Rock" && gameChoice == "Scissors")
        || (userChoice == "Paper" && gameChoice == "Rock")
        || (userChoice == "Scissors" && gameChoice == "Paper")) result = "You win!"
    else result = "You lose!"

    println("You chose $userChoice. I chose $gameChoice. $result")
}