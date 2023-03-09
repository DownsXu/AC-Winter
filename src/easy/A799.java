package easy;

import java.io.*;

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
    static int[] s = new int[N];
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(in.readLine());
        String[] str = in.readLine().split(" ");
        int res = -1;
        for (int i = 1, j = 1; i <= n; i ++){
            a[i] = Integer.parseInt(str[i-1]);
            s[a[i]] ++;
            while (s[a[i]] > 1){
                s[a[j]] --;
                j ++;
            }
            res = Math.max(res, i - j + 1);
        }
        out.println(res);
        out.close();
    }
}
