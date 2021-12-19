package midExams.midExamExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class arrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" "))
                           .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] commandLine = input.split(" ");
            String command = commandLine[0];

            switch (command) {
                case "swap":
                    int firstIndex = Integer.parseInt(commandLine[1]);
                    int secondIndex = Integer.parseInt(commandLine[2]);

                    int firstElement = numList.get(firstIndex);
                    int secondElement = numList.get(secondIndex);

                    numList.set(secondIndex,firstElement);
                    numList.set(firstIndex,secondElement);
                    break;
                case "multiply":
                    int index1 = Integer.parseInt(commandLine[1]);
                    int index2 = Integer.parseInt(commandLine[2]);

                    int sum = numList.get(index1) * numList.get(index2);

                    numList.set(index1,sum);
                    break;
                case "decrease":
                    for (int i = 0; i < numList.size(); i++) {
                        int currentNum = numList.get(i);
                        int decreaseNum = currentNum - 1;
                        numList.set(i,decreaseNum);

                    }
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.print(numList.toString()
                .replace("[","")
                .replace("]","")
                .trim()
                .replaceAll("\\s+"," "));
    }
}
