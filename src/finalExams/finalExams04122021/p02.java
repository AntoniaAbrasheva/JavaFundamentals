package finalExams.finalExams04122021;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "(@|#)(?<firstWord>[A-Za-z]{3,})(\\1)(\\1)(?<secondWord>[A-Za-z]{3,})(\\1)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> mirrorWordsList = new ArrayList<>();

        int countFoundWords = 0;
        boolean isFoundMirrorWords = false;

        while (matcher.find()) {
            countFoundWords++;
            String firstWord = matcher.group("firstWord");
            String secondWord = matcher.group("secondWord");

            String mirrorWord = "";

            for (int i = secondWord.length() - 1; i >= 0; i--) {
                char symbol = secondWord.charAt(i);
                mirrorWord += symbol;

            }

            if (firstWord.equals(mirrorWord)) {
                mirrorWordsList.add(String.format("%s <=> %s",firstWord,secondWord));

                isFoundMirrorWords = true;

            }
        }

        if (countFoundWords > 0) {
            System.out.printf("%d word pairs found!\n",countFoundWords);
        } else {
            System.out.println("No word pairs found!");
        }

        if (isFoundMirrorWords) {
            System.out.println("The mirror words are:");
            System.out.print(String.join(", ",mirrorWordsList));

        } else {
            System.out.println("No mirror words!");
        }


    }

}
