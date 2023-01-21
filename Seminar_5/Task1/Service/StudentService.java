package Task1.Service;

import java.util.ArrayList;
import java.util.List;

import Task1.Data.Student;

public class StudentService implements DataService<Student> {
    private List<Student> students = new ArrayList<>();    

    public StudentService(List<Student> students) {
        this.students = students;
    }

    public List<Student> getAll() {
        List<Student> copy = new ArrayList<>();
        for (Student student : students) {
            copy.add(student);            
        }
        return copy;
    }

    @Override
    public void add (Student student) {
        students.add(student);
        
        
    }

    @Override
    public void saveUser() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void loadUser() {
        // TODO Auto-generated method stub
        
    }
    
}
