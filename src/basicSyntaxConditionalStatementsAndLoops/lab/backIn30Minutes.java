package basicSyntaxConditionalStatementsAndLoops.lab;

import java.util.Scanner;

public class backIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        minutes = minutes + 30;

        if (minutes > 60) {
            hour = hour + 1;
            minutes = minutes - 60;
        }

        if (hour > 23) {
            hour = hour - 24;
        }

        if (minutes < 10) {
            System.out.printf("%d:%02d",hour,minutes);
        } else {
            System.out.printf("%d:%d",hour,minutes);
        }

    }
}


