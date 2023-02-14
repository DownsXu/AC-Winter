package medium;

import java.util.Scanner;

public class A100 {
    static final int N = 100010;
    static int[] a = new int[N];
    static int[] b = new int[N];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++){
            a[i] = in.nextInt();
            b[i] = a[i] - a[i-1];
        }

        long p = 0, q = 0;
        for (int i = 2; i <= n; i ++){
            if (b[i] > 0) p += b[i];
            else q -= b[i];
        }
        System.out.println(Math.min(p, q) + Math.abs(p-q));
        System.out.println(Math.abs(p-q) + 1);
    }
}
