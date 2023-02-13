package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A99 {
    static final int N = 5010;
    static int[][] s = new int[N][N];
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] str = in.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int R = Integer.parseInt(str[1]);
        R = Math.min(R, 5001);

        for (int i = 1 , x, y, w; i <= n; i ++){
            String[] str2 = in.readLine().split(" ");
            x = Integer.parseInt(str2[0]);
            y = Integer.parseInt(str2[1]);
            w = Integer.parseInt(str2[2]);
            x ++; y ++;
            s[x][y] += w;
        }

        for (int i = 1; i <= 5001; i ++)
            for (int j = 1; j <= 5001; j ++)
                s[i][j] += s[i-1][j] + s[i][j-1] - s[i-1][j-1];

        int res = 0;
        for (int i = R; i <= 5001; i ++)
            for (int j = R; j <= 5001; j ++)
                res = Math.max(res, s[i][j] - s[i-R][j] - s[i][j-R] + s[i-R][j-R]);

        System.out.println(res);
    }
}
