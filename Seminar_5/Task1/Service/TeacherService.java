package Task1.Service;

import java.util.ArrayList;
import java.util.List;

import Task1.Data.Teacher;

public class TeacherService implements DataService<Teacher> {
    private List<Teacher> teachers = new ArrayList<>();

    @Override
    public void add (Teacher teacher) {
       teachers.add(teacher);
        
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
