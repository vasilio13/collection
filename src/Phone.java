import java.util.Objects;

public class Phone {

    private int price;
    private String model;

    public Phone(int price, String model){
        this.price = price;
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, model);
    }

    @Override
    public String toString() {
        return price + "-" + model;
    }
}
