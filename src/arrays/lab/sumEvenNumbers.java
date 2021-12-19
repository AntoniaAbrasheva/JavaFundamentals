package arrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class sumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();
        int sum = 0;

        for (int number : array) {

            if (number % 2 == 0) {
                sum += number;
            }

        }



        System.out.printf("%d",sum);
    }
}

