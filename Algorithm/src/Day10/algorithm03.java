package Day10;

import java.util.Scanner;

public class algorithm03 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num = Integer.parseInt(sc.nextLine());
	for(int i=0;i<num;i++) {
		int[] arr = new int[3];
		for (int j = 0; j <arr.length; j++) {

			arr[j] = Integer.parseInt(sc.next());

		}
		int mog =  arr[2] / arr[0];
		int mod =  arr[2] % arr[0];


		String mog1 = mog+"";
		int mog2 = mog+1;
		String mog3 = mog2+"";

		if(mod==0){
			if(mog<10){
			System.out.println(Integer.parseInt(arr[0] + "0" + mog));
			}else if(mog>=10) {
				System.out.println(Integer.parseInt(arr[0] + mog1));
			}
		}else if(mod!=0) {
				if (mog2 < 10) {
					System.out.println(Integer.parseInt(mod + "0" + mog2));
				} else if (mog2 >= 10) {
					System.out.println(Integer.parseInt(mod + "" + mog2));
				}
		}
	}

	}


}


