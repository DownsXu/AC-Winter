package easy;

import java.util.Scanner;

/**
 * 1 全排列
 * 2 划分
 * 3 判断
 */

public class A1209 {
    static int n;
    static int N = 10;
    static int path[] = new int[N];
    static int st[] = new int[N];
    static int res = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        dfs(1);
        System.out.print(res);
    }

    static public void dfs(int u){
        if(u > 9){
            for(int i = 1; i <= 7; i ++){
                for(int j = i+1; j <= 8; j ++){
                    int a = get(1, i);
                    int b = get(i+1, j);
                    int c= get(j+1, 9);
                    if(check(a, b, c)) res ++;
                }
            }
        }

        for(int i = 1; i <= 9; i++){
            if(st[i] == 0){
                path[u] = i;
                st[i] = 1;
                dfs(u+1);
                st[i] = 0;
            }
        }
    }

    static public int get(int l, int r){
        int m = 0;
        for(int i = l; i <= r; i ++){
            m = m*10 + path[i];
        }
        return m;
    }

    static public boolean check(int a, int b, int c){
        if (n*c-a*c==b) return true;
        return false;
    }
}
