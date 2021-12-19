package assosiativeArrays.lab;

import java.util.*;
import java.util.stream.Collectors;

public class countRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toList());

        Map<Double,Integer> countNumberMap = new TreeMap<>();

        for (int i = 0; i < numbersList.size(); i++) {
            double currentNum = numbersList.get(i);

            if (countNumberMap.containsKey(currentNum)) {
                countNumberMap.put(currentNum,countNumberMap.get(currentNum) + 1);
            } else {
                countNumberMap.put(currentNum,1);
            }

        }

        for (Map.Entry<Double, Integer> entry : countNumberMap.entrySet()) {
            System.out.printf("%.0f -> %d\n",entry.getKey(),entry.getValue());
        }

    }
}


