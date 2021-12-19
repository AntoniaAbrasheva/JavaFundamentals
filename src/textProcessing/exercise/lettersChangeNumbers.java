package textProcessing.exercise;

import java.util.Scanner;

public class lettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] passwords = input.split("\\s+");

        double totalSum = 0;

        for (String password : passwords) {

            double modifiedNumber = getModifiedNumber(password);
            totalSum += modifiedNumber;
        }

        System.out.printf("%.2f", totalSum);

    }

    private static double getModifiedNumber(String password) {

        char firstLetter = password.charAt(0);
        char secondLetter = password.charAt(password.length() - 1);

        StringBuilder builder = new StringBuilder(password);
        double number = Double.parseDouble(builder.deleteCharAt(0).
                deleteCharAt(builder.length() - 1).toString());

        // втори начин
        //double num = Double.parseDouble(password.replace(firstLetter,' ')
        //     .replace(secondLetter,' ').trim());

        // трети начин
        //double n = Double.parseDouble(password.substring(1,password.indexOf(secondLetter)));

        if (Character.isUpperCase(firstLetter)) {
            int positionUpperLetter = (int)(firstLetter - 64);
            number /=  positionUpperLetter;

        } else {
            int positionLowerLetter = (int) firstLetter - 96;
            number *= positionLowerLetter;

        }

        if (Character.isUpperCase(secondLetter)) {
            int positionUpperLetter = (int)(secondLetter - 64);
            number -=  positionUpperLetter;

        } else {
            int positionLowerLetter = (int) secondLetter - 96;
            number += positionLowerLetter;
        }
        return number;
    }
}


