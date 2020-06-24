package guess;

public class GuessGame { // GuessGame has three instance variables for three Player objects
    Player p1;
    Player p2;
    Player p3;

    public void startGame() { // Create three Player objects and assign them to three Player instance variables
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0; // Declare three variables to hold the three guesses the Players make
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10); // make a 'target' number that the players have to guess, random number generator
        System.out.println("I'm thinking of a number between 0 and 9..."); 

        while (true) { 
            System.out.println("Number to guess is " + targetNumber);

            p1.guess(); // call each Player's guess method
            p2.guess();
            p3.guess();

            // Get each player's guess (the result of their guess() method running) by accessing the number variable of each player
            guessp1 = p1.number;
            System.out.println("Player one guessed " + guessp1);

            guessp2 = p2.number;
            System.out.println("Player two guessed " + guessp2);

            guessp3 = p3.number;
            System.out.println("Player three guessed " + guessp3);

            if (guessp1 == targetNumber) { // Check each player's guess to see if it matches the target number. If a player is right, then set that player's variable to be true (remember, we set it false by default)
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }
            if (p1isRight || p2isRight || p3isRight) { // if player one OR player two OR player three is right...(the || operator means OR)
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + p1isRight);
                System.out.println("Player two got it right? " + p2isRight);
                System.out.println("Player three got it right? " + p3isRight);
                System.out.println("Game is over.");
                break;
            } else { // Otherwise stay in the loop and ask the players for another guess
                System.out.println("Players will have to try again.");
            }
        }
    }
}