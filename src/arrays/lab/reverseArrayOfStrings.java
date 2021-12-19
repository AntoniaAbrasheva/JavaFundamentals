package arrays.lab;

import java.util.Scanner;

public class reverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        for (int index = 0; index < input.length/2; index++) {

            String temp = input[index];
            input [index] = input [input.length - 1 - index];
            input [input.length - 1 - index] = temp;

        }
        System.out.println(String.join(" ",input));

    }
}


