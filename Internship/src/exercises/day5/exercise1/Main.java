package exercises.day5.exercise1;

public class Main {
    //    1) sum of first n integer numbers
    public static int sumOfFirstNNumbers(int n) {
        if (n > 0) {
            return n + sumOfFirstNNumbers(n - 1);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("The sum of first 5 integer numbers is: " + sumOfFirstNNumbers(5));

    }
}
