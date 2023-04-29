package HomeTask7Array;

public class InsertElement {
    public static int[] addElement(int[] array, int element) {
        return addElement(array, element, 0);

    }

    public static int[] addElement(int[] array, int element, int position) {
        int[] result = new int[array.length + 1];
        for (int i = 0, j = 0; i < result.length; i++) {
            if (i == position) {
                result[i] = element;
            } else {
                result[i] = array[j++];
            }
        }
        return result;
    }
}
