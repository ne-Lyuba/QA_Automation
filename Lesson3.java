import java.util.Random;

public class Lesson3
{
    public static void main(String[] args) {
        int[] array = generateValues();
        int sum = sumValues(array);

        // count the sum of numbers greater than 5 and less than 45
        System.out.println("The sum of numbers greater than 5 and less than 45 = " + sum + "\n");
        System.out.print("Even positive numbers of the array: ");
        printEvenNumbers(array);
    }

    private static int[] generateValues()
    {
        int[] array = new int[20];
        Random random = new Random();

        // fill in random numbers
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
            System.out.println(array[i] + "");
        }

        return array;
    }

    private static int sumValues(int[] values)
    {
        // count the sum
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > 5 && values[i] < 45) {
                sum += values[i];
            }
        }

        return sum;
    }

    private static void printEvenNumbers(int[] array)
    {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0 && array[i] % 2 == 0 ) {
                System.out.print(array[i] + " ");
            }
        }
    }
}




