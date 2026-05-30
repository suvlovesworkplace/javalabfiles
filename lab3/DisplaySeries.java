//wap to display a number from 1000 to 151 using for loop
//while loop and do while loop
public class DisplaySeries {
    public static void main(String[] args) {
        System.out.println("Using for loop:");
        int i;
        for (i= 1000; i >= 151; i--) {
            System.out.print(i + "  ");
        }   
        System.out.println("\n\nUsing while loop:");
        i = 1000;
        while (i >= 151) {
            System.out.print(i + "  ");
            i--;
        }
        System.out.println("\n\nUsing do-while loop:");
        i = 1000;
        do {
            System.out.print(i + "  ");
            i--;
        } while (i >= 151); 
    }
}