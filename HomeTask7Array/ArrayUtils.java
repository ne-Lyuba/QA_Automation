package HomeTask7Array;

import java.util.Arrays;

public class ArrayUtils {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};

        // Добавить элемент в начало массива
        int[] beginningResult  = InsertElement.addElement(array, 9);
        System.out.println(Arrays.toString(beginningResult));

        // Добавить элемент в указанную позицию
        int[] specifiedPositionResult = InsertElement.addElement(array, 6, 3);
        System.out.println(Arrays.toString(specifiedPositionResult));


    }
}
