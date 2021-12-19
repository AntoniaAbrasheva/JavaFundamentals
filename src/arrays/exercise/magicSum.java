package arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class magicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();


        int n = Integer.parseInt(scanner.nextLine());




        for (int i = 0; i < array.length; i++) {

            int currentNum = array[i];

            for (int j = i + 1; j < array.length; j++) {

                int nextNum = array[j];

                if (currentNum + nextNum == n) {

                    System.out.printf("%d %d\n",currentNum,nextNum);
                }
            }

        }



    }
}


