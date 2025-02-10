import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static int x;
    public static void main(String[] args) {
        while (true){
            Scanner in = new Scanner(System.in);
            System.out.println("=====================================");
            System.out.println("Calculator v1.0");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulo");
            System.out.println("0. Exit");
            System.out.println("=====================================");
            System.out.print("Please Select an Operation: ");
            try {
                x = in.nextInt();
                switch (x) {
                    case 1:
                        System.out.println("You chose Addition!");
                        System.out.println(Calculator.addition());
                        break;
                    case 2:
                        System.out.println("You chose Subtraction!");
                        System.out.println(Calculator.subtraction());
                        break;
                    case 3:
                        System.out.println("You chose Multiplication!");
                        System.out.println(Calculator.multiplication());
                        break;
                    case 4:
                        try {
                            System.out.println("You chose Division!");
                            System.out.println(Calculator.division());
                        } catch (ArithmeticException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 5:
                        try {
                            System.out.println("You chose Modulo!");
                            System.out.println(Calculator.modulo());
                        } catch (ArithmeticException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 0:
                        System.out.println("Thank you for using the Calculator!");
                        System.exit(0);
                    default:
                        System.out.println("You have entered a wrong option!");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please input a valid number!");
            }
        }
    }
}
class Calculator {
    static int x;
    static int y;
    static int addition() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        x = in.nextInt();
        System.out.print("Enter your second number: ");
        y = in.nextInt();
        System.out.println("You have entered " + x + " and " + y + "!");
        System.out.print("The answer is: ");
        return x + y;
    }
    static int subtraction() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        x = in.nextInt();
        System.out.print("Enter your second number: ");
        y = in.nextInt();
        System.out.println("You have entered " + x + " and " + y + "!");
        System.out.print("The answer is: ");
        return x - y;
    }
    static int multiplication() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        x = in.nextInt();
        System.out.print("Enter your second number: ");
        y = in.nextInt();
        System.out.println("You have entered " + x + " and " + y + "!");
        System.out.print("The answer is: ");
        return x * y;
    }
    static int division() {
        int z;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        x = in.nextInt();
        System.out.print("Enter your second number: ");
        y = in.nextInt();
        System.out.println("You have entered " + x + " and " + y + "!");
        if (y == 0) {
            throw new ArithmeticException("Cannot Do Division By Zero!");
        } else {
            z = x / y;
            System.out.print("The answer is: " + z + " , with a remainder of: ");
            return x % y;
        }
    }
    static int modulo() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        x = in.nextInt();
        System.out.print("Enter your second number: ");
        y = in.nextInt();
        System.out.println("You have entered " + x + " and " + y + "!");
        if (y == 0) {
            throw new ArithmeticException("Cannot Do Modulo By Zero!");
        } else {
            System.out.print("The answer is: ");
            return x % y;
        }
    }
}