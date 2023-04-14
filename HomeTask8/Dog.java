package HomeTask8;

public class Dog extends Animal implements Pet {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Dog " + this.getName() + " says: Woof");
    }

    public void greets(Dog another) {
        System.out.println("Woooooof");
    }

    @Override
    public void feed() {
        System.out.println("Feeding dog " + this.getName());
    }

    @Override
    public void walk() {
        System.out.println("Walking dog " + this.getName());
    }

    @Override
    public void play() {
        System.out.println("Playing dog " + this.getName());
    }
}
