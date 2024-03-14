package VetClinic.Staff;

public abstract class Workers {
    protected String name;
    protected int age;
    protected int salary;

    public Workers (String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public abstract void toWork();

    public String getJob() {
        return getClass().getSimpleName();
    }
    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
