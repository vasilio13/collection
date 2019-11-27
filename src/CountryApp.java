import java.util.HashMap;
import java.util.Map;

public class CountryApp {
    public static void main (String [] args){
        HashMap<String,String> countries = new HashMap<String, String>();

        countries.put("Belarus", "9475000");
        countries.put("USA", "328915700");
        countries.put("Geogia", "3729600");
        countries.put("Ukraine", "42568433");
        countries.put("Lithuania", "2790472");
        countries.put("Poland", "38313035");
        countries.put("Latvia", "1929900");
        countries.put("Turkey", "82003882");
        countries.put("Russia", "146780720");
        countries.put("Estonia", "1324820");

        for (Map.Entry entry: countries.entrySet()) {
            System.out.println(entry);// out all records
        }

        System.out.println();

        for (Map.Entry entry: countries.entrySet()) {

            if (Integer.parseInt((entry.getValue()).toString()) > Integer.parseInt("9475000")) {
                System.out.println(entry);// out records >5 mln
            }
        }



    }

}
