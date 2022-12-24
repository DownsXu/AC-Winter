package easy;

import java.util.Scanner;

public class A92 {
    static int N = 20;
    static int[] st = new int[N];
    static int n = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        dfs(1);
    }

    public static void dfs(int u) {

        if(u > n){
            for(int i = 1; i <= n; i ++){
                if(st[i] == 1) System.out.print(i);
            }
            System.out.println();
            return;
        }

        st[u] = 1;
        dfs(u+1);
        st[u] = 0;

        st[u] = 2;
        dfs(u+1);
        st[u] = 0;
    }
}
