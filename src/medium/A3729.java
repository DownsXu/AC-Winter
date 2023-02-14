package medium;

import java.util.Arrays;
import java.util.Scanner;

public class A3729 {
    static int N = 200010;
    static int[] a = new int[N];
    static int[] b = new int[N];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t -- != 0){
            Arrays.fill(b, 0);
            int len = in.nextInt();

            for (int i = 1; i <= len; i ++){
                a[i] = in.nextInt();
                add(Math.max(i-a[i]+1, 0), i);
            }

            for (int i = 1; i <= len; i ++){
                b[i] += b[i-1];
                if (b[i] >= 1) System.out.print(1 + " ");
                else System.out.print(b[i] + " ");
            }
            System.out.println();
        }
    }

    public static void add(int l, int r){
        b[l] += 1;
        b[r+1] -= 1;
    }
}
