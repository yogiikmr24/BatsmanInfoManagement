package schoolmanagement.Model;

public class Teacher extends Person {

    private int salary;
    private String subject;

    public Teacher(String name, String address, int age, int sal, String sub) {
        super(name, address, age);
        this.salary = sal;
        this.subject = sub;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
}
