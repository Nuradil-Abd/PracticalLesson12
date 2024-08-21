package task2;

public class Student extends Person {
    public Student(String name, String gender, String email) {
        super(name, gender, email);
    }

    @Override
    public String toString() {
        return "\nStudent { " + super.toString() + "}";
    }
}
