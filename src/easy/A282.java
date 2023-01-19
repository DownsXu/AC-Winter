package easy;

import java.util.Scanner;

public class A282 {
    static int N = 310;
    static int n = 0;
    static int[] s = new int[N];
    static int[][] f = new int[N][N];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 1; i <= n; i ++) {
            s[i] = in.nextInt();
            s[i] += s[i-1];
        }

        for (int len = 2; len <= n; len++) {
            for (int i = 1; i + len - 1 <= n; i ++){
                int j = i + len - 1;
                f[i][j] = 0x3f3f3f3f;
                for (int k = i; k < j ; k ++){
                    f[i][j] = Math.min(f[i][j], f[i][k] + f[k+1][j] + s[j] - s[i-1]);
                }
            }
        }
        System.out.println(f[1][n]);
    }
}
