package easy;

import java.util.Arrays;
import java.util.Scanner;

public class A4655 {
    public static void main(String[] args) {
        int N = 100010;
        int[] w = new int[N];
        int[] c = new int[N];
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1;i <= n; i ++){
            w[i] = in.nextInt();
        }
        int m = in.nextInt();
        while(m -- != 0){
            int l = in.nextInt();
            int r = in.nextInt();
            c[l] ++;
            c[r + 1] --;
        }
        for(int i = 1; i <= n;i ++){
            c[i] += c[i-1];
        }
        long sum1 = 0;
        for(int i = 1; i <= n; i ++){
            sum1 += (long) w[i] * c[i];
        }
        Arrays.sort(w, 1, n+1);
        Arrays.sort(c, 1, n+1);
        long sum2 = 0;
        for(int i = 1; i <= n; i ++){
            sum2 += (long) w[i] * c[i];
        }
        System.out.println(sum2 - sum1);
    }
}
