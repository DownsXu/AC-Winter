package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A797 {
    static final int N = 100010;
    static int[] a = new int[N]; //前缀和数组
    static int[] b = new int[N]; //差分数组
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] str = in.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        String[] str1 = in.readLine().split(" ");
        for (int i = 1; i <= n; i ++){
            a[i] = Integer.parseInt(str1[i-1]);
            b[i] = a[i] - a[i-1];
        }

        while (m -- != 0){
            String[] str2 = in.readLine().split(" ");
            int l = Integer.parseInt(str2[0]);
            int r = Integer.parseInt(str2[1]);
            int c = Integer.parseInt(str2[2]);
            b[l] += c;
            b[r+1] -= c;
        }

        for (int i = 1; i <=n; i ++){
            a[i] = a[i-1] + b[i];
            System.out.print(a[i] + " ");
        }
    }
}
