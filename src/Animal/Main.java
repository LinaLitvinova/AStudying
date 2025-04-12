package Animal;

public class Main {
    public static void main(String [] args) {
        Cat cat = new Cat();
        System.out.println("The animal is a cat:");
        cat.fur();
        cat.spine();
        Whale whale = new Whale();
        System.out.println("The animal is a whale:");
        whale.water();
        whale.spine();
        Fish fish = new Fish();
        System.out.println("The animal is a fish:");
        fish.water();
        Bear bear = new Bear();
        System.out.println("The animal is a bear");
        bear.fur();
        bear.spine();
    }
}
