package easy;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class A93{
    static int n, m;
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[] path = new int[30];
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        n = scan.nextInt();
        m = scan.nextInt();
        dfs(1, 1);
        out.flush();
        out.close();
    }

    static public void dfs(int u, int start) throws IOException {

        if (u + n - start < m) return;  // 剪枝

        if(u > m){
            for(int i = 1; i <= m; i ++){
                out.write(path[i] + " ");
            }
            out.write("\n");
        }

        for(int i = start; i <= n; i ++){
                path[u] = i;
                dfs(u + 1, i + 1);
                path[u] = 0;
        }
    }
}
