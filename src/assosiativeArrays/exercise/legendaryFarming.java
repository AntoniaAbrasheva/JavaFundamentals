package assosiativeArrays.exercise;

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class legendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> materials = new TreeMap<>();
        materials.put("shards", 0);
        materials.put("fragments", 0);
        materials.put("motes", 0);

        Map<String, Integer> junk = new TreeMap<>();
        boolean isOver = false;

        while (!isOver) {
            String input = scanner.nextLine();
            String[] inputData = input.split(" ");

            for (int i = 0; i < inputData.length; i += 2) {

                int quantity = Integer.parseInt(inputData[i]);
                String material = inputData[i + 1].toLowerCase(Locale.ROOT);

                if (material.equals("shards") || material.equals("fragments")
                        || material.equals("motes")) {
                    int currentQuantity = materials.get(material);
                    materials.put(material, currentQuantity + quantity);

                    if (materials.get(material) >= 250) {
                        if (material.equals("shards")) {
                            System.out.println("Shadowmourne obtained!");
                        } else if (material.equals("fragments")) {
                            System.out.println("Valanyr obtained!");
                        } else if (material.equals("motes")) {
                            System.out.println("Dragonwrath obtained!");
                        }
                        materials.put(material, materials.get(material) - 250);
                        isOver = true;
                        break;
                    }


                } else {
                    if (!junk.containsKey(material)) {
                        junk.put(material, quantity);
                    } else {
                        int currentQuantity = junk.get(material);
                        junk.put(material, currentQuantity + quantity);
                    }
                }

            }
        }

        materials.entrySet().stream()
                .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        junk.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

    }
}

