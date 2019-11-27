public class Car implements Comparable<Car>{
    private String model;
    private int price;
    private int power;
    private int topSpeed;

    public Car(String model, int price, int power, int topSpeed) {
        this.model = model;
        this.price = price;
        this.power = power;
        this.topSpeed = topSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    @Override
    public int compareTo (Car car) {
        return this.getPrice() - car.getPrice();
    }

    @Override
    public String toString() {
        return model;

                /*"Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", power=" + power +
                ", topSpeed=" + topSpeed +
                '}';

                 */
    }
}
