package lists.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class removeNegativesAndRemoves {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());


        for (int i = numList.size() - 1; i >= 0; i--) {

            int currentNum = numList.get(i);

            if (currentNum < 0) {

                numList.remove(Integer.valueOf(i));
                numList.remove(i);
            } else {

                System.out.print(numList.get(i) + " ");

            }

            if (numList.isEmpty()) {
                System.out.println("empty");
            }
        }
    }
}


