package easy;

import java.util.Arrays;
import java.util.Scanner;

public class A4700 {
    public static void main(String[] args) {
        int N = 33;
        int[] a = new int[N];
        int[] f = new int[N];
        int sum  = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        for(int i = 1; i <= n; i ++){
            a[i] = in.nextInt();
            sum += a[i];
        }

        int m = sum - k;

        for(int i = 1; i <= n; i ++){
            for(int j = m; j >= a[i]; j --){
                f[j] = Math.max(f[j], f[j-a[i]] + a[i]);
            }
        }
        System.out.println(f[m]);
    }
}
