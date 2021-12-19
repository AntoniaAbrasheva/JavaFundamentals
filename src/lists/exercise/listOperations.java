package lists.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")) {

            List<String> commandLine = Arrays.stream(command.split(" ")).collect(Collectors.toList());

            String firstItem = commandLine.get(0);

            switch (firstItem) {
                case "Add":
                    int numToAdd = Integer.parseInt(commandLine.get(1));

                    numList.add(numToAdd);
                    break;

                case "Insert":
                    int numToInsert = Integer.parseInt(commandLine.get(1));
                    int index = Integer.parseInt(commandLine.get(2));

                    if (isValid(index,numList.size())) {
                        numList.add(index,numToInsert);
                    } else {
                        System.out.println("Invalid index");
                    }

                    break;

                case "Remove":
                    int removeIndex = Integer.parseInt(commandLine.get(1));

                    if (isValid(removeIndex,numList.size())) {
                        numList.remove(removeIndex);
                    } else {
                        System.out.println("Invalid index");
                    }

                    break;



                case "Shift":
                    String position = commandLine.get(1);
                    int count = Integer.parseInt(commandLine.get(2));

                    if (position.equals("left")) {
                        shiftLeft(numList, count);


                    } else if (position.equals("right")) {
                        shiftRight(numList, count);


                    }
                    break;

            }
            command = scanner.nextLine();
        }
        for (int items : numList) {
            System.out.print(items + " ");
        }

    }

    public static void shiftLeft(List<Integer> list, int count) {

        for (int i = 0; i < count; i++) {

            int firstNumber = list.get(0);
            list.add(firstNumber);
            list.remove(0);

        }
    }

    public static void shiftRight(List<Integer> list, int count) {

        for (int i = 0; i < count; i++) {

            int lastElement = list.get(list.size() - 1);
            list.add(0, lastElement);
            list.remove(list.size() - 1);

        }


    }

    public static boolean isValid (int index,int size) {

        return index >= 0 && index <= size - 1;
    }
}

