public class MathCalc {
    public static double sum(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public static double difference(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    public static double multiplication(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;

    }

    public static double division(double firstNumber, double secondNumber) {
        if (secondNumber != 0) {
            return firstNumber / secondNumber;
        } else {
            System.out.println("error");
            return 0;
        }
    }
    public static double modularDivision(double firstNumber, double secondNumber){
        return firstNumber % secondNumber;
    }
}
