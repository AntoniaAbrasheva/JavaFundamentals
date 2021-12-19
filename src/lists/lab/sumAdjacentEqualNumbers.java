package lists.lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class sumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toList());




        for (int i = 0; i < list.size() - 1; i++) {

            if (list.get(i).equals(list.get(i + 1))) {

                list.set(i, list.get(i) + list.get(i + 1));

                list.remove(i + 1);

                i = -1;
            }

        }
        System.out.println(joinElementByDelimiter(list, " "));
    }
    public static String joinElementByDelimiter (List <Double> list, String delimiter) {

        String input = "";

        for (Double item : list) {

            DecimalFormat df = new DecimalFormat("0.#");
            String numDf = df.format(item) + delimiter;

            input += numDf;

        }

        return input;
    }
}

