package midExams.midExamRetake12082020_01;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class memoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> elementsList = Arrays.stream(scanner.nextLine().split(" "))
                                   .collect(Collectors.toList());

        int moves = 0;

        String input = scanner.nextLine();
        while (!input.equals("end")) {

            if (elementsList.isEmpty()) {
                System.out.printf("You have won in %d turns!\n",moves);
                break;
            }
            moves++;

            String[] indexes = input.split(" ");
            int firstIndex = Integer.parseInt(indexes[0]);
            int secondIndex = Integer.parseInt(indexes[1]);

            if (firstIndex >= 0 && firstIndex <= elementsList.size() - 1 &&
            secondIndex >= 0 && secondIndex <= elementsList.size() - 1) {
                if (elementsList.get(firstIndex).equals(elementsList.get(secondIndex))) {

                    System.out.printf("Congrats! You have found matching elements - %s!\n",
                            elementsList.get(firstIndex));

                    elementsList.remove(firstIndex);
                    if (secondIndex > firstIndex) {
                        elementsList.remove(secondIndex - 1);
                    } else {
                        elementsList.remove(secondIndex);
                    }

                } else {
                    System.out.println("Try again!");
                }
            } else {
                System.out.printf("Invalid input! Adding additional elements to the board\n");

                int size = elementsList.size();
                int middleSize = size / 2;


               elementsList.add(middleSize,"-2a");
               elementsList.add(middleSize + 1, "-2a");




            }

            input = scanner.nextLine();
        }
        if (!elementsList.isEmpty()) {
            System.out.println("Sorry you lose :(");
            System.out.print(String.join(" ",elementsList));
        }




    }
}
