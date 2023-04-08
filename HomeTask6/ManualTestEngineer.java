package HomeTask6;

public class ManualTestEngineer extends Employee {
    final String lastName;

    public ManualTestEngineer(String name, String lastName) {
        super(name);
        this.lastName = lastName;

    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String getPosition() {
        return "Manual Test Engineer";
    }

    @Override
    public String getSeniority() {
        return "Junior ";
    }
}

