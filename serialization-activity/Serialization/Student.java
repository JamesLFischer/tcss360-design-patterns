import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private double gpa;
    private transient String password;

    public Student(String name, int age, double gpa, String password) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.password = password;
    }

    @Override
    public String toString() {
        return name + " (" + age + " years old, GPA: " + gpa
                + ", Password: " + password + ")";
    }
}