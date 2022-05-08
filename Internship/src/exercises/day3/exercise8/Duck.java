package exercises.day3.exercise8;

public class Duck implements AnimalBehaves {
    @Override
    public String walk() {
        return "duck-walking";
    }

    @Override
    public String talk() {
        return "duck-talking";
    }

    @Override
    public String eat() {
        return "duck-eating";
    }
}
