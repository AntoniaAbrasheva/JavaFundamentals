package finalExams.finalExam04042020_04;

import java.util.Scanner;

public class passwordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            String[] commandLine = input.split(" ");

            String command = commandLine[0];

            switch (command) {
                case "TakeOdd":

                    StringBuilder newPassword = new StringBuilder();

                    for (int i = 0; i < sb.length(); i++) {

                        if (i % 2 != 0) {
                            char currentSymbol = sb.charAt(i);
                            newPassword.append(currentSymbol);
                        }
                    }
                    System.out.println(newPassword.toString());
                    sb.delete(0,sb.length());
                    sb.append(newPassword);
                    break;
                case "Cut":
                    int index = Integer.parseInt(commandLine[1]);
                    int length = Integer.parseInt(commandLine[2]);

                    sb.delete(index,index + length);

                    System.out.println(sb.toString());
                    break;
                case "Substitute":
                    String substring = commandLine[1];
                    String substitute = commandLine[2];

                    if (sb.toString().contains(substring)) {
                        String newString = sb.toString().replace(substring,substitute);

                        System.out.println(newString);
                        sb.delete(0,sb.length());
                        sb.append(newString);


                    }else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.printf("Your password is: %s",sb.toString());
    }
}
