package Day09;

import java.util.Scanner;

public class algorithm05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println((factorial(num)));
		
		
		
	}

	
	
	static int factorial(int n) {
		if(n==1) {
			return 1;
		}
		return factorial(n-1)*n;
	}
	
	
}
