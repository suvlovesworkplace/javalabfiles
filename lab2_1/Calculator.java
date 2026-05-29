
import java.util.Scanner;

public class Calculator {
    public void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }
    public void subtract(int a, int b) {
        int difference = a - b;
        System.out.println("Difference: " + difference);
    }
    public void multiply(int a, int b) {
        int product = a * b;
        System.out.println("Product: " + product);
    }
    public void divide(int a, int b) {
        if (b != 0) {
            int quotient = a / b;
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }   
    public void modulus(int a, int b) {
        if (b != 0) {
            int remainder = a % b;
            System.out.println("Remainder: " + remainder);
        } else {
            System.out.println("Error: Modulus by zero is not allowed.");
        }
    }
    public static void main(String[] args) {
        // Declare and initialize variables
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        // Create an instance of the Calculator class
        Calculator calculator = new Calculator();   

        // Perform selected calculations using switch case statement
        System.out.print("How many operations do you want to perform? ");
        int n = scanner.nextInt();

        int[] choices = new int[n];

        System.out.println("Enter choices: 1 add, 2 subtract, 3 multiply, 4 divide, 5 modulus");

        for (int i = 0; i < n; i++) {
             choices[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            switch (choices[i]) {
                case 1:
                    calculator.add((int) number1, (int) number2);
                    break;
                case 2:
                    calculator.subtract((int) number1, (int) number2);
                    break;
                case 3:
                    calculator.multiply((int) number1, (int) number2);
                    break;
                case 4:
                    calculator.divide((int) number1, (int) number2);
                    break;
                case 5:
                    calculator.modulus((int) number1, (int) number2);
                    break;
                default:
                    System.out.println("Invalid choice: " + choices[i]);
            }
        }
        // Close the scanner
        scanner.close();
    }
}