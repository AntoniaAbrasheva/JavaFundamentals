package midExams.midExamRetake_06;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class treasureHunt {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> treasureChest = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Yohoho!")) {
            List<String> commandLine = Arrays.stream(command.split(" ")).collect(Collectors.toList());
            String firstItem = commandLine.get(0);

            switch (firstItem) {
                case "Loot":
                    for (int i = 1; i < commandLine.size(); i++) {

                        if (!treasureChest.contains(commandLine.get(i))) {
                            treasureChest.add(0,commandLine.get(i));
                        }
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(commandLine.get(1));

                    if (index >= 0 && index <= treasureChest.size() - 1) {

                        String element = treasureChest.get(index);

                        treasureChest.remove(element);
                        treasureChest.add(element);
                    }
                    break;

                case "Steal":
                    int count = Integer.parseInt(commandLine.get(1));

                    if (count > treasureChest.size()) {
                        count = treasureChest.size();

                    }
                    List<String> sublist = treasureChest.subList
                            (treasureChest.size() - count,treasureChest.size());
                    System.out.println(String.join(", ",sublist));

                    treasureChest = treasureChest.subList(0,treasureChest.size() - count);
                    break;
            }

            command = scanner.nextLine();
        }



        if (!treasureChest.isEmpty()) {
            int sumTreasure = 0;


            for (String item : treasureChest) {
                sumTreasure += item.length();

            }

            double average = sumTreasure * 1.0 / treasureChest.size();

            System.out.printf("Average treasure gain: %.2f pirate credits.\n", average);
        } else {
            System.out.println("Failed treasure hunt.");
        }

    }


}





