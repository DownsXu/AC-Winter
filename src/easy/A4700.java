package easy;

import java.util.Arrays;
import java.util.Scanner;

public class A4700 {
    private static final int INF = 0x3f3f3f3f;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] v = new int[n], dp = new int[m + 1];
        for (int i = 0; i < n; ++i)
            v[i] = sc.nextInt();
        Arrays.fill(dp, 1, m + 1, INF);
        for (int i = 0; i < n; ++i)
            for (int j = m; j >= 0; --j)
                dp[j] = Math.min(dp[j], dp[Math.max(0, j - v[i])] + v[i]);
        System.out.println(dp[m]);
    }
}
