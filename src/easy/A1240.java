package easy;

import java.util.Scanner;

/**
 * @BelongsProject: AC-Winter
 * @BelongsPackage: easy
 * @Author: DownsXu
 * @Date: 2023-02-17 12:25
 * @Description: TODO
 */

public class A1240 {
    static final int N = 100010;
    static int[] a = new int[N];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i ++) a[i] = in.nextInt();

        int dep = 1;
        int res = 1;
        long max = -0x3f3f3f;
        for (int i = 1; i <= n; i *= 2){
            long s = 0;
            for (int j = i; j <= (2 * i - 1) && j <= n; j ++){
                s += a[j];
            }
            if (max < s){
                max = s;
                res = dep;
            }
            dep ++;
        }
        System.out.println(res);
    }
}
