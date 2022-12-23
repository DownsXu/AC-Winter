package easy;

import java.io.IOException;
import java.util.Scanner;

/**
 * #15. 生活大爆炸版石头剪刀布(UOJ)
 */

public class U15 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int[][] vs = new int[][]{{0,0,1,1,0},{1,0,0,1,0},{0,1,0,0,1},{0,0,1,0,1},{1,1,0,0,0}};
        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int[] ta = new int[210]; int[] tb = new int[210];
        for(int i = 0; i <  a; i ++) ta[i] = scan.nextInt();
        for(int i = 0; i <  b; i ++) tb[i] = scan.nextInt();

        int ra = 0;
        int rb = 0;

        for(int i = 0; i < n ; i ++){
            ra += vs[ta[i%a]][tb[i%b]];
            rb += vs[tb[i%b]][ta[i%a]];
        }
        System.out.println(ra + " " + rb);
    }
}
