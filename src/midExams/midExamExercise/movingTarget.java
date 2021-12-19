package midExams.midExamExercise;

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
            int value = Integer.parseInt(commandLine[2]);

            switch (command) {
                case "Shoot":
                    if (targetsList.get(index) - value <= 0) {
                        targetsList.remove(index);
                    } else if (index >= 0 && index <= targetsList.size() - 1) {
                        int shootValue = targetsList.get(index) - value;
                        targetsList.set(index,shootValue);
                    }
                    break;
                case "Add":
                    if (index >= 0 && index <= targetsList.size() - 1) {
                        targetsList.set(index,value);
                    } else {
                        System.out.println("Invalid placement!");

                    }
                    break;
                case "Strike":
                    break;
            }


            input = scanner.nextLine();
        }

        
    }
}
