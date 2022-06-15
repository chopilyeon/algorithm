package Day10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class algorithm01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		
		Set<String> set =new HashSet<String>();

		
		
		
		for(int i=0;i<num;i++) {
			
			set.add(sc.nextLine());
		}
		String[] arr = set.toArray(new String[set.size()]);
			
		
		Arrays.sort(arr);
		
		Arrays.sort(arr, (s1, s2) -> s1.length() - s2.length());
		
		
		for(int i = 0 ; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		
		
	}

}
