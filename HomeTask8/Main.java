package HomeTask8;

public class Main {

    public static void main(String[] args) {
        testCat();
        testDog();
        testLion();
        testWolf();
        testBigDog();

    }

    public static void testCat() {
        Cat cat = new Cat("Ori");
        cat.greets();
        cat.feed();
        cat.play();
        cat.walk();
    }

    public static void testDog() {
        Dog dog = new Dog("Barry");
        dog.greets();
        dog.feed();
        dog.play();
        dog.walk();
    }

    public static void testLion() {
        Lion lion = new Lion("Alex");
        lion.greets();
        lion.hunting();
    }

    public static void testWolf() {
        Wolf wolf = new Wolf("Jessy");
        wolf.greets();
        wolf.hunting();
    }

    public static void testBigDog() {
        BigDog bigDog = new BigDog("Larry");
        bigDog.greets();
        bigDog.greets(new Dog("Pyke"));
        bigDog.greets(new BigDog("Tom "));

    }
}
