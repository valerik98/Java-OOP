package Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine();

        List<Student> studentList = new ArrayList<>();

        while(!input.equals("end")){
            //John Smith 15 Sofia
            String firstName = input.split(" ")[0];
            String lastName = input.split(" ")[1];
            int age = Integer.parseInt(input.split(" ")[2]);
            String hometown = input.split(" ")[3];

            Student student = new Student(firstName,lastName,age,hometown);
            studentList.add(student);
            
            input = scanner.nextLine();
        }
        String city = scanner.nextLine();

        for (Student student : studentList) {
            if (student.getHometown().equals(city)){
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }
}
