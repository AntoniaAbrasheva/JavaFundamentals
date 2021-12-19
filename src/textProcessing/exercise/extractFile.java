package textProcessing.exercise;

import java.util.Scanner;

public class extractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fullPathFile = scanner.nextLine();
        String[] pathParts = fullPathFile.split("\\\\");
        String fullFileName = pathParts[pathParts.length - 1];

        String fileName = fullFileName.split("\\.")[0];
        String extension = fullFileName.split("\\.")[1];

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + extension);



    }
}



