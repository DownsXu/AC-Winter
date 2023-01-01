package easy;

import java.io.*;
import java.util.Arrays;

public class A4818 {
    static int N = 100010;
    static int[] a = new int[N];
    static int n;
    static int max = -1;
    static int k = 0;
    static int w = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(in.readLine());
        String[] str = in.readLine().split(" ");
        for(int i = 0; i < n; i ++){
            a[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(a, 0, n-1);
        for(int i = 0; i < n; i ++){
            w = a[i] * (n - i);
            if(max < w){
                max = w;
            }
        }
        System.out.println(max);
        in.close();
    }
}
