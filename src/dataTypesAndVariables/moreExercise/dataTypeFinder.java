package dataTypesAndVariables.moreExercise;

import java.util.Scanner;

public class dataTypeFinder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        while (!input.equals("END")) {
            Scanner dataType = new Scanner(input);



            if (dataType.hasNextBoolean()) {
                System.out.printf("%s is boolean type\n",input);
            } else if (dataType.hasNextInt()) {
                System.out.printf("%s is integer type\n", input);
            } else if (dataType.hasNextFloat()) {
                System.out.printf("%s is floating point type\n", input);
            } else if (dataType.hasNextDouble()) {
                System.out.printf("%s is floating point type\n", input);

            }  else if (input.length() == 1) {
                System.out.printf("%s is character type\n",input);
            } else if (dataType.hasNextLine()) {
                System.out.printf("%s is string type\n",input);
            }

            input = scanner.nextLine();

        }
    }
}


