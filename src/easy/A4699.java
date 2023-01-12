package easy;

import java.util.Scanner;

public class A4699 {
    public static void main(String[] args) {
        int N = 25;
        int[] a = new int[N];
        int[] c = new int[N];
        c[0] = 1;
        int n, m;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        for(int i = 1; i <= n; i ++){
            a[i] = in.nextInt();
            c[i] = c[i-1] * a[i];
        }
        int k = 0;
        for(int i = 1; i <= n; i ++){
            int b = (m%c[i] - k)/c[i-1];
            System.out.print(b + " ");
            k += c[i-1] * b;
        }
    }
}
