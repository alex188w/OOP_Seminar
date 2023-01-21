package Task1.Util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import Task1.Data.Student;
import Task1.Service.StudentService;

public class DataWriter {
    public String text;
    public static void write(StudentService students) throws IOException {
        try(FileWriter file = new FileWriter("markClass.txt")) {
            for (Student student: students.getAll()) {
                file.write(student.toString());
            }
        } catch(IOException e) {
            e.printStackTrace();
        }


    }
    
    File newFile = new File("User.txt");
}
