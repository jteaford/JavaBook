public class BeerSong {
    public static void main(String[] args) {
        //Set the number of beers, call it beerNum and assign value of 99
        int beerNum = 99;
        String word = "bottles";

        while (beerNum > 0) {

            if (beerNum == 1) {
                word = "bottle"; //will print singular bottle when number of beers is 1
            }

            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            beerNum = beerNum - 1;

            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + " of beer on the wall.");
            } else {
                System.out.println("No more bottles of beer on the wall.");
            }
            
        }

    }
}