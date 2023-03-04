package easy;

import java.io.*;
/**
 * @BelongsProject: AC-Winter
 * @BelongsPackage: easy
 * @Author: DownsXu
 * @Date: 2023-03-04 10:15
 * @Description: TODO
 */

public class A238 {
    static final int N  = 30010;
    static int[] p = new int[N];
    static int[] d = new int[N];
    static int[] s = new int[N];

    public static int find(int x){
        if (p[x] != x){
            int u = find(p[x]);
            d[x] += d[p[x]];
            p[x] = u;
        }
        return p[x];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(in.readLine());
        for (int i = 1; i < N; i ++){
            p[i] = i;
            s[i] = 1;
        }

        while (n -- > 0){
            String[] str = in.readLine().split(" ");
            String op = str[0];
            int x = Integer.parseInt(str[1]);
            int y = Integer.parseInt(str[2]);
            int px = find(x), py = find(y);
            if (op.equals("M")){
                if(px != py){
                    p[px] = py;
                    d[px] = s[py];
                    s[py] += s[px];
                }
            }else {
                if (px != py) out.println(-1);
                else {
                    out.println(Math.max(0, Math.abs(d[x]-d[y])-1));
                }
            }
        }
    }
}
