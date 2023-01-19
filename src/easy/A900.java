package easy;

import java.util.Scanner;

public class A900 {
    static final int mod = (int)1E9 + 7;
    static final int N = 1010;
    static int[][] f = new int[N][N];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =  in.nextInt();
        f[1][1] = 1;
        for (int i = 2; i <= n; i ++)
            for (int j = 1; j <= i; j ++ ){
                f[i][j] = (f[i-1][j-1] + f[i-j][j]) % mod;
            }

        int res = 0;
        for (int i = 1; i <= n ;i ++) res = (f[n][i] + res) % mod;
        System.out.println(res);
    }
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        f[0] = 1;
//        for (int i = 1; i <= n; i ++)
//            for (int j = i; j <= n; j ++){
//                    f[j] = (f[j-i] + f[j]) % mod;
//            }
//        System.out.println(f[n]);
//    }
}
