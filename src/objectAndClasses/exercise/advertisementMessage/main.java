package objectAndClasses.exercise.advertisementMessage;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfMessage = Integer.parseInt(scanner.nextLine());

        Message message = new Message();

        for (int i = 1; i <= numberOfMessage; i++) {

            message.randomMessage();
        }
    }
}

