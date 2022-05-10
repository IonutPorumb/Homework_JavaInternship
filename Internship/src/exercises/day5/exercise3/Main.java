package exercises.day5.exercise3;

import java.util.Optional;

public class Main {
/* 3) Palindrome: a word that reads the same backwards as forwards, e.g. madam or ana

 - in two modes :*/

    // 3.1) recursive string reverse

//    public static Optional<String> reverse(String givenString) {
//        if (givenString == null || givenString.equals("")) {
//            return Optional.ofNullable(givenString);
//        }
//        return Optional.of(reverse(givenString.substring(1)).orElse("") + givenString.charAt(0));
//    }

    public static String reverse(String givenString) {
        if (givenString == null || givenString.equals("")) {
            return givenString;
        }
        return reverse(givenString.substring(1)) + givenString.charAt(0);
    }

    //3.2) recursive check of first and last letter

    public static boolean isPalindrome2(String givenString) {
        if (givenString.equals("") || givenString.length() == 1) {
            return true;
        }
        if (givenString.charAt(givenString.length() - 1) == givenString.charAt(0)) {
            return isPalindrome2(givenString.substring(1, givenString.length() - 1));
        }
        return false;
    }

    public static void main(String[] args) {

        String s = "ana";
        String reversed = reverse(s);
        if (s.equals(reversed)) {
            System.out.printf("The string %s is a palindrome", s);
        } else {
            System.out.printf("The string %s is not a palindrome", s);
        }
        System.out.println();
        System.out.println("====================================================");
        System.out.println(" 3.2) recursive check of first and last letter");
        System.out.printf("The string %s is a palindrome? =>" + isPalindrome2("madam"), "madam");
        System.out.println();
        System.out.printf("The string %s is a palindrome? => " + isPalindrome2("tractor"), "tractor ");


    }
}
