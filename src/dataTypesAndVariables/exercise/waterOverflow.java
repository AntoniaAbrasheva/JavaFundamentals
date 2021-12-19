package dataTypesAndVariables.exercise;

import java.util.Scanner;

public class waterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        int capacity = 255;

        int liters = 0;

        for (int i = 1; i <= n; i++) {

            int litersOfWater = Integer.parseInt(scanner.nextLine());

            liters += litersOfWater;


            if (liters > capacity) {
                System.out.println("Insufficient capacity!");
                liters -= litersOfWater;

            }

        }
        System.out.println(liters);
    }
}


