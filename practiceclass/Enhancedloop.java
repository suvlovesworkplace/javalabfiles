public class Enhancedloop {
    public static void main(String[] args) {
        /*
         * Enhanced loop is also called a foreach loop.
         *
         * It is used to visit each item of an array or collection one by one.
         * It is easier to read when we do not need the index number.
         *
         * Syntax:
         * for (dataType variableName : arrayName) {
         *     // code to run for each item
         * }
         */

        int[] marks = {85, 90, 78, 92, 88};

        /*
         * This foreach loop reads each value from the marks array.
         *
         * int mark:
         *     This variable stores one value from the array at a time.
         *
         * marks:
         *     This is the array we are looping through.
         *
         * First round:  mark = 85
         * Second round: mark = 90
         * Third round:  mark = 78
         * and so on...
         */
        System.out.println("Student marks:");
        for (int mark : marks) {
            System.out.println(mark);
        }

        /*
         * Example 2: foreach loop with String array.
         * Here, each name from the names array is stored in the variable name.
         */
        String[] names = {"Ram", "Sita", "Hari", "Gita"};

        System.out.println("\nStudent names:");
        for (String name : names) {
            System.out.println("Hello, " + name);
        }

        /*
         * Example 3: finding the sum of all numbers.
         *
         * The variable total starts from 0.
         * Each number from the array is added to total.
         */
        int total = 0;

        for (int mark : marks) {
            total = total + mark;
        }

        System.out.println("\nTotal marks: " + total);

        /*
         * Important:
         * A foreach loop is best when we only need the values.
         *
         * If we need the index position, like marks[0], marks[1],
         * then a normal for loop is better.
         */
        System.out.println("\nNormal for loop with index:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Index " + i + " has value " + marks[i]);
        }
    }
}
