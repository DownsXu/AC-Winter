package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @BelongsProject: AC-Winter
 * @BelongsPackage: easy
 * @Author: DownsXu
 * @Date: 2023-02-16 21:56
 * @Description: TODO
 */

public class A2816 {
    static final int N = 100010;
    static int[] a = new int[N];
    static int[] b = new int[N];
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] str = in.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        String[] str1 = in.readLine().split(" ");
        String[] str2 = in.readLine().split(" ");
        for (int i = 1; i <= n; i ++){
            a[i] = Integer.parseInt(str1[i-1]);
        }
        for (int i = 1; i <= m; i ++){
            b[i] = Integer.parseInt(str2[i-1]);
        }

        int i = 1;
        for (int j = 1; j <= m; j ++){
            if (i <= n && a[i] == b[j]) i ++;
        }

        if (i == n+1) System.out.println("Yes");
        else System.out.println("No");
        in.close();
    }
}
