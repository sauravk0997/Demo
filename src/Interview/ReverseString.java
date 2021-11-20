package Interview;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Welcome back";
		s=rev(s);
		System.out.println("The reverse of strin g is " +s);

	}

	
	public static String rev(String s){
		return new StringBuilder(s).reverse().toString();
		
		
	 }
}
 