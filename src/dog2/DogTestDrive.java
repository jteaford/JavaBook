package dog2;

public class DogTestDrive {
    public static void main(String[] args) {
        System.out.println("");
        GoodDog one = new GoodDog();
        one.setSize(70);
        
        GoodDog two = new GoodDog();
        two.setSize(8);
        
        GoodDog three = new GoodDog();
        three.setSize(17);
        
        System.out.println("Dog one: " + one.getSize());
        System.out.println("Dog two: " + two.getSize());
        one.bark();
        two.bark();

        System.out.println("");
    }
}