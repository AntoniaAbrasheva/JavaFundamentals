package finalExams.finalExamsExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class fancyBarcode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "(@[#]+)(?<name>[A-Z][A-Za-z0-9]{4,}[A-Z])\\1";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = null;

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String barcodes = scanner.nextLine();

            matcher = pattern.matcher(barcodes);

            if (matcher.find()) {
                StringBuilder sb = new StringBuilder();

                for (int j = 0; j < barcodes.length(); j++) {

                    char symbol = barcodes.charAt(j);

                    if (Character.isDigit(symbol)) {
                        sb.append(symbol);
                    }
                }
                if (sb.length() == 0) {
                    System.out.println("Product group: 00");
                } else {
                    System.out.println("Product group: " + sb);
                }

            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
