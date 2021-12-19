package lists.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class changeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while(!command.equals("end")) {

            String commandLine = command.split(" ")[0];
            int element = Integer.parseInt(command.split(" ")[1]);

            if (commandLine.equals("Delete")) {
                numList.removeAll(Arrays.asList(element));

            } else if (commandLine.equals("Insert")) {

                int positionIndex = Integer.parseInt(command.split(" ")[2]);

                numList.add(positionIndex, element);

            }

            command = scanner.nextLine();
        }

        numList.forEach(e -> System.out.print(e + " "));
    }
}


