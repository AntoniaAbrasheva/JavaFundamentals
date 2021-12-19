package textProcessing.lab;

import java.util.Scanner;

public class repeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String repeat = "";

        String[] wordsArr = scanner.nextLine().split(" ");

        for (int i = 0; i < wordsArr.length; i++) {

            String currentText = wordsArr[i];

            for (int j = 0; j < currentText.length(); j++) {
                repeat += String.join("",currentText);


            }

        }
        System.out.println(repeat);

    }
}


