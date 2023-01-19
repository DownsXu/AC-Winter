package easy;

import java.util.Scanner;

public class A798 {
    static final int N = 1010;
    static int [][] a = new int[N][N]; //前缀和数组
    static int [][] b = new int[N][N]; //差分数组
    static int n, m, q;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        q = in.nextInt();

        for (int i = 1; i <= n; i ++)
            for (int j = 1; j <= m; j ++)
            {
                a[i][j] = in.nextInt();
                insert(i, j, i, j, a[i][j]);
            }

        while (q -- != 0){
            int x1, x2, y1, y2, c;
            x1 = in.nextInt();
            y1 = in.nextInt();
            x2 = in.nextInt();
            y2 = in.nextInt();
            c = in.nextInt();
            insert(x1, y1, x2, y2, c);
        }

        for (int i = 1; i <=n; i ++){
            for (int j = 1; j <= m; j ++){
                a[i][j]=a[i][j-1]+a[i-1][j]-a[i-1][j-1]+b[i][j];
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }

    static void insert(int x1, int y1, int x2, int y2, int c){
        b[x1][y1] += c;
        b[x2+1][y1] -= c;
        b[x1][y2+1] -= c;
        b[x2+1][y2+1] += c;
    }
}
