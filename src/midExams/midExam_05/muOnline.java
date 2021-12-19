package midExams.midExam_05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class muOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] roomsArr = scanner.nextLine().split("\\|");

        int initialHealth = 100;
        int initialBitcoins = 0;

        int bestRoom = 0;



        for (int i = 0; i < roomsArr.length; i++) {
            String[] tokens = roomsArr[i].split(" ");
            String command = tokens[0];
            int value = Integer.parseInt(tokens[1]);
            bestRoom++;

            if (command.equals("potion")) {
                int currentHealth = initialHealth;
                initialHealth += value;

                if (initialHealth > 100) {
                    initialHealth = 100;

                    int amount = 100 - currentHealth;
                    System.out.printf("You healed for %d hp.\n", amount);
                } else {
                    System.out.printf("You healed for %d hp.\n", value);
                }
                System.out.printf("Current health: %d hp.\n", initialHealth);
            } else if (command.equals("chest")) {

                initialBitcoins += value;
                System.out.printf("You found %d bitcoins.\n", value);

            } else {
                initialHealth -= value;
                if (initialHealth > 0) {
                    System.out.printf("You slayed %s.\n", command);
                } else {
                    System.out.printf("You died! Killed by %s.\n", command);
                    System.out.printf("Best room: %d\n", bestRoom);

                    break;
                }
            }

        }
        if (initialHealth > 0) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d\n", initialBitcoins);
            System.out.printf("Health: %d\n", initialHealth);
        }


    }
}

