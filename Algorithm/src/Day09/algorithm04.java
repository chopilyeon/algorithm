package Day09;

import java.util.Scanner;

public class algorithm04 {

	public static void main(String[] args) {
		Scanner sc  =new Scanner(System.in);
		int num=Integer.parseInt(sc.nextLine());
		String[] Arr=new String[num];
		for(int i=0;i<Arr.length;i++) {
			Arr[i]=sc.nextLine();
		}
		
		
		int sum = 0;
		int plus= 1;
		int final_sum=0;
		for(int j=0;j<Arr.length;j++) {
			for(int i=0;i<Arr[j].length();i++) {
				if(Arr[j].charAt(i)== 'O') {
					sum=sum+plus;
					plus++;
					final_sum=final_sum+sum;
					sum=0;
				}else if (Arr[j].charAt(i)== 'X') {
			
					sum=0;
					plus=1;			
				}
			}
		System.out.println(final_sum);
		sum=0;
		final_sum=0;
		plus=1;
		}

	}
}
