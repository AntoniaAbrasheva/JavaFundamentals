package assosiativeArrays.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class largestThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .sorted((e1,e2) -> e2.compareTo(e1))
                .limit(3)
                .collect(Collectors.toList());

        for (int i : numberList) {
            System.out.print(i + " ");
        }
    }
}


