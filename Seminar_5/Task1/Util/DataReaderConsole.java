package Task1.Util;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Task1.Data.Student;

public class DataReaderConsole {
    public static List<Student> fileReaderConsole() { 
        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные трех студентов 'id, имя, оценка, группа - enter:");
        for (int i = 0; i < 3; i++) {
            String studentData = scanner.nextLine();
            System.out.println(studentData);
            String[] parts = studentData.split(", ");
            Student student = new Student(Integer.parseInt(parts[0]),  parts[1], Integer.parseInt(parts[2]), parts[3]);
            students.add(student);
        }
        scanner.close();
        
        System.out.println(students);
        return students;
    }
}
