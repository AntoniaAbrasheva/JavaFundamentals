package finalExams.finalExamRetake15082020_01;

import java.util.Scanner;

public class theImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        String command = scanner.nextLine();

        StringBuilder sb = new StringBuilder(message);

        int count = 0;

        while (!command.equals("Decode")) {
            String[] commandLine = command.split("\\|");
            String instruction = commandLine[0];


            switch (instruction) {
                case "Move":
                    int lettersNum = Integer.parseInt(commandLine[1]);
                    for (int i = 0; i < sb.length(); i++) {
                        count++;

                        if (count > lettersNum) {
                            break;
                        }
                        char currentSymbol = sb.charAt(i);
                        sb.deleteCharAt(i);
                        sb.append(currentSymbol);

                        i = -1;
                    }

                    break;
                case "Insert":
                    int index = Integer.parseInt(commandLine[1]);
                    String value = commandLine[2];

                    sb.insert(index, value);
                    break;
                case "ChangeAll":
                    char[] substring = commandLine[1].toCharArray();
                    String replacement = commandLine[2];


                    for (int i = 0; i < sb.length(); i++) {
                        char currentSymbol = sb.charAt(i);

                        if (substring[0] == currentSymbol) {

                            sb.replace(i, i, replacement);
                            sb.deleteCharAt(i + 1);
                        }

                    }

                    break;
            }


            command = scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s",sb);
    }



}



