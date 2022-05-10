package exercises.day5.exercise5;

public class Main {

    public static int fibonacciValueOfNThElement(int elementIndex) {
        if (elementIndex == 0) {
            return 0;
        }
        if (elementIndex == 1) {
            return 1;
        }
        return fibonacciValueOfNThElement(elementIndex - 1) + fibonacciValueOfNThElement(elementIndex - 2);
    }

    public static void main(String[] args) {

        System.out.printf("The fibonacci's value of the element %s -th is: " + fibonacciValueOfNThElement(9), 9);

    }
}
