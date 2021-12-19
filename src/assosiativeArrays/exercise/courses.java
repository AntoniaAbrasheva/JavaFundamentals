package assosiativeArrays.exercise;

import java.util.*;

public class courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String, List<String>> data = new LinkedHashMap<>();


        while (!command.equals("end")) {

            String courseName = command.split(" : ")[0];
            String registeredStudent = command.split(" : ")[1];

            if (!data.containsKey(courseName)) {
                data.put(courseName, new ArrayList<>());

            }
            data.get(courseName).add(registeredStudent);


            command = scanner.nextLine();
        }

        data.entrySet().stream().sorted((e1,e2) -> Integer.compare(e2.getValue().size(),
                        e1.getValue().size()))
                .forEach(entry -> {
                    System.out.println(entry.getKey() + ": " + entry.getValue().size());

                    entry.getValue().stream().sorted()
                            .forEach(studentName -> System.out.println("-- " + studentName));
                });

    }
}



