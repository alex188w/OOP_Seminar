package Task1.Data;

public class Student extends User {
    @Override
    public String toString() {

        return super.toString() + avgMark + ", " + group + '\n';
    }

    private Integer avgMark;

    private String group;


    public Student(int id, String name, int avgMark, String group) {
        super(name, id);
        this.avgMark = avgMark;
        this.group = group;
    }
    
}
