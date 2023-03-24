import java.util.Random;

public class Lesson3 {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();

        // fill in random numbers
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
            System.out.println(array[i] + "");
        }
        // count the sum
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5 && array[i] < 45) {
                sum += array[i];
            }
        }
        // count the sum of numbers greater than 5 and less than 45
        System.out.println("The sum of numbers greater than 5 and less than 45 = " + sum + "\n");
        System.out.print("Even positive numbers of the array: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0 && array[i] % 2 == 0 ) {
                System.out.print(array[i] + " ");
            }
        }
    }

}




