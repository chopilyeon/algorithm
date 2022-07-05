package Day10;

import java.util.*;

public class algorithm02 {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		
		List<Integer> list=new ArrayList<Integer>();
		int num=Integer.parseInt(sc.nextLine());
		
		for(int i=0;i<num;i++ ) {
			list.add(Integer.parseInt(sc.nextLine()));
		}
		Collections.sort(list);
		StringBuilder str=new StringBuilder();
		for(int i=0;i<list.size();i++){
			str.append(list.get(i)+"\n");
		}
		System.out.println(str);

	}
}