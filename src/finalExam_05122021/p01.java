package finalExam_05122021;

import java.util.Locale;
import java.util.Scanner;

public class p01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder text = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] commandLine = input.split("\\s+");
            String command = commandLine[0];

            switch (command) {
                case "Translate":
                    String token = commandLine[1];
                    String replacement = commandLine[2];

                    String toString = text.toString();
                     toString = toString.replaceAll(token,replacement);

                     text = new StringBuilder(toString);
                    System.out.println(text.toString());


                    break;
                case "Includes":
                    String substring = commandLine[1];
                    if (text.toString().contains(substring)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Start":
                    String startSubstring = commandLine[1];

                    if (text.toString().startsWith(startSubstring)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Lowercase":
                    String stringText = text.toString();
                    stringText = stringText.toLowerCase(Locale.ROOT);

                    text = new StringBuilder(stringText);
                    System.out.println(text.toString());
                    break;
                case "FindIndex":
                    String symbol = commandLine[1];

                   int lastIndex =  text.lastIndexOf(symbol);
                    System.out.println(lastIndex);
                    break;
                case "Remove":
                    int startIndex = Integer.parseInt(commandLine[1]);
                    int count = Integer.parseInt(commandLine[2]);

                    text.delete(startIndex,count + startIndex);
                    System.out.println(text.toString());
                    break;

            }

            input = scanner.nextLine();
        }
    }
}
