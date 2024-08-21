package task2;

import java.util.Arrays;

public class Group {

    private String name;
    private Student[] students;
    private int count;

    public Group(String name, Student[] students) {
        this.name = name;
        this.students = students;
        count = students.length;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" +
                "Group" +
                "name: " + name +
                "students: " + Arrays.toString(students) +
                ", count: " + count +
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    }
}
