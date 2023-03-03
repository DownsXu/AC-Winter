package hard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @BelongsProject: AC-Winter
 * @BelongsPackage: hard
 * @Author: DownsXu
 * @Date: 2023-02-18 19:42
 * @Description: TODO
 */
public class A4863 {
    static final int N = 100010;
    int[][] a = new int[N][N];
    static int n, m;
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = in.nextInt();
        while (t -- != 0){
            n = in.nextInt();
            m = in.nextInt();
            int max = -1;
            String[] str = bf.readLine().split(" ");
            for (int i = 0; i < n; i ++){
                max = Math.max(max, Integer.parseInt(str[i]));
            }

        }
    }
}
