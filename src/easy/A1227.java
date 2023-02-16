package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @BelongsProject: AC-Winter
 * @BelongsPackage: easy
 * @Author: DownsXu
 * @Date: 2023-02-16 9:28
 * @Description: TODO
 */

public class A1227 {
    static final int N = 100010;
    static int[] a = new int[N];
    static int k, n;
    static Map<Integer, int[]> map = new HashMap<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        k = in.nextInt();
        for (int i = 1; i <= n; i ++){
            int h = in.nextInt();
            int w = in.nextInt();
            map.put(i, new int[]{h, w});
        }

        int l = 1, r = 100010;
        while (l < r){
            int mid = l + r >> 1;
            if (!check(mid)) r = mid;
            else l = mid + 1;
        }
        System.out.println(l-1);
    }

    public static boolean check(int b){
        int res = 0;
        for (int i = 1; i <= n; i ++){
            res += map.get(i)[0] / b * map.get(i)[1] / b;
            if (res >= k) return true;
        }
        return false;
    }
}
