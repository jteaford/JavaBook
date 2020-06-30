package dotgame;

import java.util.*;

public class DotComBust {
    // 1. the main method in the DotComBust class instantiates the DotComBust object that does all the game play stuff

        // 2. The DotComBust object instantiates an instance of GameHelper, the object that will help the game do its work
        private GameHelper helper = new GameHelper();

        // 3. The DotComBust opject instantiates an ArrayList that will hold the three DotCom objects
        private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();

        // Declare an int variable to hold the number of user guesses (so that we can give the user a score at the end of the game)
        private int numOfGuesses = 0;

        // Declare a setUpGame() method to create and initialize the DotCom objects with names and locations. Display brief instractions to the user.
        // METHOD void setUpGame()
        private void setUpGame() {
            // create three DotCom objects
            DotCom one = new DotCom();
            // Set a name for each DotCom
            one.setName("Pets.com");

            DotCom two = new DotCom();
            two.setName("eToys.com");

            DotCom three = new DotCom();
            three.setName("Go2.com");

            // Add the DotComs to the dotComsList (the Array List)
            dotComsList.add(one);
            dotComsList.add(two);
            dotComsList.add(three);

            System.out.println("Your goal is to sink three dot coms.");
            System.out.println("Pets.com, eToys.com, Go2.com");
            System.out.println("Try to sink them all in the fewest number of guesses.");

            // Repeat with each of the dotCom objects in the dotComsList array
            for (DotCom dotComToSet : dotComsList) {
                // Call the placeDotCom() method on the helper object, to get a randomly-selected location for this DotCom (three cells, vertically or horizontally aligned, on a 7x7 grid)
                ArrayList<String> newLocation = helper.placeDotCom(3);
                // Set the location for each DotCom based on the result of the placeDotCom() call
                dotComToSet.setLocationCells(newLocation);
            } // End repeat
        } // End METHOD

        // Declare a startPlaying() method that asks the player for guesses and calls the checkUserGuess() method until all the DotCom objects are removed from play.
        // METHOD void startPlaying()
        private void startPlaying() {
            // Repeat while any DotComs exist
            while (!dotComsList.isEmpty()){
                // Get user input by calling the helper getUserInput() method
                String userGuess = helper.getUserInput("Enter a guess");
                // Evaluate the user's guess by checkUserGuess() method
                checkUserGuess(userGuess); 
            } // End Repeat
            finishGame();
        } // End METHOD

        // Declare a checkUserGuess() method that loops through all remaining DotCom objects and calls each DotCom object's checkYourself() method.
        // METHOD vod checkUserGuess(String userGuess)
        private void checkUserGuess(String userGuess) {
            // find out if there's a hit (and kill) on any DotCom
            // Increment the number of user guesses in the numOfGuesses variable
            numOfGuesses++;

            // Set the local result varable (a String) to "miss", assuming that the user's guess will be a miss
            String result = "miss";

            // Repeat with each of the DotObjects in the dotComsList array
            for (DotCom dotComToTest : dotComsList) {
                // Evaluate the user's guess by calling the DotCom object's checkYourself() method
                result = dotComToTest.checkYourself(userGuess);

                // Set the result variable to "hit" or "kill" if appropriate
                if (result.equals("hit")) {
                    break;
                }
                // If the result is a "kill", remove the DotCom from the dotComsList
                if (result.equals("kill")) {
                    dotComsList.remove(dotComToTest);
                    break;
                }

            }// End Repeat
        // Display the result value to the user
        System.out.println(result);

        }// End METHOD

        // Declare a finishGame() method that prints a message about the user's performance, based on how many guesses it took to sink all of the DotCom objects.
        // METHOD void finishGame()
        private void finishGame() {
            // Display a generic "game over" message, then:
            System.out.println("All Dot Coms are dead! Your stock is now worthless.");

                // IF number of user guesses is small,
                if (numOfGuesses <= 18) {
                    // Display a congratulations message
                    System.out.println("It only took you " + numOfGuesses + " guesses.");
                    System.out.println("You got out before your options sank.");
                } // ELSE
                else {
                    // Display an insulting one
                    System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
                    System.out.println("Fish are dancing with your options.");
                }// End IF
        }// End METHOD

        
        public static void main(String[] args) {

            // Create the game object
            DotComBust game = new DotComBust();
            // Tell the game object to set up the game
            game.setUpGame();
            // Tell the game object to start the main game play loop
            game.startPlaying();
    }
    // get out of main


}