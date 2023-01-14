package easy;

import java.util.Scanner;

/**
 * 01背包
 */

public class A2 {
    static int N = 1010;
    static int[] v = new int[N];
    static int[] w = new int[N];
    static int[] f = new int[N];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int val = in.nextInt();

        for(int i = 1; i <= n; i ++){
            v[i] = in.nextInt();
            w[i] = in.nextInt();
        }

        for(int i = 1; i <= n; i ++){
            for(int j = val; j >= 0; j --){
                if (j >= v[i]){
                    f[j] = Math.max(f[j], f[j-v[i]] + w[i]);
                }
            }
        }
        System.out.println(f[val]);
    }
}
