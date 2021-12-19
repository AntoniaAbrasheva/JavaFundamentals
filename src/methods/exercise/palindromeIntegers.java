package methods.exercise;

import java.util.Scanner;

public class palindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();

        while (!number.equals("END")) {

            if (!isPalindrome(number)) {

                System.out.println("false");
            } else {

                System.out.println("true");
            }

            number = scanner.nextLine();
        }
    }

    public static boolean isPalindrome(String number) {

        String reversedNumber = "";


        for (int index = number.length() - 1; index >= 0; index--) {

            reversedNumber += number.charAt(index);

        }
        return number.equals(reversedNumber);
    }

}

