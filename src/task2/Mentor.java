package task2;

import java.util.Arrays;

public class Mentor extends Person {

    private Group[] groups;

    public Mentor(String name, String gender, String email, Group[] groups) {
        super(name, gender, email);
        this.groups = groups;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Mentor{" + super.toString()+
                "\ngroups: " + Arrays.toString(groups) +
                "} ";
    }
}
