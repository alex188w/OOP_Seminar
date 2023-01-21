package Task1.Data;

public class Teacher extends User {
    private String position;
    private String subject;

    public Teacher(int id, String name, String position, String subject) {
        super(name, id);
        this.position = position;
        this.subject = subject;
    }


    @Override
    public String toString() {

        return "Teacher{" + super.toString() +
                "position=" + position +
                ", subject='" + subject + '\'' +
                '}';
    }
    
}
 