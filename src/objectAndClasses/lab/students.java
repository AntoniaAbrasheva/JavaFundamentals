package objectAndClasses.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class students {
    public static class Student {
        String firstName;
        String lastName;
        String age;
        String town;

        public Student (String firstName, String lastName,String age,String town) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getAge() {
            return age;
        }

        public String getTown() {
            return town;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] dataArr = input.split("\\s+");

            String firstName = dataArr[0];
            String lastName = dataArr[1];
            String age = dataArr[2];
            String town = dataArr[3];

            Student student = new Student(firstName,lastName,age,town);
            studentList.add(student);



            input = scanner.nextLine();
        }
        String searchTown = scanner.nextLine();

        for (Student s : studentList) {
            if (s.getTown().equals(searchTown)) {
                System.out.printf("%s %s is %s years old\n", s.getFirstName(),
                        s.getLastName(),
                        s.getAge());
            }

        }

    }
}


