package exercises.day4.exercise4;


import java.util.*;

public class Basket {
    private List<String> fruits = new ArrayList<>();

    public Basket(List<String> fruits) {
        for (String f : fruits) {
            this.fruits.add(f.trim().toLowerCase());
        }
    }

    public boolean find(String fruit) {
        return fruits.contains(fruit.trim().toLowerCase());
    }

    public boolean remove(String fruit) {
        return fruits.remove(fruit.trim().toLowerCase());
    }

    public int position(String fruit) {
        return fruits.indexOf(fruit.trim().toLowerCase());
    }

    public Collection<String> distinct() {
        Set<String> result = new HashSet<>();
        try {
            result.addAll(fruits);
        } catch (NullPointerException e) {
            System.out.println("The fruit basket is empty.");
        }
        return result;
    }

    public void add(String fruit) {
        fruits.add(fruit.trim().toLowerCase());
    }

    public int count() {
        return fruits.size();
    }

    public int customCount() {
        int counterResult = 0;
        for (String s : fruits) {
            counterResult++;
        }
        return counterResult;
    }


}
