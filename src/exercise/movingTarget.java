package exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class movingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targetsList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] commandLine = input.split(" ");
            String command = commandLine[0];
            int index = Integer.parseInt(commandLine[1]);

            switch (command) {
                case "Shoot":
                    int power = Integer.parseInt(commandLine[2]);

                    if (index >= 0 && index <= targetsList.size() - 1) {
                        targetsList.set(index, targetsList.get(index) - power);

                        if (targetsList.get(index) <= 0) {
                            targetsList.remove(index);
                        }
                    }

                    break;
                case "Add":
                    int value = Integer.parseInt(commandLine[2]);

                    if (index >= 0 && index <= targetsList.size() - 1) {
                        targetsList.add(index, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }

                    break;
                case "Strike":
                    int radius = Integer.parseInt(commandLine[2]);

                    int leftRadius = index - radius;
                    int rightRadius = index + radius;

                    if (leftRadius >= 0 && rightRadius <= targetsList.size() - 1) {
                        int numToRemove = targetsList.get(index);

                        for (int i = index + 1; i <= rightRadius; i++) {
                            targetsList.remove(i);

                        }
                        for (int i = index - 1; i >= leftRadius; i--) {
                            targetsList.remove(i);

                        }
                        targetsList.remove((Integer) numToRemove);
                    } else {
                        System.out.println("Strike missed!");
                    }

                    break;
            }

            input = scanner.nextLine();
        }
        System.out.println(targetsList.toString()
                .replace("[", "")
                .replace("]", "")
                .replace(",", "")
                .trim()
                .replaceAll("\\s+", "\\|"));
    }
}
