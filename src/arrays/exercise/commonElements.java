package arrays.exercise;

import java.util.Scanner;

public class commonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] firstArray = scanner.nextLine().split(" ");
        String [] secondArray = scanner.nextLine().split(" ");

        for (String secondEl: secondArray) {
            for (String firstEl : firstArray) {

                if (firstEl.equals(secondEl)) {
                    System.out.print (secondEl + " ");
                }

            }

        }



    }
}
