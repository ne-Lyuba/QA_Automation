package HomeTask8;

public class Cat extends Animal implements Pet {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Cat " + this.getName() + " says: Meow");

    }

    @Override
    public void feed() {
        System.out.println("Feeding cat " + this.getName());
    }

    @Override
    public void walk() {
        System.out.println("Walking cat " + this.getName());
    }

    @Override
    public void play() {
        System.out.println("Playing with cat " + this.getName());
    }
}
