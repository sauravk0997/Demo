package Interview;

import java.util.Scanner;

public class Tabel {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the nuumber");
		 int i = sc.nextInt();
		 
		 for (int j=1; j<=10; j++){
			 System.out.println("Table of" +i+ "x" +j+ " is:" +i*j);
			 
		 }
		 

	}

}
