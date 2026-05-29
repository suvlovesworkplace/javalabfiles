import java.util.Scanner;

public class DataTypes_Variables {
    public static void main(String[] args) {
        /*
         * Data types are used to specify the type of data a variable can hold.
         * Variables are like containers that store data values.
         *
         * In Java, there are two main categories of data types:
         * 1. Primitive data types: These include int, double, char, boolean, etc.
         * 2. Reference data types: These include classes, arrays, etc.
         *
         * Example of primitive data types:
         */
        /*
         * Naming principles of variables:
         * 1. Variable names should be meaningful and describe the stored value.
         *    Example: age, price, grade
         * 2. Variable names should start with a letter, underscore (_), or dollar sign ($).
         *    They cannot start with a number.
         * 3. Variable names cannot contain spaces.
         *    Use camelCase for multiple words, like isStudent or totalMarks.
         * 4. Variable names are case-sensitive.
         *    Example: age and Age are different variables.
         * 5. Reserved keywords like int, class, public, and static cannot be used as variable names.
         *
         * Common naming conventions:
         * 1. camelCase: Used for variables and methods.
         *    Example: studentName, totalMarks, calculateTotal()
         * 2. PascalCase: Used for class names.
         *    Example: StudentDetails, DataTypesVariables
         * 3. UPPER_SNAKE_CASE: Used for constant values.
         *    Example: MAX_MARKS, PI_VALUE
         * 4. snake_case: Uses underscores between words.
         *    Example: student_name, total_marks
         *    This is common in some languages, but Java usually prefers camelCase.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: (ie in digits:5,10,15)");
        int age = scanner.nextInt(); // integer data type

        System.out.print("Enter the price:(ie in digits:10.5,20.0,30.25) ");
        double price = scanner.nextDouble(); // double data type

        System.out.print("Enter your grade:(ie A, B, C) ");
        char grade = scanner.next().charAt(0); // character data type

        System.out.print("Are you a student? Enter true or false: ");
        boolean isStudent = scanner.nextBoolean(); // boolean data type

        scanner.nextLine(); // clear the remaining newline

        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // String is a reference data type

        System.out.println("\n--- Variable Details ---");
        System.out.println("Variable name: age");
        System.out.println("Value: " + age);
        System.out.println("Data type: int");

        System.out.println("\nVariable name: price");
        System.out.println("Value: " + price);
        System.out.println("Data type: double");

        System.out.println("\nVariable name: grade");
        System.out.println("Value: " + grade);
        System.out.println("Data type: char");

        System.out.println("\nVariable name: isStudent");
        System.out.println("Value: " + isStudent);
        System.out.println("Data type: boolean");

        /*
         * Example of reference data type:
         */
        System.out.println("\nVariable name: name");
        System.out.println("Value: " + name);
        System.out.println("Data type: String");

        scanner.close();
    }
}
