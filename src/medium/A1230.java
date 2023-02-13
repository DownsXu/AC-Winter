package medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1230 {
    static final int N = 100010;
    static int[] s = new int[N];
    static int[] cnt = new int[N];
    static int n, k;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] str = in.readLine().split(" ");
        n = Integer.parseInt(str[0]);
        k = Integer.parseInt(str[1]);

        for (int i = 1; i <= n; i ++){
            s[i] = (s[i-1] + Integer.parseInt(in.readLine())) % k;
        }

        long res = 0;
        cnt[0] = 1; //余数为0的区间本身就为k倍区间
        for (int i = 1; i <= n; i ++){
            res += cnt[s[i]];
            cnt[s[i]] ++;
        }
        System.out.println(res);
        in.close();
    }
}
