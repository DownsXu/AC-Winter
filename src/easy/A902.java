package easy;

import java.util.Scanner;

public class A902 {
    public static void main(String[] args) {
        int N = 1010;
        int[][] f = new int[N][N];
        char[] a = new char[N];
        char[] b = new char[N];

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s1 = in.next();
        for (int i = 1; i <= n; i++) {
            a[i] = s1.charAt(i-1);
        }
        int m = in.nextInt();
        String s2 = in.next();
        for (int i = 1; i <= m; i ++){
            b[i] = s2.charAt(i-1);
        }

        for (int i = 0; i <= n; i ++) f[i][0] = i;
        for (int i = 0; i <= m; i ++) f[0][i] = i;

        for (int i = 1 ;i <= n;i ++)
            for (int j = 1; j <= m; j ++){
                f[i][j] = Math.min(f[i-1][j] + 1, f[i][j-1] + 1);
                if (a[i] != b[j]) f[i][j] = Math.min(f[i][j], f[i-1][j-1] + 1);
                else f[i][j] = Math.min(f[i][j], f[i-1][j-1]);
            }

        System.out.println(f[n][m]);
    }
}
