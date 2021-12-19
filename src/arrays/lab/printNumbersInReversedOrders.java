package arrays.lab;

import java.util.Scanner;

public class printNumbersInReversedOrders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[n];

        for (int index = 0; index < n; index++) {
            numbers[index] = Integer.parseInt(scanner.nextLine());
        }

        for (int index = numbers.length - 1; index >= 0 ; index--) {
            System.out.print(numbers[index] + " ");

        }
    }
}


