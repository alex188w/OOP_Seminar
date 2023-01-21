package Task1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Task1.Data.Student;
import Task1.Service.StudentService;
import Task1.Util.DataReader;
import Task1.Util.DataReaderConsole;
import Task1.Util.DataWriter;

public class Programm {
    
    public static void main(String[] args) throws IOException {
        List<Student> students = new ArrayList<>();
        Student student = new Student(1, "Lera", 4, "234");
        Student student1 = new Student(2, "Vera", 5, "234");
        students.add(student1);
        students.add(student);
        students.add(new Student(3, "Lika", 5, "236"));
        students.add(new Student(4, "Nina", 5, "236"));
        
        System.out.println(DataReader.fileReader());
        System.out.println(DataReaderConsole.fileReaderConsole());
        StudentService studentsService = new StudentService(students);
        DataWriter.write(studentsService);
       
       
        
    }

}