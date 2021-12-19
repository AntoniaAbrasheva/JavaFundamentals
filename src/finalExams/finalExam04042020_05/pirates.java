package finalExams.finalExam04042020_05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> populationMap = new HashMap<>();
        Map<String, Integer> goldMap = new HashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("Sail")) {
            String[] commandLine = input.split("[\\\\||]");
            String city = commandLine[0];
            int population = Integer.parseInt(commandLine[2]);
            int goldQuality = Integer.parseInt(commandLine[4]);


            if (populationMap.containsKey(city)) {
                int currentPopulation = populationMap.get(city);
                populationMap.put(city,currentPopulation + population);

            } else {
                populationMap.put(city, population);
            }

            if (goldMap.containsKey(city)) {
                int currentGold = goldMap.get(city);
                goldMap.put(city,currentGold + goldQuality);
            } else {
                goldMap.put(city,goldQuality);
            }


            input = scanner.nextLine();
        }

        String events = scanner.nextLine();
        while (!events.equals("End")) {
            String[] actions = events.split("=>");
            String command = actions[0];
            String town = actions[1];

            switch (command) {
                case "Plunder":
                    int peopleNum = Integer.parseInt(actions[2]);
                    int qualityGold = Integer.parseInt(actions[3]);


                    int currentPopulation = populationMap.get(town);
                    populationMap.put(town,currentPopulation - peopleNum);

                    int currentGold = goldMap.get(town);
                    goldMap.put(town,currentGold - qualityGold);

                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.\n",
                            town,qualityGold,peopleNum);

                    if (populationMap.get(town) == 0 || goldMap.get(town) == 0) {
                        populationMap.remove(town);
                        goldMap.remove(town);

                        System.out.printf("%s has been wiped off the map!\n",town);
                    }



                    break;
                case "Prosper":
                    int goldAmount = Integer.parseInt(actions[2]);

                    if (goldAmount < 0) {
                        System.out.printf("Gold added cannot be a negative number!\n");

                    } else {
                        int currentGoldAmount = goldMap.get(town);
                        goldMap.put(town,currentGoldAmount + goldAmount);

                        System.out.printf("%d gold added to the city treasury. " +
                                "%s now has %d gold.\n",
                                goldAmount,town,goldMap.get(town));
                    }


                    break;
            }

            events = scanner.nextLine();
        }
        if (!populationMap.isEmpty() && !goldMap.isEmpty()) {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:\n",
                    populationMap.size());

            goldMap.entrySet()
                    .stream()
                    .sorted((g1,g2) -> {
                        int result = g2.getValue() - g1.getValue();

                        if (result == 0) {
                            int res = (populationMap.get(g2.getKey()) - populationMap.get(g1.getKey()));
                            return res;
                        }
                        return result;
                    })
                    .forEach(entry ->
                            System.out.printf("%s -> Population: %d citizens, Gold: %d kg\n",
                                    entry.getKey(),
                                    populationMap.get(entry.getKey()),
                                    entry.getValue()));
        } else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
    }
}
