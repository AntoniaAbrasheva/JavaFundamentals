package finalExams.finalExams04122021;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder text = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            String[] commandLine = input.split(" ");
            String command = commandLine[0];

            switch (command) {
                case "TakeOdd":
                    StringBuilder rawPassword = new StringBuilder();
                    for (int i = 0; i < text.length(); i++) {
                        char symbol = text.charAt(i);
                        if (i % 2 != 0) {
                            rawPassword.append(symbol);
                        }

                    }
                    text = new StringBuilder(rawPassword);
                    System.out.println(text.toString());
                    break;
                case "Cut":
                    int index = Integer.parseInt(commandLine[1]);
                    int length = Integer.parseInt(commandLine[2]);

                    text.delete(index,index + length);
                    System.out.println(text.toString());
                    break;
                case "Substitute":
                    String substring = commandLine[1];
                    String substitute = commandLine[2];

                    if (text.toString().contains(substring)) {
                        String newText = text.toString().replaceAll(substring,substitute);
                        text = new StringBuilder(newText);

                        System.out.println(text.toString());
                    } else {
                        System.out.println("Nothing to replace!");
                    }

                    break;
            }

            input = scanner.nextLine();
        }
        System.out.printf("Your password is: %s",text.toString());
    }
}
