package assosiativeArrays.exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class softUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int commandNum = Integer.parseInt(scanner.nextLine());
        Map<String,String> data = new LinkedHashMap<>();

        for (int i = 0; i < commandNum; i++) {
            String[] commandLine = scanner.nextLine().split(" ");
            String command = commandLine[0];

            switch (command) {
                case "register":
                    String userName = commandLine[1];
                    String plateNum = commandLine[2];

                    if (!data.containsKey(userName)) {
                        data.put(userName,plateNum);
                        System.out.printf("%s registered %s successfully\n",userName,plateNum);
                    } else {
                        System.out.printf("ERROR: already registered with plate number %s\n",plateNum);
                    }
                    break;
                case "unregister":
                    String user = commandLine[1];
                    if (!data.containsKey(user)) {
                        System.out.printf("ERROR: user %s not found\n",user);
                    } else {
                        System.out.printf("%s unregistered successfully\n",user);
                        data.remove(user);
                    }
                    break;
            }
        }
        for (Map.Entry<String, String> entry : data.entrySet()) {
            System.out.printf("%s => %s\n",entry.getKey(),entry.getValue());
        }


    }
}


