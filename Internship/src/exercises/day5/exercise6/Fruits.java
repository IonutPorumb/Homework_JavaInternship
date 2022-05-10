package exercises.day5.exercise6;

public class Fruits implements ShopItem {
    private String name;
    private int price;
    private Category category;

    public Fruits(String name, int price, Category category) {
        this.name = name.trim().toLowerCase();
        this.price = price;
        this.category = category;
    }

    public String name() {
        return name;
    }

    public int price() {
        return price;
    }

    public Category category() {
        return category;
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}
