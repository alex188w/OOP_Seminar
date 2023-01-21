package Task2;

public class ProgrammerEmployee extends Employee {

    @Override
    public String getJobTitle() {

        return "Programmer";
    }

    @Override
    public Integer getSalary() {

        return 100000;
    }

    @Override
    public void work() {
        System.out.println("Programmer is coding");
    }

    @Override
    public String toString() {
        return "ProgrammerEmployee []";
    }
}
