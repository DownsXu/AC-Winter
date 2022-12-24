package easy;

import java.io.*;

public class A94 {
    static int N = 10;
    static int[] st = new int[N];
    static int[] path = new int[N];
    static int n = 0;

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(in.readLine());
        dfs(1);
        in.close();
        out.flush();
        out.close();
    }

    public static void dfs(int u) throws IOException {
        if(u > n){
            for(int i = 1; i <= n; i ++){
                out.write(path[i] + " ");
            }
            out.write("\n");
        }

        for(int i = 1; i <= n; i ++){
            if(st[i] == 0){
                st[i] = 1;
                path[u] = i;
                dfs(u + 1);
                st[i] = 0;
            }
        }
    }
}
