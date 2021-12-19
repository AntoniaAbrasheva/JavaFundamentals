package methods.lab;

import java.util.Scanner;

public class repeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        repeatString(input,count);

    }

    public static void repeatString (String input,int count) {

        for (int i = 1; i <= count; i++) {

            System.out.print(input);

        }
    }
}


