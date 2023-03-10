package easy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A798 {

    static final int N = 1010;
    static int[][] a = new int[N][N]; //前缀和数组
    static int[][] b = new int[N][N]; //差分数组
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int n, m, q;
        String[] str1 = in.readLine().split(" ");
        n = Integer.parseInt(str1[0]);
        m = Integer.parseInt(str1[1]);
        q = Integer.parseInt(str1[2]);

        for (int i = 1; i <= n; i ++){
            String[] str2 = in.readLine().split(" ");
            for (int j = 1; j <= m; j ++){
                a[i][j] = Integer.parseInt(str2[j-1]);
                insert(i, j, i, j, a[i][j]);
            }
        }

        while (q -- != 0){
            String[] str3 = in.readLine().split(" ");
            int x1 = Integer.parseInt(str3[0]);
            int y1 = Integer.parseInt(str3[1]);
            int x2 = Integer.parseInt(str3[2]);
            int y2 = Integer.parseInt(str3[3]);
            int c = Integer.parseInt(str3[4]);
            insert(x1, y1, x2, y2, c);
        }

        for (int i = 1; i <= n; i ++){
            for (int j = 1; j <= m; j ++){
                b[i][j] += b[i-1][j] + b[i][j-1] - b[i-1][j-1];
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void insert(int x1, int y1, int x2, int y2, int c){
        b[x1][y1] += c;
        b[x2 + 1][y1] -= c;
        b[x1][y2 + 1] -= c;
        b[x2 + 1][y2 + 1] += c;
    }
}
