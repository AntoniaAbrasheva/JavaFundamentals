package finalExams.finalExam04042020_05;

import java.util.Locale;
import java.util.Scanner;

public class activationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        StringBuilder sb = new StringBuilder(scanner.nextLine());

        String text = scanner.nextLine();

        while (!text.equals("Generate")) {
            String[] commandLine = text.split(">>>");

            String command = commandLine[0];

            switch (command) {
                case "Contains":
                    String substring = commandLine[1];

                    if (sb.toString().contains(substring)) {
                        System.out.printf("%s contains %s\n",sb.toString(),substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String typeLetter = commandLine[1];
                    int startIndex = Integer.parseInt(commandLine[2]);
                    int endIndex = Integer.parseInt(commandLine[3]);



                    if (typeLetter.equals("Lower")) {

                        String charSequence = "";
                        for (int i = startIndex; i < endIndex; i++) {
                            char currentSymbol = sb.charAt(i);
                            charSequence += currentSymbol;
                        }
                        charSequence = charSequence.toLowerCase(Locale.ROOT);
                        sb.replace(startIndex,endIndex,charSequence);
                        System.out.println(sb.toString());
                    } else if (typeLetter.equals("Upper")) {
                        String charSequence = "";
                        for (int i = startIndex; i < endIndex; i++) {
                            char currentSymbol = sb.charAt(i);
                            charSequence += currentSymbol;
                        }
                        charSequence = charSequence.toUpperCase(Locale.ROOT);
                        sb.replace(startIndex,endIndex,charSequence);
                        System.out.println(sb.toString());
                    }
                    break;
                case "Slice":
                    int startIn = Integer.parseInt(commandLine[1]);
                    int endIn = Integer.parseInt(commandLine[2]);

                    sb.delete(startIn,endIn);
                    System.out.println(sb.toString());
                    break;
            }




            text = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s",sb.toString());
    }
}
