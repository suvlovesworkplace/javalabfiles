import java.util.Scanner;


public class Output {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Welcome,Select a mode \n 1. Arithematic \n 2. Trigonometric");
        int mode = scanner.nextInt();

        switch(mode) {
            case 1:
        System.out.println("<integer> + <space> + Operator(+,-,*,/,%,^) + <space> + <integer>");
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
            case "^":
                    Arithematic.Power power = new Arithematic.Power();
                    power.calculatePower(num1, num2);
                    break;
            default:
                System.out.println("Invalid choice");
        }
        break;
            case 2:
                System.out.println("< Sin || Cos || Tan> + <space> + <angle in degrees>");
                String Choice = scanner.next();
                double angle = scanner.nextDouble();
                angle = Math.toRadians(angle); // Convert degrees to radians


                switch(Choice) {
                    case "Sin":
                        Trigonometric.Sine sine = new Trigonometric.Sine();
                        sine.calculateSine(angle);
                        break;
                    case "Cos":
                        Trigonometric.Cosine cosine = new Trigonometric.Cosine();
                        cosine.calculateCosine(angle);
                        break;
                    case "Tan":
                        double degreeAngle = Math.toDegrees(angle); // Convert back to degrees and normalize
                        if(degreeAngle == 90 || degreeAngle == 270){
                            System.out.println("Tangent is undefined for angles of 90 degrees and 270 degrees.");
                            break;
                        }else{
                        Trigonometric.Tangent tangent = new Trigonometric.Tangent();
                        tangent.calculateTangent(angle);
                        break;
                        }
            
                    default:
                        System.out.println("Invalid choice");
                }
                break;
            default:
                System.out.println("Invalid mode selected");
        }
    }
}