package easy;

import java.util.Scanner;

public class AU1555 {
    static char[] a = new char[1010], b = new char[1010];
    static String s1 = null, s2 = null;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()){
            s1 = in.next();
            s2 = in.next();
            dp();
        }
    }

    static void dp(){
        int[][] f = new int[1010][1010];

        for (int i = 1; i <= s1.length(); i++) {
            a[i] = s1.charAt(i-1);
        }
        for (int i = 1; i <= s2.length(); i++) {
            b[i] = s2.charAt(i-1);
        }

        for (int i = 1; i <= s1.length();  i++){
            for (int j = 1; j <= s2.length(); j ++){
                f[i][j] = Math.max(f[i][j-1], f[i-1][j]);
                if (a[i] == b[j]) f[i][j] = Math.max(f[i][j], f[i-1][j-1] + 1);
            }
        }
        System.out.println(f[s1.length()][s2.length()]);
    }
}
