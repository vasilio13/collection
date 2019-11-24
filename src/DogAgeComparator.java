
import java.util.Comparator;

public class DogAgeComparator {
    @Override
    public int compare(Dog dog1, Dog dog2) {
        return dog1.getAge() - dog2.getAge();
    }
}
