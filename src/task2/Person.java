package task2;

public abstract class Person {

    private String name, gender, email;

    public Person() {
    }

    public Person(String name, String gender, String email) {
        this.name = name;
        this.gender = gender;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "\n" +
                "\nname: " + name +
                ",\n gender: " + gender +
                ",\nemail: " + email +
                '}';
    }
}

