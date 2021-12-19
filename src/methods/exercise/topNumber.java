package methods.exercise;

import java.util.Scanner;

public class topNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {

            if (isSumDigitsDivisible(i) && holdsOddDigits(i)) {

                System.out.println(i);
            }

        }
    }

    public static boolean isSumDigitsDivisible (int number) {

        int sum = 0;

        while (number > 0) {

            int lastDigit = number % 10;
            sum += lastDigit;
            number = number / 10;
        }

        if (sum % 8 == 0) {

            return true;
        } else {

            return false;
        }
    }

    public static boolean holdsOddDigits(int number) {

        while (number > 0) {

            int lastDigit = number % 10;


            if (lastDigit % 2 != 0) {

                return true;
            }

            number = number / 10;
        }

        return false;
    }
}
