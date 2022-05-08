package exercises.day4.exercise1;

public class Fridge extends Electronics {
    private double temperature;

    public Fridge(double price, String name, String description, int quantity, String type, double length, double width, double height, double weight, double temperature) {
        super(price, name, description, quantity, type, length, width, height, weight);
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "temperature=" + temperature +
                '}';
    }
}
