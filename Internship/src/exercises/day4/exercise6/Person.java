package exercises.day4.exercise6;

public class Person {
    private String name;
    private int age;
    private String position;

    public Person(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position.trim().toLowerCase();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "The person name is: " + name + "\n" +
                "The person age is: " + age + "\n" +
                "The person positions is: " + position;
    }
}
