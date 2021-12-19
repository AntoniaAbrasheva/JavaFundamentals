package midExams.midExamRetake07042020_03;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class movingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> sequenceOfTargets = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] commandLine = command.split(" ");
            String firstElement = commandLine[0];

            switch (firstElement) {
                case "Shoot":
                    int index = Integer.parseInt(commandLine[1]);
                    int power = Integer.parseInt(commandLine[2]);

                    if (index >= 0 && index <= sequenceOfTargets.size() - 1) {

                        sequenceOfTargets.set(index, sequenceOfTargets.get(index) - power);
                        if (sequenceOfTargets.get(index) <= 0) {
                            sequenceOfTargets.remove(index);
                        }
                    }
                    break;
                case "Add":
                    int addIndex = Integer.parseInt(commandLine[1]);
                    int addValue = Integer.parseInt(commandLine[2]);

                    if (addIndex >= 0 && addIndex <= sequenceOfTargets.size() - 1) {

                        sequenceOfTargets.add(addIndex, addValue);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    int strikeIndex = Integer.parseInt(commandLine[1]);
                    int radius = Integer.parseInt(commandLine[2]);
                    int rightIndex = strikeIndex + radius;
                    int leftIndex = strikeIndex - radius;

                    if (leftIndex >= 0 && rightIndex < sequenceOfTargets.size()) {
                        int removeNum = sequenceOfTargets.get(strikeIndex);

                        for (int i = strikeIndex + 1; i <= rightIndex; i++) {
                            sequenceOfTargets.remove(i);
                        }

                        for (int i = strikeIndex - 1; i >= leftIndex; i--) {
                            sequenceOfTargets.remove(i);

                        }
                        sequenceOfTargets.remove((Integer) removeNum);

                    } else {
                        System.out.println("Strike missed!");
                    }

                    break;
            }


            command = scanner.nextLine();
        }
        System.out.println(sequenceOfTargets.toString()
                .replace("[", "")
                .replace("]", "")
                .replace(",", "")
                .trim()
                .replaceAll("\\s+", "\\|"));
    }
}


