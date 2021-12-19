package finalExams.finalExamRetake10042020_03;

import java.util.*;

public class needForSpeed3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Integer>> carsInfo = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] cars = scanner.nextLine().split("\\|");
            String car = cars[0];
            int mileage = Integer.parseInt(cars[1]);
            int fuel = Integer.parseInt(cars[2]);

            carsInfo.put(car, new ArrayList<>());
            carsInfo.get(car).add(0, mileage);
            carsInfo.get(car).add(1, fuel);

        }

        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            String[] commandLine = input.split(" \\: ");
            String command = commandLine[0];
            String carModel = commandLine[1];

            switch (command) {
                case "Drive":

                    int distance = Integer.parseInt(commandLine[2]);
                    int fuel = Integer.parseInt(commandLine[3]);

                    if (fuel <= carsInfo.get(carModel).get(1)) {
                        int currentDistance = carsInfo.get(carModel).get(0);
                        carsInfo.get(carModel).set(0, distance + currentDistance);
                        int currentFuel = carsInfo.get(carModel).get(1);
                        carsInfo.get(carModel).set(1, currentFuel - fuel);

                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.\n",
                                carModel, distance, fuel);

                        if (carsInfo.get(carModel).get(0) > 100000) {
                            carsInfo.remove(carModel);

                            System.out.printf("Time to sell the %s!\n", carModel);
                        }
                    } else {
                        System.out.println("Not enough fuel to make that ride");
                    }
                    break;
                case "Refuel":
            }
        }
    }
}