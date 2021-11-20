package Interview;

public class MaxmArray {

	public static void main(String[] args) {
		
		int i[] = new int [4];
		
		i[0] = 70;
		i[1] = 60;
		i[2] = 30;
		i[3] = 20;
		System.out.println(i.length);
		
		
		
		if(i[3] > i[2]) {
			System.out.println("The larjest array is i[3] " +i[3]);
		}
		else if(i[2]> i[1] && i[2] > i[3] ){
			System.out.println("The larjest array is i[2] " +i[2]);
		}
		else if(i[1]> i[0] && i[1]> i[2] && i[1]> i[3]){
			System.out.println("The larjest array is i[1] " +i[1]);
		}
		else {
			System.out.println("The larjest array is i[0] " +i[0]);
		}
		

	}

}
