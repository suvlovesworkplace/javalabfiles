import java.util.Scanner;

public class Output {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome inside the calculator program");
        System.out.println("<integer> + <space> + Operator(+,-,*,/,%) + <space> + <integer>");
        int num1 = scanner.nextInt();
        String choice = scanner.next();
        int num2 = scanner.nextInt();

        switch(choice) {
            case "+":         
                Arithematic.Sum sum = new Arithematic.Sum();
                sum.calculateSum(num1, num2);
                break;
            case "-":    
                Arithematic.Sub sub = new Arithematic.Sub();
                sub.calculateSub(num1, num2);
                break;
            case "*":
                    Arithematic.Multi multi = new Arithematic.Multi();
                    multi.calculateMulti(num1, num2);
                // Multiplication logic
                break;
            case "/":
                    Arithematic.Div div = new Arithematic.Div();
                    div.calculateDiv(num1, num2);
                // Division logic
                break;
            case "%":                 
                    Arithematic.mod mod = new Arithematic.mod();
                    mod.calculateMod(num1, num2);
                    break;
            default:
                System.out.println("Invalid choice");
        }
    }
}