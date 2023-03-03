package easy;

import java.io.*;

/**
 * @BelongsProject: AC-Winter
 * @BelongsPackage: easy
 * @Author: DownsXu
 * @Date: 2023-02-27 19:38
 * @Description: TODO
 */

public class A1249 {
    static int n, m, q;
    static final int N = 20010;
    static int[] p = new int[N];
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        String[] str = in.readLine().split(" ");
        n = Integer.parseInt(str[0]);
        m = Integer.parseInt(str[1]);

        for (int i = 1; i <= n; i ++) p[i] = i;
        while (m -- > 0){
            str = in.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            p[find(a)] = find(b);
        }

        int q = Integer.parseInt(in.readLine());
        while (q -- > 0){
            str = in.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            if (find(a) == find(b)) out.println("Yes");
            else out.println("No");
        }
        in.close();
    }

    public static int find(int x){
        if (p[x] != x) p[x] = find(p[x]);
        return p[x];
    }
}
