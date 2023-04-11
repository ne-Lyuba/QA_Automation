package HomeTask6;

public abstract class Employee {
    protected String name;


    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return "";
    }

    public abstract String getPosition();

    public abstract String getSeniority();

    public String getInfo() {
        return this.getName() + " " + this.getLastName() + " is a " + this.getSeniority() + this.getPosition();
    }

}
