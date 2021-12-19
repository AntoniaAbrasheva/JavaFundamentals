package exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class treasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> treasureChestList = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("Yohoho!")) {
            String[] commandLine = input.split(" ");
            String command = commandLine[0];

            switch (command) {
                case "Loot":
                    for (int i = 1; i <= commandLine.length - 1; i++) {
                        if (!treasureChestList.contains(commandLine[i])) {
                            treasureChestList.add(0,commandLine[i]);
                        }

                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(commandLine[1]);
                    if (index >= 0 && index <= treasureChestList.size() - 1) {
                        String currentLoot = treasureChestList.get(index);
                        treasureChestList.remove(index);
                        treasureChestList.add(currentLoot);

                    }
                    break;
                case "Steal":
                    int count = Integer.parseInt(commandLine[1]);

                    if (count > treasureChestList.size()) {
                        count = treasureChestList.size();
                    }
                    List<String> sublist = treasureChestList
                                    .subList(treasureChestList.size() - count, treasureChestList.size());
                    System.out.println(String.join(", ",sublist));

                    treasureChestList = treasureChestList.subList(0,treasureChestList.size() - count);


                    break;

            }

            input = scanner.nextLine();
        }

        if (!treasureChestList.isEmpty()) {

            int sum = 0;
            int count = 0;
            for (int i = 0; i < treasureChestList.size(); i++) {
                count++;
                int currentLootLength = treasureChestList.get(i).length();
                sum += currentLootLength;

            }
            double average = sum * 1.0 / count;

            System.out.printf("Average treasure gain: %.2f pirate credits.", average);
        } else {
            System.out.println("Failed treasure hunt.");
        }
    }
}
