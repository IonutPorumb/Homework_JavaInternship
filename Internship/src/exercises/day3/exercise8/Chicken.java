package exercises.day3.exercise8;

public class Chicken implements AnimalBehaves {
    @Override
    public String walk() {
        return "chicken-walking";
    }

    @Override
    public String talk() {
        return "chicken-talking";
    }

    @Override
    public String eat() {
        return "chicken-eating";
    }
}
