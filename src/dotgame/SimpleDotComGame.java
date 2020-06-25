package dotgame;

public class SimpleDotComGame {
    public static void main(String[] args) {
    // declare an int variable to hold the number of user guess, named numOfGuesses, set it to 0
    int numOfGuesses = 0;

    GameHelper helper = new GameHelper();

    // make a new SimpleDotCom object
    SimpleDotCom theDotCom = new SimpleDotCom();

    // Compute a random number between 0 and 4 that will be the starting location cell position
    int randomNum = (int) (Math.random() * 5); // cast (int) forces the thing after it to become that type, in this case Math.Random returns a double so it lops off the fraction part

    // Make an int array with 3 ints using the randomly-generated number, that number incremented by 1, and that number incremented by 2 (ex. 3, 4, 5)
    // OR make a random number for the first cell and use it to make the cell-locations array
    int[] locations = {randomNum, randomNum+1, randomNum+2};

    // Invoke the setLocationCells() method on the SimpleDotCom object // OR Give the dot com it's locations
    theDotCom.setLocationCells(locations);

    // Declare a boolean variable representing the state of the game, named isAlive. Set it to true.
    boolean isAlive = true;

    while (isAlive == true) { // WHILE the dot com is still alive (isAlive == true)
        String guess = helper.getUserInput("enter a number"); // Get user input from the command line
        String result = theDotCom.checkYourself(guess); // Check the user guess // Invoke the checkYourself() method on the SimpleDotCom object // OR ask the dot com to check the guess, save the returned result in a string
        numOfGuesses++; // Increment numOfGuesses variable // OR increment guess count
        
        // Check for dot com death
        if (result.equals("kill")) { // IF result is "kill"
            isAlive = false; // Set isAlive to false (which means we wont enter the loop again)
            System.out.println("You took " + numOfGuesses + " guesses");// Print the number of user guesses
        } // End IF
    }//End WHILE
    } // End method
}