package basicSyntaxConditionalStatementsAndLoops.exercise;

import java.util.Scanner;

public class strongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int input = n;
        int factorialSum = 0;

        while (n > 0) {
            int number = n % 10;
            int factorial = 1;

            for (int i = 1; i <= number; i++) {
                factorial *= i;

            }
            factorialSum += factorial;
            n /= 10;
        }
        if (factorialSum == input) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }


    }
}


