package Day12;

import java.io.*;
import java.util.StringTokenizer;

public class algorithm03 {
    public static void main(String[] args) throws IOException {
        solution03 solution = new solution03();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int num = Integer.parseInt(br.readLine());

        int[][] arr = new int[num][3];
        int[][] dy = new int[num][3];


        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.countTokens() > 0) {
                arr[i][0] = Integer.parseInt(st.nextToken());
                arr[i][1] = Integer.parseInt(st.nextToken());
                arr[i][2] = Integer.parseInt(st.nextToken());
            }
        }

        dy[0][0] = arr[0][0];
        dy[0][1] = arr[0][1];
        dy[0][2] = arr[0][2];

        for(int i=1;i<num;i++){
            if(dy[i][0]==0||dy[i][1]==0||dy[i][2]==0){
                solution.solution03(i,arr,dy);
            }
        }


        System.out.println(Math.min(dy[num-1][0],Math.min(dy[num-1][1],dy[num-1][2])));

    }

}
class solution03{

    public void solution03(int count,int [][] arr1 , int [][] arr2){
        arr2[count][0]=Math.min(arr2[count-1][1],arr2[count-1][2])+arr1[count][0];
        arr2[count][1]=Math.min(arr2[count-1][0],arr2[count-1][2])+arr1[count][1];
        arr2[count][2]=Math.min(arr2[count-1][0],arr2[count-1][1])+arr1[count][2];
    }
}







