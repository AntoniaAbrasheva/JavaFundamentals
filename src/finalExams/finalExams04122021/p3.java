package finalExams.finalExams04122021;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> composerMap = new HashMap<>();
        Map<String, String> keyMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\|");
            String piece = tokens[0];
            String composer = tokens[1];
            String key = tokens[2];

            composerMap.put(piece, composer);
            keyMap.put(piece, key);

        }

        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            String[] commandLine = input.split("\\|");
            String command = commandLine[0];
            String piece = commandLine[1];

            switch (command) {
                case "Add":
                    String composer = commandLine[2];
                    String key = commandLine[3];

                    if (!composerMap.containsKey(piece)) {
                        composerMap.put(piece, composer);
                        keyMap.put(piece, key);
                        System.out.printf("%s by %s in %s added to the collection!\n",piece,composer,key);
                    } else {
                        System.out.printf("%s is already in the collection!\n", piece);
                    }
                    break;
                case "Remove":

                    if (composerMap.containsKey(piece)) {
                        composerMap.remove(piece);
                        keyMap.remove(piece);
                        System.out.printf("Successfully removed %s!\n", piece);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.\n", piece);
                    }
                    break;
                case "ChangeKey":
                    String newKey = commandLine[2];

                    if (composerMap.containsKey(piece)) {

                        keyMap.put(piece, newKey);
                        System.out.printf("Changed the key of %s to %s!\n", piece, newKey);

                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.\n", piece);
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        composerMap.entrySet()
                .stream()
                .sorted((e1, e2) -> {
                    int result = e1.getKey().compareTo(e2.getKey());
                    if (result == 0) {
                        result = e1.getValue().compareTo(e2.getValue());
                        return result;
                    }
                    return result;
                }).forEach(item -> {
                    String piece = item.getKey();
                    String composer = item.getValue();
                    String key = keyMap.get(piece);
                    System.out.printf("%s -> Composer: %s, Key: %s\n", piece, composer, key);
                });
    }
}
