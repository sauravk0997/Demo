package Interview;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a= sc.nextInt();
		
		System.out.println("Enter any int seceond value");
		int b = sc.nextInt();
		
		int c = a+ b;
		int d = a*b;
		
		System.out.println("Sum is "+c);
		System.out.println("Product is "+d);
		
		Scanner scStr = new Scanner(System.in);
		System.out.println("Enter any string");
		String s1 = scStr.nextLine();
		System.out.println("You have entered " +s1);
	    String s2  = rev(s1);
		System.out.println("Reverse of string is:" +s2);
		
	}
	
	public static String rev(String s1) {
		return new StringBuilder(s1).reverse().toString();
		
	}

}
