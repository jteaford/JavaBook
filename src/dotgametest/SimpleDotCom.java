package dotgametest;

public class SimpleDotCom {
    int[] locationCells; // Declare an int array to hold the location cells. Call it locationCells
    int numOfHits = 0; // Declare an int to hold the number of hits. Call it numOfHits and set it to 0
    
    // Declare a setLocationCells() setter method that takes an int array (which has three cell locations as ints (2,3,4,etc.))
    public void setLocationCells (int[] locs) {
        locationCells = locs;
    }

    // Declare a checkYourself() method that takes a String for the user's guess (1, 2, 3, etc.), checks it and returns a result representing a "hit", "miss" or "kill"
    // Method String checkYourself(String userGuess)
    public String checkYourself(String stringGuess) { // Get the user guess as a String parameter
        int guess = Integer.parseInt(stringGuess); // Convert the user guess to an int
        String result = "miss"; // make a variable to hold the result we'll return. Put "miss" in as the default (we assume they will miss)

    // Repeat with each of the location cells in the int array
    for (int cell : locationCells) { // declare a variable that will hold one element from the array
        if (guess == cell) { // compare the user guess to the location cell, if it matches
            result = "hit"; // we got a hit
            numOfHits++; // increment the number of hits
            break; // get out of the loop, no need to test other cells
        } // end IF
    } // end for

    if (numOfHits == locationCells.length) { // Find out if it was the last location cell
            result = "kill"; // If number of hits is 3, return "kill" as the result
    }
    
    System.out.println(result); // Display the result for the user ("miss" unless it was changed to "hit" or "kill")

    return result; // return the result back to the calling method
}
    // End repeat
    // End method

    // Method void setLocationCells(int[] cellLocations)
        // Get the cell locations as an int array parameter
        // Assign the cell locations parameter to the cell locations instance variable
    // End Method
}