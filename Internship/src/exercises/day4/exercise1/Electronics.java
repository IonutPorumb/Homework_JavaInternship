package exercises.day4.exercise1;

public class Electronics extends Product {
    private String type;
    private double length;
    private double width;
    private double height;
    private double weight;

    public Electronics(double price, String name, String description, int quantity, String type, double length, double width, double height, double weight) {
        super(price, name, description, quantity);
        this.type = type;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "type='" + type + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
