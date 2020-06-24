public class ElectricGuitar {
    String brand;
    int numOfPickups;
    boolean rockStarUsesIt;

    String getBrand(){
        return brand;
    }

    void setBrand (String aBrand) {
        brand = aBrand;
    }

    int getNumOfPickups (int num) {
        return numOfPickups;
    }

    void setNumofPickups (int num) {
        numOfPickups = num;
    }

    boolean getRockStarUsesIt() {
        return rockStarUsesIt;
    }

    void setRockStarUsesIt (boolean yesOrNo) {
        rockStarUsesIt = yesOrNo;
    }
}