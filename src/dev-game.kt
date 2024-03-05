import kotlin.random.Random

// List of questions
val questions = listOf(
  "What is an algorithm?",
  "What is a variable?",
  "What is a function?",
  "What is a loop?",
  "What is a conditional statement?",
  "What is a class?",
  "What is an object?",
  "What is inheritance?",
  "What is polymorphism?",
  "What is an interface?",
)

// Difficulty levels
val difficulties = listOf("Easy", "Medium", "Hard")

// Current difficulty
var currentDifficulty = 0

// Main function
fun main() {
  // Main menu
  while (true) {
    println("**Welcome to the Programming Quiz Game!**")
    println("1. Play")
    println("2. View Rules")
    println("3. Change Difficulty")
    println("4. Exit")

    print("Enter your choice: ")
    val choice = readLine()?.toIntOrNull() ?: 0

    when (choice) {
      1 -> play(questions, currentDifficulty)
      2 -> viewRules()
      3 -> changeDifficulty(difficulties)
      4 -> break
      else -> println("Invalid choice.")
    }
  }
}

// Function to play the game
fun play(questions: List<String>, difficulty: Int) {
  // Generate a random question
  val randomQuestion = questions[Random.nextInt(questions.size)]

  // Display the question
  println("**Question:** $randomQuestion")

  // Answer options
  val answers = listOf("A", "B", "C", "D")

  // Generate shuffled answers
  val shuffledAnswers = answers.shuffled()

  // Display the answer options
  for ((i, answer) in shuffledAnswers.withIndex()) {
    println("$i. $answer")
  }

  // Ask the user to enter an answer
  print("Enter your answer: ")
  val userAnswer = readLine()?.toIntOrNull() ?: -1

  // Validate the user's answer
  if (userAnswer !in 0..3) {
    println("Invalid answer.")
    return
  }

  // Display whether the answer is correct or incorrect
  if (shuffledAnswers[userAnswer] == "A") {
    println("Correct answer!")
  } else {
    println("Incorrect answer. The correct answer was A.")
  }
}

// Function to display the rules
fun viewRules() {
  // Display the game rules
  println("**Game Rules:**")
  println("1. You will be presented with a programming question.")
  println("2. You will be given 4 answer choices.")
  println("3. Choose the correct answer.")
  println("4. If the answer is correct, you earn a point.")
  println("5. If the answer is incorrect, you do not earn any points.")
  println("6. The game ends when you have answered all questions.")
  println("7. The player with the highest score wins the game.")
}

// Function to change the difficulty
fun changeDifficulty(difficulties: List<String>) {
  // Display the difficulty levels
  println("**Difficulty Levels:**")
  for (difficulty in difficulties) {
    println(difficulty)
  }

  // Ask the user to select a difficulty level
  print("Select a difficulty level: ")
  val chosenDifficulty = readLine()?.toIntOrNull() ?: -1

  // Validate the chosen difficulty
  if (chosenDifficulty !in 0..2) {
    println("Invalid difficulty level.")
    return
  }

  // Set the current difficulty
  currentDifficulty = chosenDifficulty

  // Display confirmation message
  println("Difficulty set to ${difficulties[currentDifficulty]}.")
}
