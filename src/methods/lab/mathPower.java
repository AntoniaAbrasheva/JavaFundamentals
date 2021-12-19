package methods.lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class mathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double result = mathPower(scanner);

        DecimalFormat df = new DecimalFormat("0.####");

        System.out.println(df.format(result));

    }

    public static double mathPower (Scanner scanner) {

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());

        return Math.pow(a,b);


    }
}
