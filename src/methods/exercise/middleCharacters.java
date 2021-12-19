package methods.exercise;

import java.util.Scanner;

public class middleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        printMiddleCharacters(text);
    }

    public static void printMiddleCharacters (String text) {

        if (text.length() % 2 != 0) {
            int indexOfMiddleCharacter = text.length() / 2;

            System.out.println(text.charAt(indexOfMiddleCharacter));
        } else {

            int indexFirstMiddleChar = text.length() / 2 - 1;
            int indexSecondMiddleChar = text.length() / 2;

            System.out.println(text.charAt(indexFirstMiddleChar) + "" +
                    text.charAt(indexSecondMiddleChar));
        }
    }
}


