package dog;

public class Dog {
    String name;
    int size;
    public static void main(String[] args) {
        System.out.println("");

        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart";

        Dog[] myDogs = new Dog[3];

        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        myDogs[0].name = "Fred";
        myDogs[1].name = "Margie";

        myDogs[0].size = 70;
        myDogs[1].size = 8;
        myDogs[2].size = 35;

        int x = 0;
        while (x < myDogs.length){
            myDogs[x].bark();
            x = x + 1;
        }
    }
    public void bark() {
        if (size > 60) {
            System.out.println("Woof Woof");
        } else if (size > 14) {
            System.out.println("Ruff Ruff");
        } else {
            System.out.println("Yip Yip");
        }
    }
    public void eat(){ }
    public void chaseCat() { }
}