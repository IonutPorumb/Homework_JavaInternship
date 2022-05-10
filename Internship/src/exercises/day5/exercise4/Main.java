package exercises.day5.exercise4;

public class Main {

    public static int sumOfDigit(int givenNumber) {
        if (givenNumber % 10 == 0) {
            return givenNumber;
        }
        return sumOfDigit((int) givenNumber / 10) + givenNumber % 10;
    }

    public static void main(String[] args) {
        int givenNumber = 123432;
        System.out.printf("The sum of digits for the number %s is : " + sumOfDigit(givenNumber), givenNumber);

    }
}
