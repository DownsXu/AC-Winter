package easy;

import java.util.Scanner;

/**
 * 后缀表达式
 */
public class A4274 {

    static int N = 25;
    static String[] str = new String[N]; //val
    static int[] sl = new int[N]; // 左儿子
    static int[] sr = new int[N]; //右儿子
    static boolean[] st = new boolean[N]; //是否为根节点

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i = 1; i <= n; i ++){
            str[i] = scan.next();
            sl[i] = scan.nextInt();
            sr[i] = scan.nextInt();
            if(sl[i] != -1) st[sl[i]] = true;
            if(sr[i] != -1) st[sr[i]] = true;
        }

        int root = 0;
        for(int i = 1; i <= n; i ++)
            if(!st[i]) root = i;

        dfs(root);
        System.out.println();
    }

    public static void dfs(int u){
        if (u == -1) return;
        System.out.print("(");
        if (sl[u] == -1 && sr[u] == -1) System.out.print(str[u]);
        else if (sl[u] == -1 && sr[u] != -1){
            System.out.print(str[u]);
            dfs(sr[u]);
        }else {
            dfs(sl[u]);
            dfs(sr[u]);
            System.out.print(str[u]);
        }
        System.out.print(")");
    }
}
