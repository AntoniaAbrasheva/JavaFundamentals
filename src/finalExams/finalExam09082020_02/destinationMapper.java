package finalExams.finalExam09082020_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class destinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("([\\=\\/])(?<destination>[A-Za-z]{2,})\\1");

        Matcher matcher = pattern.matcher(input);

        int travelPoints = 0;

        List<String> destinations = new ArrayList<>();

        while (matcher.find()) {

            String destinationName = matcher.group("destination");
            destinations.add(destinationName);


            travelPoints += destinationName.length();
        }


        System.out.println("Destinations: " + String.join(", " ,destinations));
        System.out.printf("Travel Points: %d",travelPoints);

    }
}
