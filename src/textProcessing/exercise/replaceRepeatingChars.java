package textProcessing.exercise;

import java.util.Scanner;

public class replaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder builder = new StringBuilder();

        char previousChar = text.charAt(0);
        builder.append(previousChar);

        for (int i = 1; i < text.length(); i++) {

            char currentSymbol = text.charAt(i);

            if (currentSymbol != previousChar) {
                builder.append(currentSymbol);
                previousChar = currentSymbol;
            }

        }

        System.out.println(builder);

    }
}


