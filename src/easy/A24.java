package easy;

import java.util.LinkedList;
import java.util.Scanner;

public class A24 {
    public static void main(String[] args) {
        int k, row, col;
        Scanner in = new Scanner(System.in);
        k = in.nextInt();
        row = in.nextInt();
        col = in.nextInt();
        System.out.println(movingCount(k, row, col));
    }

    private static class Node{
        int x;
        int y;
        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    private static boolean[][] st = new boolean[55][55];
    private static final int[][] t = {{-1,0}, {0,1}, {1,0}, {0,-1}};

    public static int movingCount(int threshold, int rows, int cols)
    {

        if (rows == 0 || cols == 0) return 0;
        LinkedList<Node> l = new LinkedList<>();
        l.add(new Node(0, 0));
        st[0][0] = true;
        int res = 0;

        while (!l.isEmpty()){
            Node node = l.poll();
            res ++;

            for(int i = 0; i < 4; i ++){
                int fx = node.x + t[i][0];
                int fy = node.y + t[i][1];
                if(fx >= 0 && fy >= 0 && fx < rows && fy < cols &&
                        get_sum(fx, fy) <= threshold && !st[fx][fy]){
                    l.add(new Node(fx, fy));
                    st[fx][fy] = true;
                }
            }
        }
        return res;
    }

    public static int get_sum(int x, int y){
        int sum = 0;
        while (x != 0){
            sum += x % 10;
            x /= 10;
        }
        while (y != 0){
            sum += y % 10;
            y /= 10;
        }
        return sum;
    }
}
