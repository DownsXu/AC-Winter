package easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @BelongsProject: AC-Winter
 * @BelongsPackage: easy
 * @Author: DownsXu
 * @Date: 2023-02-16 11:55
 * @Description: TODO
 */

public class A799 {
    static final int N = 100010;
    static int[] a = new int[N];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1;i <= n; i ++){
            a[i] = in.nextInt();
        }

        // 9 3 6 9 5 10 1 2 3 9 - >1 2 3 3 5 6 9 9 9 10
        Arrays.sort(a, 1, n);
        int res = n;
        for (int i = 1; i <= n; i ++){
            if (a[i] != a[i+1]) continue;
            int j = i + 1;
            while (j < n && a[j] == a[i]) j ++;
            res -= (j - i + 1);
            i = j;
        }
        System.out.println(res);
    }
}
