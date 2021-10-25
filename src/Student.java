import java.awt.desktop.SystemEventListener;

public class Student extends Person {
    public Student(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void print() {
        System.out.print("The Students Name is : ");
        super.print();
    }

    public void print(float cgpa) {
        System.out.print("The Students Name is : ");
        super.print();
        System.out.print("The CGPA is : " + cgpa);
    }
}
