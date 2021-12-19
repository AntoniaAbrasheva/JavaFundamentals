package methods.exercise;

import java.util.Scanner;

public class nxnMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < n; i++) {
            matrixLine(n);

        }



    }

    public static void matrixLine (int n) {

        for (int i = 0; i < n; i++) {
            System.out.print(n + " ");


        }

        System.out.println();
    }
}


