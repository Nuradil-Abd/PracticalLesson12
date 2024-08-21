package task2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Peaksoft {
    private String name, address;
    private Mentor[] mentors;
    private Student[] students;

    public Peaksoft() {
    }

    public Peaksoft(String name, String address, Mentor[] mentors, Student[] students) {
        this.name = name;
        this.address = address;
        this.mentors = mentors;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Mentor[] getMentors() {
        return mentors;
    }

    public void setMentors(Mentor[] mentors) {
        this.mentors = mentors;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Peaksoft{" +
                "\nname: " + name + '\'' +
                ",\naddress: " + address + '\'' +
                ",\nmentors: " + Arrays.toString(mentors) +
                ",\nstudents: " + Arrays.toString(students) +
                '}';
    }

    public void getMentorsInfo(String name) {

        for (Mentor mentor : getMentors()) {
            if (mentor.getName().contains(name)) {
                System.out.println(mentor);
            }
        }
    }

    public void getAllStudents() {
        System.out.println(Arrays.toString(students));

    }


    public void getStudentByName(String name){

        for (Student student : students) {
            if(student.getName().contains(name)){
                System.out.println(student);
            }
        }
    }

    public void searchByMentorEmail(String email){
        for (Mentor mentor : mentors) {
            if(mentor.getEmail().contains(email)){
                System.out.println(mentor);
            }
        }
    }

    public void sortByStudentName(){
        students = Arrays.stream(students)
                .sorted(Comparator.comparing(Student::getName))
                .toArray(Student[]::new);
        System.out.println("Сорттолгон студентердин массиви: " + Arrays.toString(students));

    }

    public void onlyFemaleOrMale(String gender){
        for (Student student : students) {
            if(student.getGender().equals(gender)){
                System.out.println(student);
            }

        }

    }


}


