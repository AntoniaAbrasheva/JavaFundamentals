package lists.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagonList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int maxCapacityOfWagon = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            String [] commandData = command.split(" ");

            if (commandData[0].equals("Add")) {

                int passengers = Integer.parseInt(commandData[1]);
                wagonList.add(passengers);
            } else {
                int passengersToAdd = Integer.parseInt(commandData[0]);

                for (int i = 0; i < wagonList.size(); i++) {

                    int currentWagon = wagonList.get(i);

                    if (currentWagon + passengersToAdd <= maxCapacityOfWagon) {
                        wagonList.set(i, currentWagon + passengersToAdd);
                        break;
                    }

                }
            }

            command = scanner.nextLine();
        }

        for (int item : wagonList) {

            System.out.print(item + " ");

        }
    }
}


