package basicSyntaxConditionalStatementsAndLoops.lab;

import java.util.Scanner;

public class multiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = num; i <= 10; i++) {

            System.out.printf("%d X %d = %d\n", n, i, n * i);



        }
        if (num > 10) {
            System.out.printf("%d X %d = %d",n,num,n*num);
        }
    }
}


