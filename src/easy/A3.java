package easy;

import java.util.Scanner;

/**
 * 完全背包
 */

public class A3 {
    public static void main(String[] args) {
            int N = 1010;
            int n, m;
            int[] v = new int[N];
            int[] w = new int[N];
            int[][] f = new int[N][N];

        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();

        for (int i = 1; i <= n; i ++){
            v[i] = in.nextInt();
            w[i] = in.nextInt();
        }

        for (int i = 1; i <= n;i ++){
            for (int j = 0; j <= m; j ++){
                f[i][j] = f[i-1][j];
                if (j >= v[i]){
                    f[i][j] = Math.max(f[i][j], f[i][j-v[i]] + w[i]);
                }
            }
        }

        System.out.println(f[n][m]);
    }
}
