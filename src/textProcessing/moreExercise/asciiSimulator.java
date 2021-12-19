package textProcessing.moreExercise;

import java.util.Scanner;

public class asciiSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstSymbol = scanner.nextLine().charAt(0);
        char secondSymbol = scanner.nextLine().charAt(0);
        String text = scanner.nextLine();

        StringBuilder sb = new StringBuilder();

        int sum = 0;

        int min = Math.min(firstSymbol,secondSymbol);
        int max = Math.max(firstSymbol,secondSymbol);

        for (int i = 0; i < text.length(); i++) {

            int currentSymbol = (int) text.charAt(i);

            if (currentSymbol > min && currentSymbol < max) {
                sum += currentSymbol;
            }

        }
        System.out.println(sum);


    }

}




