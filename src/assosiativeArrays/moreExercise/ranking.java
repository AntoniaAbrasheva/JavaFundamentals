package assosiativeArrays.moreExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstCommand = scanner.nextLine();

        LinkedHashMap<String,String> data = new LinkedHashMap<>();
        TreeMap<String, LinkedHashMap<String, Integer>> users = new TreeMap<>();

        while (!firstCommand.equals("end of contests")) {

            String contest = firstCommand.split(":")[0];
            String password = firstCommand.split(":")[1];

            data.put(contest,password);


            firstCommand = scanner.nextLine();
        }
        String secondCommand = scanner.nextLine();


        while (!secondCommand.equals("end of submissions")) {

            String contestName = secondCommand.split("=>")[0];
            String pass = secondCommand.split("=>")[1];
            String username = secondCommand.split("=>")[2];
            int points = Integer.parseInt(secondCommand.split("=>")[3]);

            if (data.containsKey(contestName)) {
                if (data.get(contestName).equals(pass)) {

                    LinkedHashMap<String,Integer> results = new LinkedHashMap<>();
                    results.put(contestName,points);

                    if (!users.containsKey(username)) {
                        users.put(username,results);
                    } else {
                        if (!users.get(username).containsKey(contestName)) {
                            users.get(username).put(contestName, points);
                        } else {
                            users.get(username)
                                    .put(contestName, Math.max(points, users.get(username).get(contestName)));
                        }
                    }
                }

            }


            secondCommand = scanner.nextLine();
        }
        int totalSum = 0;

        for (Map.Entry<String, LinkedHashMap<String, Integer>> user : users.entrySet()) {
            int sum = user.getValue().values().stream().mapToInt(i -> i).sum();
            if (sum > totalSum) {
                totalSum = sum;
            }
        }
        for (Map.Entry<String, LinkedHashMap<String, Integer>> entry : users.entrySet()) {

            if (entry.getValue().values().stream().mapToInt(i -> i).sum() == totalSum) {
                System.out.printf("Best candidate is %s with total %d points.%n", entry.getKey(), totalSum);
            }
        }
        System.out.println("Ranking:");
        users.forEach((key, value) -> {
            System.out.printf("%s%n", key);
            value.entrySet().stream().
                    sorted((f, s) -> s.getValue() - f.getValue()).
                    forEach(i -> System.out.printf("#  %s -> %d%n", i.getKey(), i.getValue()));
        });

    }

}



