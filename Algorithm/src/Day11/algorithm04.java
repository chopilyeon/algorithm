package Day11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class algorithm04 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        //String [] sentence =str.split("\\+|-");


        String[] substract = str.split("-");
        int sum = 0;


        for(int i=0;i< substract.length;i++) {
            if (i == 0) {
                String [] addition = substract[i].split("\\+");
                for(int j=0;j<addition.length;j++) {
                    sum += Integer.parseInt(addition[j]);
                }
            }
            else {
                String[] addition = substract[i].split("\\+");
                for (int j = 0; j < addition.length; j++) {
                    sum -= Integer.parseInt(addition[j]);
                }
            }
        }



        System.out.println(sum);







    }
}
