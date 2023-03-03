package easy;

import java.util.Scanner;

/**
 * @BelongsProject: AC-Winter
 * @BelongsPackage: easy
 * @Author: DownsXu
 * @Date: 2023-02-18 19:19
 * @Description: TODO
 */

public class A4862 {
    static final int N = 100010;
    static int[] a = new int[N];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        for (int i = 1; i<= m; i ++){
            int l = in.nextInt();
            int r = in.nextInt();
            add(l ,r);
        }

        for (int i = 1; i <= n; i ++){
            a[i] += a[i-1];
            if (a[i] == 0) {
                System.out.println(i + " " + 0);
                return;
            }
            if (a[i] > 1) {
                System.out.println(i + " " + a[i]);
                return;
            }
        }
        System.out.println("OK");
    }

    public static void add(int l, int r){
        a[l] ++;
        a[r+1] --;
    }
}
