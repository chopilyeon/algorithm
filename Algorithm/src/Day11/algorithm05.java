package Day11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class algorithm05 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<int []> list =  new ArrayList<>();

        int sum = Integer.parseInt(br.readLine());
        int [][] arr = new int [sum][2];
        for(int i=0;i<arr.length;i++){
            String [] str=br.readLine().split(" ");
            arr[i][0]=Integer.parseInt(str[0]);
            arr[i][1]=Integer.parseInt(str[1]);
        }

        for(int i=0;i<arr.length;i++){

            //list.add(({Integer.parseInt(br.readLine()),Integer.parseInt(br.readLine())}));
            list.add(arr[i]);
        }

        for(int i=0;i<list.size();i++){

            System.out.println(list.get(i)[0]);
        }


        Collections.sort(list,(e1,e2)-> {
            return e1[1] - e2[1];
        });

        for(int i=0;i<list.size();i++){

            System.out.println(list.get(i)[0]);

        }



    }
}