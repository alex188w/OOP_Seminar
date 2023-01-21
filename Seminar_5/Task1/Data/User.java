package Task1.Data;

public abstract class User {
    private int id;

    @Override
    public String toString() {
        return name + ", " + id + ", ";
    }

    private String name;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }


}
