package easy;

import java.io.*;
import java.nio.Buffer;

/**
 * @BelongsProject: AC-Winter
 * @BelongsPackage: easy
 * @Author: DownsXu
 * @Date: 2023-03-03 11:58
 * @Description: TODO
 */

public class A837 {
    static final int N = 100010;
    static int[] p = new int[N];
    static int[] cnt = new int[N];
    static int n, m;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        String[] str = in.readLine().split(" ");
        n = Integer.parseInt(str[0]);
        m = Integer.parseInt(str[1]);

        for (int i = 1;i <= n; i ++) {
            p[i] =i;
            cnt[i] = 1;
        }
        while (m -- > 0){
            str = in.readLine().split(" ");
            String op = str[0];
            if(op.equals("C")){
                int a = Integer.parseInt(str[1]);
                int b = Integer.parseInt(str[2]);
                if(find(a) == find(b)) continue;
                cnt[find(b)] += cnt[find(a)];
                p[find(a)] = p[b];
            }else if (op.equals("Q1")){
                int a = Integer.parseInt(str[1]);
                int b = Integer.parseInt(str[2]);
                out.println(find(a) == find(b) ? "Yes" : "No");
            }else {
                int a = Integer.parseInt(str[1]);
                out.println(cnt[find(a)]);
            }
        }

        in.close();
        out.close();

    }

    private static int find(int x){
        if (p[x] != x) p[x] = find(p[x]);
        return p[x];
    }
}
