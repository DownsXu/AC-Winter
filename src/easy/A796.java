package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A796 {
    static final int N = 1010;
    static int[][] s = new int[N][N];

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] str = in.readLine().split(" ");
        int n= Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        int q = Integer.parseInt(str[2]);

        for (int i = 1; i <= n; i ++){
            String[] str2 = in.readLine().split(" ");
            for (int j = 1; j <= m; j ++){
                s[i][j] = s[i-1][j] + s[i][j-1] - s[i-1][j-1] + Integer.parseInt(str2[j-1]);
            }
        }

        while (q -- != 0){
            String[] str3 = in.readLine().split(" ");
            int x1 = Integer.parseInt(str3[0]);
            int y1 = Integer.parseInt(str3[1]);
            int x2 = Integer.parseInt(str3[2]);
            int y2 = Integer.parseInt(str3[3]);

            int res = s[x2][y2] - s[x1-1][y2] - s[x2][y1-1] + s[x1-1][y1-1];
            System.out.println(res);
        }
    }
}
