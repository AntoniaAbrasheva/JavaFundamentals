package dataTypesAndVariables.exercise;

import java.util.Scanner;

public class pokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());


        int count = 0;
        int firstPower = power;
        int exhausted = 0;

        while (power >= distance) {

            power -= distance;
            count++;

            if (power == firstPower * 0.5 && exhaustionFactor != 0) {
                power /=  exhaustionFactor;

            }


        }
        System.out.println(power);
        System.out.println(count);
    }
}


