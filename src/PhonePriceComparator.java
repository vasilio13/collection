import java.util.Comparator;

public class PhonePriceComparator implements Comparator<Phone> {
    @Override
    public int compare (Phone phone1, Phone phone2) {return phone1.getPrice()-phone2.getPrice();}

}
