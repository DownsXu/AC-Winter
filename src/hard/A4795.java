package hard;

import java.util.Scanner;

public class A4795 {
    public static void main(String[] args) {
        int N = 100010;
        boolean[] r = new boolean[N];
        boolean[] c = new boolean[N];
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int a = 0, b = 0;

        for (int i = 1; i <= m; i ++){
            int x ,y;
            x = in.nextInt();
            y = in.nextInt();
            if (!r[x]){
                r[x] = true;
                a ++;
            }
            if (!c[y]){
                c[x] = true;
                b ++;
            }
            System.out.print((long)(n-a) * (n - b) + " ");
        }

    }
}
