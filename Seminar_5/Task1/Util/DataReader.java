package Task1.Util;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Task1.Data.Student;

public class DataReader {
    public static List<Student> fileReader() { 
        System.out.println("Введите данные стужента:");   
        List<Student> students = new ArrayList<>();
        try (FileReader fr = new FileReader ("markkClass.txt")) {            
            Scanner scanner = new Scanner(fr);
            System.out.println("Введите данные стужента:");
            while (scanner.hasNextLine()) {
                String studentData = scanner.nextLine();
                System.out.println(studentData);
                String[] parts = studentData.split(", ");
                Student student = new Student(Integer.parseInt(parts[0]),  parts[1], Integer.parseInt(parts[2]), parts[3]);
                students.add(student);
            }
            scanner.close();
        } catch (Exception ex) {
            ex.getStackTrace();
        }
        System.out.println(students);
        return students;
    }

}
