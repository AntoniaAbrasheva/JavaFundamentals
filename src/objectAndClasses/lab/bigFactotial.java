package objectAndClasses.lab;

import java.math.BigInteger;
import java.util.Scanner;

public class bigFactotial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        BigInteger bigNUm = new BigInteger(String.valueOf(1));

        for (int i = 1; i <= n; i++) {

            bigNUm = bigNUm.multiply(BigInteger.valueOf(i));


        }
        System.out.println(bigNUm);
    }
}


