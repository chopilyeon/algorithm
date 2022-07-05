package Day12;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class algorithm02 {
    public static void main(String[] args) throws IOException {

        solution02 solution = new solution02();
        int num = Integer.parseInt(solution.br.readLine());
        solution.solution02(num);




    }

}

class solution02{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));



    public void solution02(int n) throws IOException {

        int [] arr = new int [n];
        int [] dy = new int[n];
        StringTokenizer str = new StringTokenizer(br.readLine());
        arr[0]=Integer.parseInt(str.nextToken());
        dy[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i]=Integer.parseInt(str.nextToken());
            if(arr[i]>arr[i]+dy[i-1]){
                dy[i]=arr[i];
            }else{
                dy[i]=arr[i]+dy[i-1];
            }
        }

        Arrays.sort(dy);
        System.out.println(dy[dy.length-1]);

    }


}

