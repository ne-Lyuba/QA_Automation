package HomeTask6;

public class Main {
    public static void main(String[] args) {
        JavaDeveloper javaDev = new JavaDeveloper("Tom");
        AutomationEngineer autoEng = new AutomationEngineer("Misha", "Aksani");
        ManualTestEngineer manualQa = new ManualTestEngineer("John", "Smith");
        AngularDeveloper angDev = new AngularDeveloper("Bill");
        Manager manager = new Manager("William", "Underwood");
        manager.setTeamMembers(javaDev, angDev, autoEng, manualQa);
        System.out.println(javaDev.getInfo());
        System.out.println(angDev.getInfo());
        System.out.println(autoEng.getInfo());
        System.out.println(manualQa.getInfo());
        System.out.println(manager.getInfo());
    }
}
