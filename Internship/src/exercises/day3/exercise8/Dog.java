package exercises.day3.exercise8;

public class Dog implements AnimalBehaves {
    @Override
    public String walk() {
        return "dog-walking";
    }

    @Override
    public String talk() {
        return "dog-talking";
    }

    @Override
    public String eat() {
        return "dog-eating";
    }
}
