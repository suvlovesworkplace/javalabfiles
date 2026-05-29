
import java.util.Scanner;

public class ExceptionDemo{
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two integers (a and b): ");
        
        try {
        a = scanner.nextInt();
        b = scanner.nextInt();
            int c = a / b; // This will throw ArithmeticException
            System.out.println("Result: " + c);
        } catch (ArithmeticException ae) {
            System.out.println("Cannot divide by zero. Please provide a non-zero divisor."+ ae.getMessage());
        } catch (Exception e){
            System.out.println("Please enter valid integers. " + e.getMessage());
        }
    }
}