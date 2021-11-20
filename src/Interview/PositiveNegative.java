package Interview;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any integer");
		int n = sc.nextInt();
		
		if(n>0){
			System.out.println("The number is positive");
		}
		else if(n==0){
			System.out.println("The number is neither positive nor negative");
		}
		else {
			System.out.println("The number is negative");
		}

	}

}
