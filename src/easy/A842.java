package easy;

import java.util.Scanner;

public class A842 {
    static int n;
    static int N = 10;
    static int[] path = new int[N];
    static boolean[] st = new boolean[N];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        dfs(1);
    }

    static void dfs(int u){
        if(u > n){
            for(int i = 1; i <= n; i ++) System.out.print(path[i] + " ");
            System.out.println();
        }

        for(int i = 1; i <= n; i ++){
            if(!st[i]){
                path[u] = i;
                st[i] = true;
                dfs(u + 1);
                st[i] = false;
            }
        }
    }
}
