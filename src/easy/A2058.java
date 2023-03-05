package easy;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;


public class A2058 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] a = sc.next().toCharArray();
        char[] b = sc.next().toCharArray();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            a[i] ^= 1;
            if (a.length > 1 && a[0] == '0') {
                a[i] ^= 1;
                continue;
            }
            set.add(get(a, 2));
            a[i] ^= 1;
        }

        for (int i = 0; i < b.length; i++) {
            char t = b[i];
            for (int j = 0; j < 3; j++) {
                if (t - '0' != j) {
                    b[i] = (char) (j + '0');
                    if (b.length > 1 && b[0] == '0') continue;
                    if (set.contains(get(b, 3))) {
                        System.out.println(get(b, 3));
                        return;
                    }
                }
            }
            b[i] = t;
        }
    }

    private static int get(char[] c, int b) {
        int res = 0;
        for (char val : c) res = res * b + val - '0';
        return res;
    }
}
