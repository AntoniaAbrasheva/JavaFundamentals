package midExams.midExam29022020_04;

import java.util.Arrays;
import java.util.Scanner;

public class heartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] houses = Arrays.stream(scanner.nextLine().split("@"))
                .mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();

        int currentIndex = 0;

        while (!input.equals("Love!")) {
            String[] commandLine = input.split(" ");
            int lengthToJump = Integer.parseInt(commandLine[1]);
            currentIndex += lengthToJump;

            if (currentIndex >= houses.length) {
                currentIndex = 0;

            }

            if (houses[currentIndex] != 0) {
                houses[currentIndex] -= 2;
                if (houses[currentIndex] == 0) {
                    System.out.printf("Place %d has Valentine's day.%n", currentIndex);
                }
            } else {
                System.out.printf("Place %d already had Valentine's day.%n", currentIndex);
            }
            input = scanner.nextLine();
        }
        System.out.printf("Cupid's last position was %d.%n", currentIndex);

        boolean isSuccessful = true;
        for (int house : houses) {
            if (house != 0) {
                isSuccessful = false;
                break;
            }
        }
        int count = 0;
        for (int house : houses) {
            if (house != 0) {
                count++;
            }
        }
        if (isSuccessful) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.", count);
        }

    }
    }

