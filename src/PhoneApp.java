import java.util.TreeSet;

public class PhoneApp {
    public static void main(String [] args) {

        Phone phone1 = new Phone (100, "iphone");
        Phone phone2 = new Phone (90, "samsung");
        Phone phone3 = new Phone (50, "xiaomi");
        Phone phone4 = new Phone (80, "huawei");
        Phone phone5 = new Phone (60, "zte");

        TreeSet<Phone> phones = new TreeSet<>(new PhonePriceComparator());
        phones.add(phone1);
        phones.add(phone2);
        phones.add(phone3);
        phones.add(phone4);
        phones.add(phone5);

        System.out.println(phones);

    }
}
