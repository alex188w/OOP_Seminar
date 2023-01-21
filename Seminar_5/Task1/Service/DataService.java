package Task1.Service;

import Task1.Data.User;

public interface DataService <U extends User> {
    public void add(U user);
    public void saveUser();
    public void loadUser();
    
}
