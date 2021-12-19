package finalExam_05122021;

import java.util.*;

public class wildZoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> foodMap = new TreeMap<>();
        Map<String, List<String>> areaMap = new TreeMap<>();

        int count = 0;

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
                        areaMap.put(animalName, new ArrayList<>());

                        areaMap.get(animalName).add(area);

                        Collections.sort(areaMap.get(animalName));

                        if (areaMap.get(animalName).contains(area)) {
                            count++;
                            for (int i = 0; i < areaMap.get(animalName).size(); i++) {
                                String currentArea = areaMap.get(animalName).get(i);
                                String nextArea = areaMap.get(animalName).get(i + 1);

                                if (currentArea.equals(nextArea)) {

                                    areaMap.get(animalName).remove(i);
                                }

                            }
                        }

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
                .sorted((f1, f2) -> Integer.compare(f2.getValue(), f1.getValue()))
                .forEach(entry -> System.out.printf(" %s -> %dg\n",
                        entry.getKey(),
                        entry.getValue()));

        System.out.println("Areas with hungry animals:");

        areaMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue().size() > 0)
                .sorted((h1, h2) -> {
                    int sortedResult = Integer.compare(h2.getValue().size(), h1.getValue().size());

                    if (sortedResult == 0) {
                        int newResult = h1.getValue().toString().compareTo(h2.getValue().toString());
                        return newResult;
                    }
                    return sortedResult;
                }).forEach(entry -> {
                    System.out.println
                            ( (entry.getValue()
                                    .toString().replaceAll("[\\[\\],]", ""))
                            + ": " + entry.getValue().size());
                });


    }
}