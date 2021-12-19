package finalExams.finalExamRetake10042020_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class mirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("(@|#)(?<firstWord>[A-Za-z]{3,})(\\1)(\\1)(?<secondWord>[A-Za-z]{3,})(\\1)");
        Matcher matcher = pattern.matcher(input);

        List<String> matches = new ArrayList<>();


        int count = 0;

        while (matcher.find()) {
            count++;

            String firstWord = matcher.group("firstWord");
            String secondWord = matcher.group("secondWord");

            String reversedFirstWord = "";

            for (int i = firstWord.length() - 1; i >= 0; i--) {
                char currentSymbol = firstWord.charAt(i);

                reversedFirstWord += currentSymbol;

            }

            if (reversedFirstWord.equals(secondWord)) {
                matches.add(String.format("%s <=> %s",firstWord,secondWord));
            }


        }
        if (count > 0) {
            System.out.printf("%d word pairs found!\n", count);
        } else {
            System.out.println("No word pairs found!");
        }

        if (matches.isEmpty()) {
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are: ");
            System.out.print(String.join(", ",matches));
        }

    }
}
