package finalExams.finalExamRetake15082020_01;

import java.util.*;

public class thePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> pieces = new TreeMap<>();


        for (int i = 0; i < n; i++) {

            String [] text = scanner.nextLine().split("\\|");
            String piece = text[0];
            String composer = text[1];
            String key = text[2];

            pieces.put(piece,new ArrayList<>());
            pieces.get(piece).add(composer);
            pieces.get(piece).add(key);
        }

        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            String[] commandLine = input.split("\\|");
            String command = commandLine[0];
            String pieceName = commandLine[1];

            switch (command) {
                case "Add":
                    String composerName = commandLine[2];
                    String keyName = commandLine[3];

                    if (pieces.containsKey(pieceName)) {
                        System.out.printf("%s is already in the collection!\n",pieceName);
                    } else {
                        pieces.put(pieceName,new ArrayList<>());
                        pieces.get(pieceName).add(composerName);
                        pieces.get(pieceName).add(keyName);

                        System.out.printf("%s by %s in %s added to the collection!\n",
                                pieceName,composerName,keyName);
                    }
                    break;
                case "Remove":

                    if (pieces.containsKey(pieceName)) {
                        pieces.remove(pieceName);
                        System.out.printf("Successfully removed %s!\n",pieceName);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.\n",
                                pieceName);
                    }
                    break;
                case "ChangeKey":
                    String newKey = commandLine[2];

                    if (pieces.containsKey(pieceName)) {
                        pieces.get(pieceName).set(1,newKey);

                        System.out.printf("Changed the key of %s to %s!\n",pieceName,newKey);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.\n",
                                pieceName);
                    }
                    break;
            }


            input = scanner.nextLine();
        }
        pieces.entrySet()
                .stream()
                .sorted((e1,e2) -> e1.getKey().compareTo(e2.getKey()))
                .forEach(e -> System.out.printf("%s -> Composer: %s, Key: %s\n",
                        e.getKey(),
                        e.getValue().get(0),
                        e.getValue().get(1)));
    }
}


