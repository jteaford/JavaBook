public class PoolPuzzleOne {
    public static void main(String[] args) {
        int x = 0;

        while ( x < 4 ){
            System.out.print("a"); // Print out "a" because x = 0 which is less than 4 // Print out "a", x = 1 // Print "a", x = 2
            if ( x < 1 ) { 
                System.out.print(" "); // x is still 0 so print out a space // Don't print space x = 1 // No space x = 2
            } System.out.print("n"); // Print out "n" because x = 0 and that is still less than 4 // Print "n" bc (x = 1) < 4 // Print "n"
            if ( x > 1 ) { // skip this bc x = 0 // Skip bc x = 1 // Print " oyster" because x = 2
                System.out.print(" oyster");
                x = x + 2; // x = 4, ending the loop
            }
            if ( x == 1 ) { // skip this because x = 0 // x = 1, so print noys
                System.out.print("noys");
            }
            if ( x < 1 ) { // print "oise" because 0 < 1 // skip because x = 1
                System.out.print("oise"); 
            }
            System.out.println(""); // print a new line // print a new line
            x = x + 1; // x = 1 // x = 2
        }
    }
}