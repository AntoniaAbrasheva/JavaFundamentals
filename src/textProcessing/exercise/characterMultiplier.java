package textProcessing.exercise;

import java.util.Scanner;

public class characterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        String firstText = input[0];
        String secondText = input[1];

        int sum = 0;

        for (int i = 0; i < Math.max(firstText.length(),secondText.length()); i++) {

            if (i < firstText.length() && i < secondText.length()) {

                sum += firstText.charAt(i) * secondText.charAt(i);
            } else if (i < firstText.length()) {

                sum += firstText.charAt(i);
            } else if (i < secondText.charAt(i)) {

                sum += secondText.charAt(i);
            }

        }

        System.out.println(sum);


    }
}


