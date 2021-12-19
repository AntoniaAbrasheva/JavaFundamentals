package dataTypesAndVariables.exercise;

import java.util.Scanner;

public class printPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int char1 = Integer.parseInt(scanner.nextLine());
        int char2 = Integer.parseInt(scanner.nextLine());




        for (int i = char1; i <= char2; i++) {

            System.out.print((char)i + " ");


        }


    }
}


