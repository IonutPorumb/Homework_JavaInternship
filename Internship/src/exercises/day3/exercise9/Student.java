package exercises.day3.exercise9;

public class Student {
    private final String name;
    private int grade;
    private static int gradeSum;
    private static int numberOfStudents;

    public Student(String name, int grade) {
        this.name = name;
        if (grade < 0 || grade > 10) {
            System.out.println("For the Student " + getName() + " the grade will not be considered." +
                    "The grade must be given between 0 and 10 where 10 is the highest score " +
                    "and 0 is the grade in case the student is absent from the exam!");
        } else {
            this.grade = grade;
            gradeSum += grade;
            numberOfStudents++;
        }
    }

    public String getName() {
        return name;
    }

    public int getgrade() {
        return grade;
    }

    public static int getgradeSum() {
        return gradeSum;
    }

    public static int getNumberOfStudents() {
        return numberOfStudents;
    }

    public static String averageGradeCalculatorForAllStudents() {
        return String.format("%.2f", (double) gradeSum / numberOfStudents);
    }
}
