package com.example.rockppscissors

fun main(){
    // empty strings initialized
    var computerChoice = ""
    var userChoice = ""
    println("Welcome to 1.Rock, 2.Paper, 3.Scissors! Input?")
    userChoice = readln()

    // random number between 0 and 2
    val randomNumber = (1..3).random()

    userChoice = when (userChoice) {
        "1", "rock", "Rock" -> "Rock"
        "2", "paper", "Paper" -> "Paper"
        "3", "scissors", "Scissors" -> "Scissors"
            else -> {
                println("Invalid input")
                return
            }
        }

//    if (randomNumber == 1) {
//        computerChoice = "Rock"
//    } else if (randomNumber == 2) {
//        computerChoice = "Paper"
//    } else if (randomNumber == 3) {
//        computerChoice = "Scissors"
//    }

    when (randomNumber) {
        1 -> computerChoice = "Rock"
        2 -> computerChoice = "Paper"
        3 -> computerChoice = "Scissors"
    }

    if (userChoice == computerChoice) {
        println("It's a tie! You both chose $userChoice.")
    } else if ((userChoice == "Rock" && computerChoice == "Scissors") ||
               (userChoice == "Paper" && computerChoice == "Rock") ||
               (userChoice == "Scissors" && computerChoice == "Paper")) {
        println("You win! Your $userChoice beats CPU's $computerChoice.")
    } else {
        println("You lose! CPU's $computerChoice beats your $userChoice.")
    }
}