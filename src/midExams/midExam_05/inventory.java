package midExams.midExam_05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> itemList = Arrays.stream(scanner.nextLine().split(", "))
                             .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("Craft!")) {
            String[] commandLine = input.split(" - ");
            String command = commandLine[0];

            switch (command) {
                case "Collect":
                    String collectedItem = commandLine[1];

                    if (!itemList.contains(collectedItem)) {
                        itemList.add(collectedItem);
                    }
                    break;
                case "Drop":
                    String droppedItem = commandLine[1];

                    if (itemList.contains(droppedItem)) {
                        itemList.remove(droppedItem);
                    }
                    break;
                case "Combine Items":
                    String combinedItems = commandLine[1];
                    String[] items = combinedItems.split(":");

                    String oldItem = items[0];
                    String newItem = items[1];

                    if (itemList.contains(oldItem)) {

                        int indexOldItem = itemList.indexOf(oldItem);
                        itemList.add(indexOldItem + 1,newItem);
                    }
                    break;
                case "Renew":
                    String renewItem = commandLine[1];

                    if (itemList.contains(renewItem)) {
                        itemList.remove(renewItem);
                        itemList.add(renewItem);
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.println(itemList.toString()
                .replace("[", "")
                .replace("]", "")
                .trim()
                .replaceAll("\\s+", " "));


    }
}
