package finalExam_05122021;

import java.lang.reflect.InaccessibleObjectException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class p03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> foodMap = new TreeMap<>();
        Map<String, String> areaMap = new TreeMap<>();




        String input = scanner.nextLine();
        while (!input.equals("EndDay")) {
            String[] commandLine = input.split("[\\:\\s-]+");
            String command = commandLine[0];
            String animalName = commandLine[1];
            int food = Integer.parseInt(commandLine[2]);


            switch (command) {
                case "Add":
                    String area = commandLine[3];

                    if (foodMap.containsKey(animalName)) {
                        int currentFood = foodMap.get(animalName);
                        foodMap.put(animalName, currentFood + food);
                    } else {
                        foodMap.put(animalName, food);
                    }
                    if (!areaMap.containsKey(animalName)) {
                        areaMap.put(animalName, area);
                    }
                    break;
                case "Feed":
                    if (foodMap.containsKey(animalName)) {
                        int currentFood = foodMap.get(animalName);
                        foodMap.put(animalName, currentFood - food);
                    } else {
                        break;
                    }

                    if (foodMap.get(animalName) <= 0) {
                        System.out.printf("%s was successfully fed\n", animalName);
                        foodMap.remove(animalName);
                        areaMap.remove(animalName);
                    }


                    break;
            }

            input = scanner.nextLine();
        }


        System.out.println("Animals:");



            foodMap.entrySet()
                    .stream()
                    .sorted((f1, f2) -> Integer.compare(f2.getValue(),f1.getValue()))
                    .forEach(entry -> System.out.printf(" %s -> %dg\n",
                            entry.getKey(),
                            entry.getValue()));

        System.out.println("Areas with hungry animals:");

        int countHungryAnimals = 0;

        for (int i = 0; i < areaMap.size(); i++) {
            String current = areaMap.get(i);

            if (current.equals(areaMap.get(i + 1))) {
                countHungryAnimals++;
            }

        }


    }
    }

