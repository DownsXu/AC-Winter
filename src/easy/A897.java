package easy;

import java.util.Scanner;

/**
 *  最长公共子序列
 */

public class A897 {
    public static void main(String[] args) {
        int n, m;
        char[] a = new char[1010], b = new char[1010];
        int[][] f = new int[1010][1010];
        String s1 = null, s2 = null;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        s1 = in.next();
        s2 = in.next();

        for (int i = 1; i <= s1.length(); i++) {
            a[i] = s1.charAt(i-1);
        }
        for (int i = 1; i <= s2.length(); i++) {
            b[i] = s2.charAt(i-1);
        }

        for (int i = 1; i <= n;  i++){
            for (int j = 1; j <= m; j ++){
                f[i][j] = Math.max(f[i][j-1], f[i-1][j]);
                if (a[i] == b[j]) f[i][j] = Math.max(f[i][j], f[i-1][j-1] + 1);
            }
        }
        System.out.println(f[s1.length()][s2.length()]);
    }
}
