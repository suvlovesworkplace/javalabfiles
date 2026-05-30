package Arithematic;

public class Div {
    public int calculateDiv(int a, int b) {
        if (b != 0) {
            System.out.println( " = " + (a / b));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
        return 0;
    }
    
}