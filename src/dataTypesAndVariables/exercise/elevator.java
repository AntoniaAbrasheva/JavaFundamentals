package dataTypesAndVariables.exercise;

import java.util.Scanner;

public class elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numPeople = Integer.parseInt(scanner.nextLine());
        int capacityOfElevator = Integer.parseInt(scanner.nextLine());

        double numOfFullCourse = Math.ceil (1.0 * numPeople / capacityOfElevator);


        System.out.printf("%.0f",numOfFullCourse);




    }
}


