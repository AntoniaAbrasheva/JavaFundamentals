package basicSyntaxConditionalStatementsAndLoops.exercise;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();

        String password = "";

        for (int i = userName.length() - 1; i >= 0 ; i--) {

            char symbol = userName.charAt(i);
            password += symbol;

        }

        String input = scanner.nextLine();

        int count = 0;

        while (!input.equals(password)) {

            count++;

            if (count > 3) {
                System.out.printf("User %s blocked!",userName);
                break;
            }

            System.out.println("Incorrect password. Try again.");


            input = scanner.nextLine();
        }

        if (input.equals(password)) {
            System.out.printf("User %s logged in.", userName);
        }



    }
}


