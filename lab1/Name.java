//wap to take your name as a input and display greeeting message using scanner class

import java.util.Scanner;

public class Name{
	public static void main(String... args){
		Scanner ram = new Scanner(System.in);
		System.out.println("Enter your name");
		String name= ram.nextLine();
		System.out.print(" Your  entered name is " + name);
	ram.close();
	}
}