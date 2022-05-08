package exercises.day4.exercise1;

public class Cosmetics extends Product {
    private Colors color;
    private double weight;

    public Cosmetics(double price, String name, String description, int quantity, Colors color, double weight) {
        super(price, name, description, quantity);
        this.color = color;
        this.weight = weight;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cosmetics{" +
                "color=" + color +
                ", weight=" + weight +
                '}';
    }
}
