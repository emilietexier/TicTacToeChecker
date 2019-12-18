# TicTacToeChecker

This is an assignment done as part of the Technical recruitment process at R3.

I was given a challenge: write a game verifier for noughts and crosses.

## Prerequisites

```
Java 1.8 version
```

## Usage

1. Download the repository
2. Using the command line, go to the test folder of the repository
3. Execute 
```
javac Test.java
```
4. Execute 
```
java Test
``` 


## Overview

### Noughts and Crosses

This is a two-player game where the players take turns marking the spaces in a 3-by-3 grid with X's and O's.
The player who succeeds in placing three of their marks (either X's or O's) in a horizontal, vertical, or diagonal row wins the game. 
My tasks were as followed :
1. Write a class whose constructor takes in a representation of a 3-by-3 grid with the currently placed marks.
2. Add a function to this class that checks the states of the grid and returns which player has won or if the outcome of the game is yet to be decided. 
3. Document how to build run the code. 

### Code structure

For this assignment, I chose to create a class Grid.java which would be defined by the grid of the game. The grid is directly passed as a parameter in the constructor in order to instanciate the class. 
This class also contains the function which determines which player has won the game or if he outcome of the game is yet to be decided.
I have also implemented a test class which allows us to run the code with randomly generated grids.

### Data structure

In this assignment, I chose to represent the grid by a 2 dimension array of characters. Indeed, I believe this is the easiest way to manipulate the data and represent the game. The spaces of the array can either be a 'X', a 'O' or a blank. A 'X' means that player X marked the space, a 'O' means that player O marked the space and a blank means that the space has not been marked yet. This data structure will allow us to compare the different characters and therefore notice when three 'X' or 'O' are aligned.  

### Checker function

This function, given a grid, will return a character indicating which player won the game or if the outcome of the game is yet to be determined. Therefore, the function will return:
1. 'X' if player X won the game.
2. 'O' if player O won the game.
3. '?' if the outcome of the game is yet to be determined.

The main goal of the function is to determine wether or not we can find a succession of three 'X's or 'O's in the grid which would indicate that we have a winner to the game.
For this, I have started by implementing a checker for the lines and the columns. This is done using two nested for loops iterating on every element of the grid. 
We are looking for a line or a column where all elements are the same. Therefore, the function always verifies that the element being checked is equal to the first element of the same line or of the same column. If this is the case for all elements of the line or of the column, and these elements are all 'X's or 'O's (we need to eliminate the case where all elements would be blanks), then we have a win and we can return the corresponding character. 
Otherwise, if we haven't found anything interesting with lines and columns, the function will also check the two diagonals. I have made the choice of using a simple if statement in this case rather than a for loop to make the code more readable. Again, if all elements of a diagonal are 'X's or 'O's, we will return the corresponding character.
Finally, if we haven't returned anything yet, it means that there are no three 'X's or 'O's aligned in this grid and therefore the outcome of the game is yet to be determined. In this case, we simply return '?'.

## Test class


The test class allows us to test the checker function with all possible cases. Indeed, I have implemented a random array of characters generator which generates a two dimension array of 'X's, 'O's and blank spaces. The probabilities of obtaining an 'X', a 'O' or a blank are equals.
When the test is running, the generated array is also printed in the console as well as the result given by the checker function.
For the array generator, I used the Java Random class and generated a random integer between 0 and 2. 
Obtaining a zero would mean filling the space with an 'X', obtaining a 1 with a 'O' and obtaining a 2 with a blank. 
Once the array is filled, I declare a grid instance from the Grid class using the generated array. Finally, the checker function is called on this grid.
There is no operation to be done on the user's end because when the test runs, it automatically generates a grid, checks it with the checker function and prints both the grid and the result obtained through the checker function. 

 
