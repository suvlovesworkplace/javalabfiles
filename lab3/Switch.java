//wap using switch case to take grade as a input and convert 
//respective gpa based on pu grading system
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your grade (A, A-, B+, B, B-, C+, C, F): ");
        String grade = input.nextLine().toUpperCase(); // Convert input to uppercase for case-insensitive comparison
        double gpa;

        switch (grade) {
            case "A":
                gpa = 4.0;
                break;
            case "A-":
                gpa = 3.7;
                break;
            case "B+":
                gpa = 3.3;
                break;
            case "B":
                gpa = 3.0;
                break;
            case "B-":
                gpa = 2.7;
                break;
            case "C+":
                gpa = 2.3;
                break;
            case "C":
                gpa = 2.0;
                break;
            case "F":
                gpa = 0.0;
                break;
            default:
                System.out.println("Invalid grade entered.");
                return; // Exit the program if an invalid grade is entered
        }

        System.out.println("Your Grade is: "+grade+" and your GPA is: "+   gpa);
    }
}