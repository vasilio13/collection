public class Room {
    int number;

    public Room(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Room{" +
                "number=" + number +
                '}';
    }
}
