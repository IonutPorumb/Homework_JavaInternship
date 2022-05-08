package exercises.day3.exercise8;

public class Cat implements AnimalBehaves {

    @Override
    public String walk() {
        return "cat-walking";
    }

    @Override
    public String talk() {
        return "cat-talking";
    }

    @Override
    public String eat() {
        return "cat-eating";
    }
}
