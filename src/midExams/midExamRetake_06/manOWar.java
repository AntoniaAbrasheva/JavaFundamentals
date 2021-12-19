package midExams.midExamRetake_06;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class manOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> piratesShipList = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> warShipList = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        boolean isFired = false;

        int maxHealth = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Retire")) {
            String[] commandLine = input.split(" ");
            String command = commandLine[0];

            switch (command) {
                case "Fire":
                    int fireIndex = Integer.parseInt(commandLine[1]);
                    int fireDamage = Integer.parseInt(commandLine[2]);

                    if (fireIndex >= 0 && fireIndex <= warShipList.size() - 1) {
                        warShipList.set(fireIndex, warShipList.get(fireIndex) - fireDamage);
                    } else {
                        break;
                    }

                    if (warShipList.get(fireIndex) <= 0) {
                        System.out.println("You won! The enemy ship has sunken.");
                        isFired = true;
                        break;
                    }
                    break;
                case "Defend":
                    int startIndex = Integer.parseInt(commandLine[1]);
                    int endIndex = Integer.parseInt(commandLine[2]);
                    int damage = Integer.parseInt(commandLine[3]);

                    if (startIndex >= 0 && endIndex <= piratesShipList.size()) {
                        for (int i = startIndex; i <= endIndex; i++) {
                            piratesShipList.set(i,piratesShipList.get(i) - damage);

                            if (piratesShipList.get(i) <= 0) {
                                System.out.println("You lost! The pirate ship has sunken.");
                                isFired = true;
                                return;
                            }

                        }

                    }
                    break;
                case "Repair":
                    int repairedIndex = Integer.parseInt(commandLine[1]);
                    int repairedHealth = Integer.parseInt(commandLine[2]);

                    if (repairedIndex >= 0 && repairedIndex <= piratesShipList.size() - 1) {

                        if ((piratesShipList.get(repairedIndex) + repairedHealth) <= maxHealth) {

                            piratesShipList
                                .set(repairedIndex,piratesShipList.get(repairedIndex) + repairedHealth);
                    }
                    }

                    break;
                case "Status":
                    int count = 0;
                    for (int i = 0; i < piratesShipList.size(); i++) {

                        int currentSection = piratesShipList.get(i);

                        if (currentSection < (maxHealth * 0.2)) {
                            count++;

                        }

                    }
                    System.out.printf("%d sections need repair.\n",count);

                   if (isFired) {
                       break;
                   }
                    break;
            }


            input = scanner.nextLine();
        }
        if (!isFired) {
            int piratesShipSum = 0;


            for (int section : piratesShipList) {
                piratesShipSum += section;

            }
            int warShipSum = 0;

            for (int section : warShipList) {
                warShipSum += section;
            }

            System.out.printf("Pirate ship status: %d\n", piratesShipSum);
            System.out.printf("Warship status: %d\n", warShipSum);
        }
    }
        }

