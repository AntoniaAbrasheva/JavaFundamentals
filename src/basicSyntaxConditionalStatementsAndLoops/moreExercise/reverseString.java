package basicSyntaxConditionalStatementsAndLoops.moreExercise;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {

            char symbol = text.charAt(i);
            reversed += symbol;

        }
        System.out.println(reversed);
    }
}


