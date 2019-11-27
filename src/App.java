import java.util.HashSet;
import java.util.TreeSet;


public class App {


    public static void main(String[] args) {

        Dog dog1 = new Dog(6, "Fred", "White");
        Dog dog2 = new Dog(1, "Bob", "Black");
        Dog dog3 = new Dog(3, "Richard", "Gold");
        Dog dog4 = new Dog(3, "Bim", "Gold");
        Dog dog5 = new Dog(1, "Bob", "Black");
        Dog dog6 = new Dog(4, "Baxi", "Black");
        Dog dog7 = new Dog(7, "Rex", "Brown");
        Dog dog8 = new Dog(2, "Bobby", "Yellow");
        Dog dog9 = new Dog(2, "Bob", "Grey");
        Dog dog10 = new Dog(1, "Fox", "Black");

        TreeSet<Dog> dogs = new TreeSet<>(new DogAgeComparator());

        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        dogs.add(dog4);
        dogs.add(dog5);
        dogs.add(dog6);
        dogs.add(dog7);
        dogs.add(dog8);
        dogs.add(dog9);
        dogs.add(dog10);

        TreeSet<Dog> dogs2 = new TreeSet<>(new DogNameComparator());

        DogNameComparator dogNameComparator = new DogNameComparator();
        DogAgeComparator dogAgeComparator = new DogAgeComparator();
        TreeSet<Dog> dogs3 = new TreeSet<>(dogNameComparator.thenComparing(dogAgeComparator));


        System.out.println(dogs);
    }
}
