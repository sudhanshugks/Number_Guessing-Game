# Number_Guessing-Game
Based On JAVA.
Number Guessing Game
A simple Java console application where players try to guess a randomly generated number within a selected range and difficulty level.

Features
Difficulty Levels:

Easy (1–50)

Medium (1–100)

Hard (1–200)

Random Number Generation:
The game picks a random number within the selected range.

Score Calculation:
Score is based on the number of attempts and the chosen difficulty.

User Feedback:
Indicates if guesses are too high, too low, or correct.

How to Play
Clone the Repository

bash
git clone https://github.com/yourusername/number-guess-game.git
cd number-guess-game
Compile the Program

bash
javac NumberGuessGame.java
Run the Program

bash
java NumberGuessGame
Follow the Prompts

Select a difficulty level.

Enter your guesses until you find the correct number.

View your score at the end.

Example Gameplay
text
🎯 Welcome to the Number Guessing Game!
Choose Difficulty Level: 
1. Easy (1 - 50)
2. Medium (1 - 100)
3. Hard (1 - 200)
Enter your choice (1/2/3): 2

I'm thinking of a number between 1 and 100. Try to guess it!
Enter your guess: 45
🔼 Too low!
Enter your guess: 78
🔽 Too high!
Enter your guess: 62
🎉 Correct! You got it in 3 attempts.
🏆 Your score: 70
Scoring
Difficulty	Range	Multiplier
Easy	1–50	5
Medium	1–100	10
Hard	1–200	15
Score Formula:
Score = max(100 - (attempts × multiplier), 0)

Requirements
Java 8 or higher

File Structure
File	Description
NumberGuessGame.java	Main game logic and entry point
License
This project is licensed under the MIT License.

Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Author
SUAHSNHU KUMAR
