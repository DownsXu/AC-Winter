package hard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A3956 {
    static final int N = 100010;
    static int[] a = new int[N];
    static int[] s = new int[N];
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(in.readLine());
        String[] str = in.readLine().split(" ");
        for (int i = 1; i <= n; i ++) {
            a[i] = Integer.parseInt(str[i-1]);
            s[i] = s[i-1] + a[i];
        }

        if (n < 3 || s[n] % 3 != 0) System.out.println(0);
        long res = 0, cnt = 0;
        long q = s[n]/3;
        for (int i = 2; i <= n - 1; i ++){
            if (s[i-1] == q) cnt ++;
            if (s[i] == 2 * q) res += cnt;
        }
        System.out.println(res);
    }
}
