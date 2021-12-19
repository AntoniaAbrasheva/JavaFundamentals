package finalExam_05122021;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String regex = "[@#]+(?<colour>[a-z]{3,})[@#]+\\W*[\\/]+(?<amount>[0-9]+)[\\/]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {

            String colourEggs = matcher.group("colour");
            int amountOfEggs = Integer.parseInt(matcher.group("amount"));

            System.out.printf("You found %d %s eggs!\n",amountOfEggs,colourEggs);
        }
    }
}
