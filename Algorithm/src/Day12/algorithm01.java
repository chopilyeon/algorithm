package Day12;

import java.io.*;

public class algorithm01 {
    public static void main(String[] args) throws IOException {
    Solution01 solution = new Solution01();

        int input=Integer.parseInt(solution.br.readLine());
        solution.solution01_Fibo(input);
        solution.solution01_dynamic(input);
    System.out.println(solution.sum1);
    System.out.println(solution.sum2);



    }
}

class Solution01{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int sum1 = 1;
    int sum2 = 0;
    int [] dy = new int [100];


    public int solution01_Fibo(int n) throws IOException {

        if(n==1||n==2){
            return 1;
        }
        sum1++;
        return solution01_Fibo(n-1)+solution01_Fibo(n-2);
    }
    public void solution01_dynamic(int n) throws IOException{
        dy[0]=1;
        dy[1]=1;
        for(int i=2;i<n;i++) {
            dy[i] = dy[i - 1] + dy[i - 2];
            sum2++;
        }

    }


}