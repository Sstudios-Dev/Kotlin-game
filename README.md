# Guessing Game in Kotlin
This document describes a guessing game implemented in Kotlin.

---

# Functionality:

- Players guess a randomly chosen word from a list.
- Players receive hints by revealing correctly guessed letters.
- Difficulty can be adjusted, affecting the number of attempts allowed.

# Code Breakdown:
`main` function:

- Manages the game loop and menu.
- Offers options to play, view rules, see the word list, change difficulty, and exit.
- Calls other functions based on user choice.

`playGame` function:

- Selects a random word from the provided list.
- Tracks guessed letters, failed attempts, and total tries.
- Presents the word with revealed and hidden letters.
- Asks for user input (letter guess).
- Validates user input (lowercase letter, not previously guessed).
- Updates guessed letters or failed attempts based on the guess.
- Ends the loop when the word is fully guessed.
- Displays congratulations and the number of attempts taken.

`viewRules` function:

- Presents the game rules in an easy-to-understand format.

`viewWordsList` function:

- Prints each word from the list on a separate line.

`changeDifficulty` function:

- Shows available difficulty levels (Easy, Medium, Hard).
- Requests user input for desired difficulty.
- Validates user input (within allowed range).
- Sets the difficulty level if valid, displays an error message otherwise.

**Overall, the code is well-structured, readable, and provides a user-friendly experience for playing the guessing game. It offers additional functionalities to enhance the gameplay.**

# Contributors

<a href="https://github.com/staFF6773"><img src="https://avatars.githubusercontent.com/u/108166164?v=4" height="128" width="128" /></a>
