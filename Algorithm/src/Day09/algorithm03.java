package Day09;

import java.util.Scanner;

public class algorithm03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		for(int i=1;i<=9;i++) {
			System.out.printf("%d*%d=%d\n",num,i,num*i);
		}
		
		
	}

}