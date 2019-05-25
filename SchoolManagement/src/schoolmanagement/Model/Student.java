
package schoolmanagement.Model;

public class Student extends Person{
    private int rollNo;
    private int grade;
    
    public Student(String name,int rollNo,int grade,String address,int age){
        super(name,address,age);
        this.rollNo = rollNo;
        this.grade = grade;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
       
}
