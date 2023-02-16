package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @BelongsProject: AC-Winter
 * @BelongsPackage: easy
 * @Author: DownsXu
 * @Date: 2023-02-16 21:23
 * @Description: TODO
 */

public class A800 {
    static final int N = 100010;
    static int[] a = new int[N];
    static int[] b = new int[N];
    static int n, m, x;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] s = in.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);
        x = Integer.parseInt(s[2]);
        String[] str1 = in.readLine().split(" ");
        String[] str2 = in.readLine().split(" ");

        for (int i = 1; i <= n; i ++){
            a[i] = Integer.parseInt(str1[i-1]);
        }
        for (int i = 1; i <= m; i ++){
            b[i] = Integer.parseInt(str2[i-1]);
        }

        for (int i = 1; i <= n; i ++){
            int res = search(x - a[i]);
            if(res != -1) {
                i = i - 1;
                System.out.println(i + " " + (res-1));
                return;
            }
        }
    }

    public static int search(int q){
        int l = 1, r = m;
        while (l < r){
            int mid = l + r >> 1;
            if (b[mid] >= q) r = mid;
            else l = mid + 1;
        }
        if (b[l] == q) return l;
        else return -1;
    }
}
