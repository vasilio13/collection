import java.util.HashSet;
import java.util.TreeSet;


public class App {


    public static void main(String[] args) {

        Dog dog1 = new Dog(6, "Fred", "White");
        Dog dog2 = new Dog(1, "Bob", "Black");
        Dog dog3 = new Dog(4, "Richard", "Gold");
        Dog dog4 = new Dog(3, "Bim", "Gold");

        Dog dog5 = new Dog(1, "Bob", "Black");

        TreeSet<Dog> dogs = new TreeSet<>();

        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        dogs.add(dog4);
        dogs.add(dog5);

        System.out.println(dogs);
    }
}
