package lists.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());


        String input = scanner.nextLine();

        while (!input.equals("end")) {

            List<String> currentCommand = Arrays.stream(input.split(" ")).collect(Collectors.toList());

            String command = currentCommand.get(0);

            switch (command) {
                case "Add":
                    int numToAdd = Integer.parseInt(currentCommand.get(1));

                    numList.add(numToAdd);
                    break;
                case "Remove":
                    int removeNum = Integer.parseInt(currentCommand.get(1));

                    numList.remove(Integer.valueOf(removeNum));
                    break;
                case "RemoveAt":
                    int indexRemove = Integer.parseInt(currentCommand.get(1));

                    numList.remove(indexRemove);
                    break;
                case "Insert":
                    int insertNum = Integer.parseInt(currentCommand.get(1));

                    int insertIndex = Integer.parseInt(currentCommand.get(2));

                    numList.add(insertIndex,insertNum);

                    break;
            }



            input = scanner.nextLine();
        }
        System.out.println(numList.toString().replaceAll("[\\[\\],]",""));
    }
}


