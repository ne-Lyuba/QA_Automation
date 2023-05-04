package HomeTask11;

import java.util.*;

import static HomeTask11.PrintMap.printMap;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> pets = new TreeMap<>();
        pets.put(10000, "Cat");
        pets.put(3234, "Parrot");
        pets.put(2, "Dog");
        pets.put(721, "Cow");
        pets.put(10, "Duck");
        pets.put(59, "Bird");

        printMap(pets);

    }
}

