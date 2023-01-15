package easy;

import java.util.Scanner;

public class A4794 {
    public static void main(String[] args) {
        int N = 25;
        int[] a = new int[N];
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = 0, bi = 0, bk = 0;

        for (int i = 1; i <= n; i ++){
            a[i] = in.nextInt();
        }

        for (int i = 1; i <= n; i ++){
            if (i % 3 == 1) c += a[i];
            if (i % 3 == 2) bi += a[i];
            if (i % 3 == 0) bk += a[i];
        }

        int m = Math.max(c, Math.max(bi, bk));
        if (m == c) System.out.println("chest");
        if (m == bi) System.out.println("biceps");
        if (m == bk) System.out.println("back");
    }
}
