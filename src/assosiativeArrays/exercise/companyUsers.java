package assosiativeArrays.exercise;

import java.util.*;

public class companyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String, List<String>> data = new TreeMap<>();

        while (!command.equals("End")) {
            String [] commandLine = command.split(" -> ");
            String companyName = commandLine[0];
            String employeeID = commandLine[1];

            if (data.containsKey(companyName)) {
                List<String> employees = data.get(companyName);
                if (!employees.contains(employeeID)) {
                    employees.add(employeeID);
                }
            } else {
                List<String> employees = new ArrayList<>();
                employees.add(employeeID);
                data.put(companyName,employees);

            }

            command = scanner.nextLine();
        }

        data.entrySet().stream().sorted((e1,e2) -> e1.getKey().compareTo(e2.getKey()))
                .forEach(entry -> {
                    System.out.println(entry.getKey());

                    entry.getValue().forEach(employee -> System.out.println("-- " + employee));
                });

    }
}


