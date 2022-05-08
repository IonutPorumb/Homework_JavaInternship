package exercises.day3.exercise8;

public class Mouse implements AnimalBehaves {
    @Override
    public String walk() {
        return "mouse-walking";
    }

    @Override
    public String talk() {
        return "mouse-talking";
    }

    @Override
    public String eat() {
        return "mouse-eating";
    }
}
