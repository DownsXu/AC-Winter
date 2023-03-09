package easy;

import java.io.*;
import java.util.Scanner;

/**
 * @BelongsProject: AC-Winter
 * @BelongsPackage: easy
 * @Author: DownsXu
 * @Date: 2023-03-05 21:23
 * @Description: TODO
 */

public class A835 {
    static final int N = 100010;
    static int[][] son = new int[N][26];
    static int[] cnt = new int[N];
    static int idx = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(in.readLine());
        while (n -- > 0){
            String[] str = in.readLine().split(" ");
            String  op = str[0];
            char[] ch = str[1].toCharArray();
            if (op.equals("I")){
                insert(ch);
            }
            if (op.equals("Q")){
                out.println(query(ch));
            }
        }
        out.close();
    }

    public static void insert(char[] ch){
        int p = 0;
        for (char val : ch){
            int u = val - 'a';
            if (son[p][u] == 0) son[p][u] = ++ idx;
            p = son[p][u];
        }
        cnt[p] ++;
    }

    public static int query(char[] ch){
        int p = 0;
        for (char val : ch){
            int u = val - 'a';
            if (son[p][u] != 0) p = son[p][u];
            else return 0;
        }
        return cnt[p];
    }
}
