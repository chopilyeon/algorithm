package Day11;

import java.io.*;
import java.util.StringTokenizer;

public class algorithm03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int city = Integer.parseInt(br.readLine());
        int[] way = new int[city - 1];
        int[] gas = new int[city];
        int[] efficient_gas = new int[city];

        StringTokenizer str1 = new StringTokenizer(br.readLine());
        StringTokenizer str2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < way.length; i++) {
            way[i] = Integer.parseInt(str1.nextToken());
            if(way[i]>10000){
                way[i]=10000;
            }
        }
        for (int i = 0; i < gas.length; i++) {
            gas[i] = Integer.parseInt(str2.nextToken());
            efficient_gas[i]=gas[i];
            if(gas[i]>10000){
                gas[i]=10000;
                efficient_gas[i]=10000;
            }
        }


        for (int i = 0; i < efficient_gas.length; i++) {
            point:
            for (int j = i+1; j < efficient_gas.length; j++) {
                if (gas[i] < gas[j]) {
                    for (int k = i; k <= j; k++) {
                        efficient_gas[k] = gas[i];
                    }
                break point;
                }


            }
        }
/*

        for(int i:efficient_gas){
            System.out.println(i);
        }
*/


        int [] price = new int[city-1];
        for(int i=0;i<price.length;i++){
            price[i]=way[i]* efficient_gas[i];
        }
        int answer =0;
        for(int i=0;i<price.length;i++){
            answer+=price[i];
        }
        bw.write(answer+" ");
        bw.flush();










    }
}
