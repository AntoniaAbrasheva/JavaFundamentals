package arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class topIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int [] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();




        for (int i = 0; i <= array.length - 1; i++) {

            int currentNum = array[i];

            if (i == array.length - 1) {
                System.out.print(currentNum + " ");
                break;

            }

            boolean isTop = false;

            for (int j = i + 1; j <= array.length - 1; j++) {

                int nextNum = array [j];

                if (currentNum > nextNum) {

                    isTop = true;
                } else {
                    isTop = false;
                    break;
                }

            }

            if (isTop) {

                System.out.print(currentNum + " ");
            }

        }

    }
}


