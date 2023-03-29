import java.util.Scanner;

public class homeTask4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first value please:");
        double firstNumber = in.nextDouble();
        System.out.println("Now enter the second value:");
        double secondNumber = in.nextDouble();
        double result = 0;
        System.out.println("Enter a mathematical operation symbol");
        char mathSymbol = in.next().charAt(0);
        switch (mathSymbol) {
            case '+':
                result = MathCalc.sum(firstNumber, secondNumber);
                break;
            case '-':
                result = MathCalc.difference(firstNumber, secondNumber);
                break;
            case '*':
                result = MathCalc.multiplication(firstNumber, secondNumber);
                break;
            case'/':
                result = MathCalc.division(firstNumber,secondNumber);
                break;
            case '%':
                result=MathCalc.percentage(firstNumber,secondNumber);
                break;
            default:
                System.out.println("Such mathematical operation is not acceptable");
                return;
        }
        System.out.println("The result = " + result);
    }
}
