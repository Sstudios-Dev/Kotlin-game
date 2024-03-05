import kotlin.random.Random

fun main() {
    // List of words
    val words = listOf("house", "dog", "cat", "table", "chair", "car", "bicycle", "book", "pen", "computer")

    // Main menu
    while (true) {
        println("**Welcome to the guessing game!**")
        println("1. Play game")
        println("2. View rules")
        println("3. View words list")
        println("4. Change difficulty")
        println("5. Exit")

        print("Enter your choice: ")
        val choice = readLine()?.toIntOrNull() ?: 0

        when (choice) {
            1 -> playGame(words)
            2 -> viewRules()
            3 -> viewWordsList(words)
            4 -> changeDifficulty()
            5 -> break
            else -> println("Invalid choice.")
        }
    }
}

fun playGame(words: List<String>, difficulty: Int = 1) {
    // Generate a random word
    val randomWord = words[Random.nextInt(words.size)]

    var guessedLetters = ""
    var failedLetters = ""
    var attempts = 0

    // Loop to guess the word
    while (guessedLetters != randomWord) {
        attempts++

        // Show the word with the guessed letters and the failed letters
        println("Word: $guessedLetters${if (failedLetters.isEmpty()) "" else " (" + failedLetters + ")"}")

        // Ask the user to enter a letter
        print("Enter a letter: ")
        val userLetter = readLine()?.firstOrNull() ?: ' '

        // Validate the user input
        if (userLetter !in 'a'..'z') {
            println("The letter must be a lowercase letter.")
            continue
        }

        // Check if the letter has already been entered
        if (userLetter in guessedLetters + failedLetters) {
            println("The letter has already been entered.")
            continue
        }

        // Check if the letter is in the random word
        if (userLetter in randomWord) {
            guessedLetters += userLetter
        } else {
            failedLetters += userLetter
        }
    }

    // Show the result
    println("Congratulations! You guessed the word in $attempts attempts.")
}

fun viewRules() {
    // Display the rules of the game
    println("**Rules of the game:**")
    println("1. The player must guess a word.")
    println("2. The player has a limited number of attempts to guess the word.")
    println("3. The player can only enter lowercase letters.")
    println("4. The player cannot enter a letter that has already been entered.")
    println("5. If the player guesses the word, they win the game.")
    println("6. If the player does not guess the word in the allotted number of attempts, they lose the game.")
}

fun viewWordsList(words: List<String>) {
    // Display the list of words
    println("**List of words:**")
    for (word in words) {
        println(word)
    }
}

fun changeDifficulty() {
    // Display the difficulty levels
    println("**Difficulty levels:**")
    println("1. Easy")
    println("2. Medium")
    println("3. Hard")

    // Ask the user to select a difficulty level
    print("Select a difficulty level: ")
    val difficulty = readLine()?.toIntOrNull() ?: 1

    // Validate the user input
    if (difficulty !in 1..3) {
        println("Invalid difficulty level.")
        return
    }

    // Set the difficulty level
    println("Difficulty level set to $difficulty.")
}
