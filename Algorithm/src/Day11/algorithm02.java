package Day11;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class algorithm02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int answer = Integer.parseInt(br.readLine());
        int [] part_sum=new int [answer];
        int sum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        int [] time = new int[answer];

        for(int i =0 ; i< answer;i++){
            time[i]=Integer.parseInt(st.nextToken());
        }


        Arrays.sort(time);

        for(int i=0 ; i<answer;i++) {
            if (i == 0) {
                part_sum[i] = time[i];
            } else {
                part_sum[i] = time[i] + part_sum[i-1];
            }
        }


        for(int i=0;i<time.length;i++){
            sum=sum+part_sum[i];
        }
        String final_sum=sum+" ";
        bw.write(final_sum);
        bw.flush();

    }

}
