package easy;

import java.util.Scanner;

public class A895 {
    static int N = 1010;
    static int[] a = new int[N];
    static int[] f = new int[N];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int res = 0;
        for (int i = 1; i <= n; i ++)
            a[i] = in.nextInt();

        for(int i = 1; i <= n; i ++){
            f[i] = 1;
            for(int j = 1; j < i; j ++){
                if (a[j] < a[i]){
                    f[i] = Math.max(f[i], f[j] + 1);
                }
            }
        }

        for(int i = 1; i < N; i ++){
            res = Math.max(res, f[i]);
        }

        System.out.println(res);
    }
}
