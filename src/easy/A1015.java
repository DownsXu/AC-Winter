package easy;

import java.util.Arrays;
import java.util.Scanner;

public class A1015 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int N = 110;
        int[][] w = new int[N][N];
        int[][] f= new int[N][N];
        int r, c;
        while (t -- != 0){
            r = in.nextInt();
            c = in.nextInt();
            for(int i = 1; i <= r;i ++){
                for (int j = 1; j <= c; j ++){
                    w[i][j] = in.nextInt();
                }
            }

            for(int i = 1; i <= r; i ++){
                for (int j = 1; j <= c; j ++){
                    f[i][j] = Math.max(f[i-1][j], f[i][j-1]) + w[i][j];
                }
            }
            System.out.println(f[r][c]);
        }
    }
}
