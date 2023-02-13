package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A795 {
    static int N = 100010;
    static int[] s = new int[N];

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] str1 = in.readLine().split(" ");
        int n = Integer.parseInt(str1[0]);
        int m = Integer.parseInt(str1[1]);
        String[] str = in.readLine().split(" ");

        for (int i = 1; i <= n; i ++){
            s[i] = Integer.parseInt(str[i-1]);
            s[i] = s[i-1] + s[i];
        }

        while (m -- != 0){
            String[] w= in.readLine().split(" ");
            int l = Integer.parseInt(w[0]);
            int r = Integer.parseInt(w[1]);
            System.out.println(s[r] - s[l-1]);
        }
    }
}
