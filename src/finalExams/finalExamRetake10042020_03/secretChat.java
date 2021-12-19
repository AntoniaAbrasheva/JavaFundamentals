package finalExams.finalExamRetake10042020_03;

import java.util.Scanner;
import java.util.regex.Pattern;

public class secretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        StringBuilder message = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Reveal")) {
            String[] commandLine = input.split("[\\:|:]+");

            String command = commandLine[0];

            switch (command) {
                case "InsertSpace":
                    int index = Integer.parseInt(commandLine[1]);

                    message.insert(index," ");
                    System.out.println(message);
                    break;
                case "Reverse":
                    String substringStr = commandLine[1];

                    if (message.toString().contains(substringStr)) {

                        String sb = new StringBuilder(substringStr).reverse().toString();
                        String newMessage = message.toString()
                                .replaceFirst(Pattern.quote(substringStr),"") + sb;
                        message = new StringBuilder(newMessage);
                        System.out.println(message);

                    } else {
                        System.out.println("error");
                    }

                    break;
                case "ChangeAll":
                    String substring = commandLine[1];
                    String replacement = commandLine[2];

                    if (message.toString().contains(substring)) {

                        String newMessage = message.toString();
                        newMessage = newMessage.replaceAll(substring,replacement);
                        message.replace(0,message.length(),newMessage);
                    }
                    System.out.println(message.toString());

                    break;
            }


            input =scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s",message);
    }
}


