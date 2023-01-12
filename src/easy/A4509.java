package easy;

import java.util.Scanner;

public class A4509 {
    static int N = 1010;
    static int[] a = new int[N];
    static int n;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int sum = 0;
        double ave = 0;
        for(int i = 1; i <= n; i ++){
            a[i] = in.nextInt();
            sum += a[i];
        }
        ave = (double) sum/n;
        double p = 0;
        for(int i = 1; i <= n; i ++){
            p += (a[i]-ave)*(a[i]-ave);
        }
        p /= n;

        for(int i = 1;i <= n; i ++){
            double k = (a[i] - ave)/Math.sqrt(p);
            System.out.println(k);
        }
    }
}
