package finalExams.finalExamsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class destinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String regex = "([\\=\\/])(?<destination>[A-Z][A-Za-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        int travelPoints = 0;
        List<String> places = new ArrayList<>();

        while (matcher.find()) {
            places.add(matcher.group("destination"));
            travelPoints += matcher.group("destination").length();


        }
        System.out.println("Destinations: " +String.join(", ",places)) ;
        System.out.println("Travel Points: " +travelPoints);
    }
}
