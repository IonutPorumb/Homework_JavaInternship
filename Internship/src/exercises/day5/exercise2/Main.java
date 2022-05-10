package exercises.day5.exercise2;

public class Main {
    //    2) sum of first n EVEN integers
    public static int sumOfEvenNumbers(int n) {

        if (n > 0) {
            return n + sumOfEvenNumbers(n - 2);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("The sum of first 6 integer even numbers is: " + sumOfEvenNumbers(6));

    }

}
