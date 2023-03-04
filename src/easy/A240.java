package easy;

import java.io.*;

/**
 * @BelongsProject: AC-Winter
 * @BelongsPackage: easy
 * @Author: DownsXu
 * @Date: 2023-03-03 14:12
 * @Description: TODO
 */

/**
 * 到根节点的距离为d， 将d模三
 * 余0， 表示为同一类
 * 余1， 表示被根结点吃
 * 余2， 表示吃根结点
 */
public class A240 {
    static final int N = 50010;
    static int[] p = new int[N];
    static int[] d = new int[N];
    static int n, k;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        String[] str = in.readLine().split(" ");
        n = Integer.parseInt(str[0]);
        k = Integer.parseInt(str[1]);

        for (int i = 1; i <= n; i ++) p[i] = i;

        int res = 0;
        while (k -- > 0) {
            str = in.readLine().split(" ");
            int op = Integer.parseInt(str[0]);
            int a = Integer.parseInt(str[1]);
            int b = Integer.parseInt(str[2]);

            if (a > n || b > n) res ++;
            else {
                int pa = find(a), pb = find(b);
                if (op == 1){
                    if (pa == pb && (d[a] - d[b]) % 3 != 0) res ++;
                    else if(pa != pb){
                        p[pa] = pb;
                        d[pa] = d[b] - d[a];
                    }
                }else {
                    if(pa == pb && (d[a] - d[b] - 1) % 3 != 0) res ++;
                    else if (pa != pb){
                        p[pa] = pb;
                        d[pa] = d[b] + 1 - d[a];
                    }
                }
            }
        }
        out.println(res);
        in.close();
        out.close();
    }

    public static int find(int x){
        if (p[x] != x){
            int t = find(p[x]);
            d[x] += d[p[x]];
            p[x] = t;
        }
        return p[x];
    }
}
