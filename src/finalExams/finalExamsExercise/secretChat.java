package finalExams.finalExamsExercise;

import java.util.Scanner;

public class secretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder message = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Reveal")) {
            String[] commandLine = input.split("\\:\\|\\:");
            String command = commandLine[0];

            switch (command) {
                case "InsertSpace":
                    int index = Integer.parseInt(commandLine[1]);

                    message.insert(index," ");
                    System.out.println(message.toString());
                    break;
                case "Reverse":
                    String substring = commandLine[1];

                    if (message.toString().contains(substring)) {
                        int startIndex = message.indexOf(substring);
                        int endIndex = startIndex + substring.length();

                        message.delete(startIndex,endIndex);
                        StringBuilder sb = new StringBuilder(substring).reverse();
                        message.append(sb);
                        System.out.println(message.toString());

                    } else {
                        System.out.println("error");
                    }

                    break;
                case "ChangeAll":
                    String substr = commandLine[1];
                    String replacement = commandLine[2];

                    String newText = message.toString().replaceAll(substr,replacement);
                    message = new StringBuilder(newText);

                    System.out.println(message.toString());
                    break;
            }


            input = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s",message.toString());
    }
}
