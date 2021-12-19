package finalExams.finalExamRetake15082020_01;

import java.util.Scanner;

public class imitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder message = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Decode")) {
            String[] commandLine = input.split("\\|");
            String command = commandLine[0];

            switch (command) {
                case "Move":
                    int numberOfLetters = Integer.parseInt(commandLine[1]);
                    String substr = message.substring(0,numberOfLetters);
                    message.delete(0,numberOfLetters);
                    message.append(substr);
                    break;

                    case "Insert":
                    int index = Integer.parseInt(commandLine[1]);
                    String value = commandLine[2];

                    message.insert(index,value);

                    break;
                case "ChangeAll":
                    String substring = commandLine[1];
                    String replacement = commandLine[2];

                    String text = message.toString().replace(substring,replacement);
                    message = new StringBuilder(text);
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s",message.toString());
    }
}
