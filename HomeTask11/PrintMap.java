package HomeTask11;

import java.util.*;

public class PrintMap {
    public static void printMap(Map<Integer, String> map) {
        TreeMap<Integer, String> sortedMap = new TreeMap<>(map);
        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
