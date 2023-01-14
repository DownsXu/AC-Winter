package easy;

import java.util.Scanner;

public class A4455 {
    static int n, m ,k;
    static int[] a = new int[100010];
    static int t, c;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        k = in.nextInt();

        while (n -- != 0){
            t = in.nextInt();
            c = in.nextInt();
            a[Math.max(t-c+1, 1)] ++;
            a[t+1] --;
        }
        for(int i = 1; i < a.length; i ++){
            a[i] += a[i-1];
        }

        while (m -- != 0){
            int q = in.nextInt();
            System.out.println(a[q + k]);
        }
    }
}
