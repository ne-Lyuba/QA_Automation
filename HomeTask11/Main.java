package HomeTask11;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer,String> pets = new TreeMap<>();
        pets.put(10000, "Cat");
        pets.put(3234, "Parrot");
        pets.put(2, "Dog");
        pets.put(721, "Cow");
        pets.put(10, "Duck");
        pets.put(59, "Bird");

        for (Map.Entry<Integer, String> item : pets.entrySet()) {

            System.out.println(item);
        }
    }
}
