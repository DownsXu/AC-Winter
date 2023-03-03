package easy;

import java.io.*;

/**
 * @BelongsProject: AC-Winter
 * @BelongsPackage: easy
 * @Author: DownsXu
 * @Date: 2023-03-02 12:19
 * @Description: TODO
 */

public class A836 {
    static final int N = 100010;
    static int[] p = new int[N];
    static int n, m;
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

        String[] str = in.readLine().split(" ");
        n = Integer.parseInt(str[0]);
        m = Integer.parseInt(str[1]);

        for (int i = 1 ;i <= n; i ++) p[i] = i;

        while (m -- > 0){
            str = in.readLine().split(" ");
            String op = str[0];
            int a = Integer.parseInt(str[1]);
            int b = Integer.parseInt(str[2]);
            if (op.equals("M")) p[find(a)] = find(b);
            if (op.equals("Q")){
                if (find(a) == find(b)) out.println("Yes");
                else out.println("No");
            }
        }
        in.close();
        out.close();
    }

    private static int find(int x) {
        if (p[x] != x) p[x] = find(p[x]);
        return p[x];
    }
}
