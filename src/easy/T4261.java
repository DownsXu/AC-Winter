package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 孤独的照片
 */
public class T4261 {

    static int N = 500010;
    static char[] g = new char[N];
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        g = bf.readLine().toCharArray();
        int ans = 0;
        for(int i = 0; i < n; i ++){
            int l = 0;
            if(i > 0 && g[i] != g[i-1]){
                l ++;
                for(int j = i - 2; j >= 0 && g[j]!=g[i]; j --) l ++;
            }
            int r = 0;
            if(i < n - 1 && g[i] != g[i+1]){
                r ++;
                for(int j = i + 2; j < n && g[j]!=g[i]; j ++) r ++;
            }
            ans += r * l + Math.max(0, l-1) + Math.max(0, r-1);
        }
        System.out.println(ans);
    }
}
