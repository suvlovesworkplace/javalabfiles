// find the product of two user defined numbers

import java.util.Scanner;

public class Product{
	public static void main(String... args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("The product of two entered numbers are ===> "+ a*b);
		sc.close();
	}
}
	