package Day10;

import java.util.*;

public class algorithm05 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int num=Integer.parseInt(sc.nextLine());
        int [][] arr = new int [num][2];

        //List<String[]> list = new ArrayList<>();

        for(int i=0;i<num;i++){
            arr[i][0] = Integer.parseInt(sc.next());
            arr[i][1] = Integer.parseInt(sc.next());
        }


        Arrays.sort(arr,(e1,e2)-> {
            if (e1[0] == e2[0]) {
                return e1[1] - e2[1];
            } else {
                return e1[0] - e2[0];
            }
        });





        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }





    }


}



