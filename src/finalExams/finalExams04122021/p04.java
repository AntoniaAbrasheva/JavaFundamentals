package finalExams.finalExams04122021;

import java.util.Locale;
import java.util.Scanner;

public class p04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder text = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Generate")) {
            String[] commandLine = input.split(">>>");
            String command = commandLine[0];

            switch (command) {
                case "Contains":
                    String substring = commandLine[1];
                    if (text.toString().contains(substring)) {
                        System.out.printf("%s contains %s.\n",text.toString(),substring);
                    } else  {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String typeOfLetter = commandLine[1];
                    int startIndex = Integer.parseInt(commandLine[2]);
                    int endIndex = Integer.parseInt(commandLine[3]);

                    if (typeOfLetter.equals("Upper")) {
                        String string = "";

                        for (int i = startIndex; i < endIndex; i++) {
                            char currentSymbol = text.charAt(i);
                            string += currentSymbol;
                        }
                        string = string.toUpperCase(Locale.ROOT);
                        text.replace(startIndex,endIndex,string);
                        System.out.println(text.toString());


                    } else if (typeOfLetter.equals("Lower")) {

                        String str = "";

                        for (int i = startIndex; i < endIndex; i++) {
                            char symbol = text.charAt(i);
                            str += symbol;

                        }
                        str = str.toLowerCase(Locale.ROOT);
                        text.replace(startIndex,endIndex,str);
                        System.out.println(text.toString());

                    }
                    break;
                case "Slice":
                    int startIn = Integer.parseInt(commandLine[1]);
                    int endIn = Integer.parseInt(commandLine[2]);

                    text.delete(startIn,endIn);
                    System.out.println(text.toString());
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s",text.toString());
    }
}
