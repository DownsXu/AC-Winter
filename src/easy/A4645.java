package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A4645 {
    static int N = 100010, n, m, x;
    static int[] f = new int[N];
    static Map<Integer, Integer> last = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); m = sc.nextInt(); x = sc.nextInt();

        for (int i = 1; i <= n; i ++) {
            int a = sc.nextInt();
            last.put(a, i);
            f[i] = Math.max(f[i - 1], last.getOrDefault(a ^ x, 0));
        }

        while (m -- > 0) {
            int l = sc.nextInt(), r = sc.nextInt();
            if (l <= f[r]) System.out.println("yes");
            else System.out.println("no");
        }
    }
}