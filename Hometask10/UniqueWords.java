package Hometask10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueWords {
    public static void printUniqueWords(String inputString) {
        // remove all extra characters
        String[] words = inputString.split("(\\s|,|!|\\.)\\s*");

        // create a set to store unique words
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        for (String uniqueWord : uniqueWords) {
            System.out.println(uniqueWord.substring(0, 1).toUpperCase() + uniqueWord.substring(1));

        }
    }

}
