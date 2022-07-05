package Day11;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class algorithm01 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
        String answer = bf.readLine();
        String [] question=answer.split(" ");

   /*     StringTokenizer st = new StringTokenizer(answer);*/

        int [] arr = new int[Integer.parseInt(question[0])];
        int sum = 0;
        int price = Integer.parseInt(question[1]);
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(bf.readLine());
        }
        for(int i=arr.length-1;i>=0;i--){
            if(price/arr[i]!=0){
                sum=sum+(price/arr[i]);
                price=price -(price/arr[i])*arr[i];
            }
        }
       // String test="hhh";
        String final_answer = sum+ " ";

        bw.write(final_answer);
        //bw.write(test);
       //bw.flush();
        bw.flush();
        bw.close();

        //System.out.println(sum);
       // bw.flush();
        //bw.close();





    }




}



