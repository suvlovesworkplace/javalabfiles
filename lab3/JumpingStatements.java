//wap to show the use of break and continue and return statement
public class JumpingStatements {
    public static void main(String[] args) {
        System.out.println("Using break statement:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println("\nUsing continue statement:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5 || i == 7 ) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println("\nUsing return statement:");
        int result = calculateSum(10, 20);
        System.out.println("Result: " + result);
    }

    public static int calculateSum(int a, int b) {
    if(a>b) {
        return a - b; 
    } else if (a < b) {
        return b - a; 
    }
}

