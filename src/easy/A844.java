package easy;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * @BelongsProject: AC-Winter
 * @BelongsPackage: easy
 * @Author: DownsXu
 * @Date: 2023-03-09 22:37
 * @Description: TODO
 */

public class A844 {
    static final int N = 110;
    static int[][] g =  new int[N][N]; //图上每个点的值
    static int[][] d = new int[N][N]; //每个点到起点的距离
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};
    static boolean[][] st = new boolean[N][N];
    static int n, m;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

        String[] str = in.readLine().split(" ");
        n = Integer.parseInt(str[0]);
        m = Integer.parseInt(str[1]);

        for (int i = 1; i <= n; i ++){
            str = in.readLine().split(" ");
            for (int j = 1; j <= m; j ++){
                g[i][j] = Integer.parseInt(str[j-1]);
            }
        }

        out.println(bfs());
        out.close();
    }

    static int bfs(){
        LinkedList<PII> q = new LinkedList<>();
        q.add(new PII(1, 1));
        d[1][1] = 0;
        st[1][1] = true;
        while (!q.isEmpty()){
            PII top = q.poll();
            for (int i = 0; i < 4; i ++){
                int nx = top.x + dx[i];
                int ny = top.y + dy[i];
                if (nx >= 1 && nx <= m && ny >= 1 && ny <= n && g[nx][ny] == 0 && !st[nx][ny]){
                    q.add(new PII(nx, ny));
                    d[nx][ny] = d[top.x][top.y] + 1;
                    st[nx][ny] = true;
                }
            }
        }
        return d[n][m];
    }
}

class PII{
    int x, y;

    public PII(int x, int y) {
        this.x = x;
        this.y = y;
    }
}


