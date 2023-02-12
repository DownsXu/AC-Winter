package easy;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class A1204 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        boolean[] f = new boolean[100010];
        int max = -1;
        int min = 0x3f3f3f3f;
        int cf = 0, qs = 0;
        while (n -- != 0){
            String[] s = in.readLine().split(" ");
            for (int i = 0 ;i < s.length; i ++){
                int t = Integer.parseInt(s[i]);
                max = Math.max(max, t);
                min = Math.min(min, t);
                if (f[t]) cf = t;
                f[t] = true;
            }
        }

        for (int i = min; i <= max; i ++){
            if (!f[i]) qs = i;
        }
        System.out.println(qs + " " + cf);
    }
}
