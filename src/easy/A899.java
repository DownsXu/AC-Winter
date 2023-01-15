package easy;

import java.util.Scanner;

public class A899 {
    static int N = 1010;
    static int[][] f = new int[N][N];
    static int n ,m;
    public static void main(String[] args) {


        String[] s = new String[N];
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        for (int i = 1; i <= n ;i ++)
            s[i] = in.next();

        while (m -- != 0){
            int res = 0;
            String str = in.next();
            int l = in.nextInt();
            for (int i = 1; i <= n; i ++)
                if (dp(s[i], str) <= l) res ++;
            System.out.println(res);
        }
    }

    static int dp(String s1, String s2) {
        char[] a = new char[N];
        char[] b = new char[N];
        for (int i = 1; i <= s1.length(); i ++) a[i] = s1.charAt(i-1);
        for (int i = 1; i <= s2.length(); i ++) b[i] = s2.charAt(i-1);

        for (int i = 0; i <= s1.length(); i ++) f[i][0] = i;
        for (int i = 0; i <= s2.length(); i ++) f[0][i] = i;

        for (int i = 1; i <= s1.length(); i ++)
            for (int j = 1; j <= s2.length(); j ++){
                f[i][j] = Math.min(f[i-1][j] + 1, f[i][j-1] + 1);
                if (a[i] == b[j]) f[i][j] = Math.min(f[i][j], f[i-1][j-1]);
                else f[i][j] = Math.min(f[i][j], f[i-1][j-1] + 1);
            }
        return f[s1.length()][s2.length()];
    }
}
