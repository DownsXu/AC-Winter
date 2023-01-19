package easy;

import java.util.Scanner;

public class A1230 {
    static final int N = 100010;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] s = new int[N];
        int[] cnt = new int[N];
        for (int i = 1; i <= n; i ++) {
            s[i] = in.nextInt();
            s[i] = (s[i-1] + s[i]) % k;
        }
        long res = 0;
        cnt[0] = 1;
        for (int i = 1 ;i <= n; i ++){
            res += cnt[s[i]];
            cnt[s[i]] ++;
        }
        System.out.println(res);
    }
}
