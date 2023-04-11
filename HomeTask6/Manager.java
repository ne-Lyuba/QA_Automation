package HomeTask6;

import java.util.Arrays;

public class Manager extends Employee {
    final String lastName;
    Employee[] team;

    public Manager(String name, String lastName) {
        super(name);
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getInfo() {
        String[] members = new String[this.team.length];
        for (int i = 0; i < this.team.length; i++) {
            members[i] = this.team[i].getName();
        }
        return super.getInfo() + " and has a team of " + this.team.length + " members: " + Arrays.toString(members);
    }

    public void setTeamMembers(Employee... members) {
        this.team = members;
    }

    @Override
    public String getPosition() {
        return "Manager";
    }

    @Override
    public String getSeniority() {
        return "Senior ";
    }
}
