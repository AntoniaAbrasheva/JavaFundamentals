package finalExams.finalExamsExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class emojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String text = scanner.nextLine();

        String wordRegex = "([:]{2}|[*]{2})([A-Z][a-z]{2,})(\\1)";
        Pattern wordsPattern = Pattern.compile(wordRegex);

        String digitRegex = "[0-9]";
        Pattern digitsPattern = Pattern.compile(digitRegex);

        Matcher matcher = null;
        matcher = digitsPattern.matcher(text);


        long coolThreshold = 1;


        while (matcher.find()) {
            coolThreshold *= Integer.parseInt(matcher.group());
        }

        System.out.printf("Cool threshold: %d%n", coolThreshold);

        int count = 0;

        matcher = wordsPattern.matcher(text);

        while (matcher.find()) {
            count++;
        }
        if (count > 0) {

            System.out.printf("%d emojis found in the text. The cool ones are:%n", count);
        }
        matcher = wordsPattern.matcher(text);

        while (matcher.find()) {

            long sumDigits = 0;

            String foundWord = matcher.group();

            for (int i = 2; i < foundWord.length() - 2; i++) {
                int currentSymbol = foundWord.charAt(i);

                sumDigits += currentSymbol;
            }
            if (sumDigits >= coolThreshold) {
                System.out.println(foundWord);
            }
        }
    }
}










