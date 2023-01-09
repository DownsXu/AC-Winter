package easy;

import java.util.Scanner;

public class A4454 {
    static int N = 100010;
    static boolean[] st = new boolean[N];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int res = 0;
        for(int i = 1; i <= k; i ++){
            int l, r;
            l = in.nextInt();
            r = in.nextInt();
            if(st[r] == false && r != 0) res ++;
            st[l] = true;
        }
        System.out.println(res);
    }
}
