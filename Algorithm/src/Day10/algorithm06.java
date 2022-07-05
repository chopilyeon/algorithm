package Day10;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Solve {
    private int last  = 0;

    void solve(Queue<Integer> queue,String str) {
        Scanner sc = new Scanner(System.in);
        if (str.contains("push")) {
            queue.offer(Integer.valueOf(str.substring(5, str.length())));
            last = Integer.valueOf(str.substring(5, str.length()));
        } else if (str.equals("back")) {
            if (!queue.isEmpty()) {
                System.out.println(last);
            } else {
                System.out.println(-1);
            }
        } else if (str.equals("empty")) {
            if (queue.isEmpty()) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        } else if (str.equals("size")) {
            System.out.println(queue.size());
        } else if (str.equals("front")) {
            System.out.println((queue.isEmpty()) ? -1 : queue.peek());
        } else if (str.equals("pop")) {
            System.out.println((queue.isEmpty()) ? -1 : queue.poll());
        }
        sc.close();
    }


}


class algorithm06 {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        int num=Integer.parseInt(sc.nextLine());
        Solve solve = new Solve();
        for (int i = 0; i < num; i++) {
            solve.solve(queue, sc.nextLine());
        }
    }



}