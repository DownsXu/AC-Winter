package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @BelongsProject: AC-Winter
 * @BelongsPackage: easy
 * @Author: DownsXu
 * @Date: 2023-02-16 10:01
 * @Description: TODO
 *
 *  oox0xxx oo xxx
 */
public class A3768 {
    static final int N = 110;
    static char[] s = new char[N];
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        s = in.next().toCharArray();
        int res = 0;
        for (int i = 0; i < n; i ++){
            if (s[i] != 'x') continue;
            int j = i + 1;
            while (j < n && s[j] == 'x') j ++;
            res += j - i - 2;
            i = j - 1;
        }
        System.out.println(res);
    }
}
