package methods.lab;

import java.util.Scanner;

public class signOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        number(Integer.parseInt(scanner.nextLine()));
    }

    public static void number (int number) {

        if (number < 0) {
            System.out.printf("The number %d is negative.",number);
        } else if (number > 0) {
            System.out.printf("The number %d is positive.",number);
        } else if (number == 0) {
            System.out.printf("The number %d is zero.",number);
        }
    }
}


